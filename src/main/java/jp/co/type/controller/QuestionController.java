package jp.co.type.controller;

import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import jp.co.type.dto.AnswerDto;
import jp.co.type.dto.QuestionDto;
import jp.co.type.form.AnswerForm;
import jp.co.type.service.AnswerService;
import jp.co.type.service.QuestionService;
import jp.co.type.service.ResultAnswerService;

@Controller
public class QuestionController {

	@Autowired
	private QuestionService questionService;
	@Autowired
	private AnswerService answerService;


	@RequestMapping(value= "/question", method = RequestMethod.GET)
	public String question(Model model){
		List<QuestionDto> questions = questionService.getQuestion();
		model.addAttribute("questionText" , questions );
		List<AnswerDto> answers = answerService.getAnswer();
		model.addAttribute("answerText" , answers );
		model.addAttribute("AnswerForm" , new AnswerForm() );

		model.addAttribute("Check1", getRadio1());
		model.addAttribute("Check2", getRadio2());
		model.addAttribute("Check3", getRadio3());
		model.addAttribute("Check4", getRadio4());
		return "question";
	}

	@Autowired
	private ResultAnswerService ResultAnswerService;

	@RequestMapping(value = "/question", method = RequestMethod.POST)
	public void getcheckInfo(@ModelAttribute AnswerForm form, Model model) {
		int driveScore = 0;
		int analyzeScore = 0;
		int createScore = 0;
		int volunteerScore = 0;

		String[] drive_ans = form.getDrive_ans();
		String[] analyze_ans = form.getAnalyze_ans();
		String[] create_ans = form.getCreate_ans();
		String[] volunteer_ans = form.getVolunteer_ans();

//		配列の中身を4つそれぞれ加算する
//		for(int i =0; i<=drive_ans.length; i++) {
//			driveScore += drive_ans[i];
//		}
//
//		for(int i =0; i<=analyze_ans.length; i++) {
//			analyzeScore += analyze_ans[i];
//		}
//
//		for(int i =0; i<=create_ans.length; i++) {
//			createScore += create_ans[i];
//		}
//
//		for(int i =0; i<=volunteer_ans.length; i++) {
//			volunteerScore += volunteer_ans[i];
//		}

		ResultAnswerService.resultAnswerService(driveScore,analyzeScore,createScore,volunteerScore);

		model.addAttribute("Check1", getRadio1());
		model.addAttribute("Check2", getRadio2());
		model.addAttribute("Check3", getRadio3());
		model.addAttribute("Check4", getRadio4());
	}

	private List<String> getRadio1() {
        List<String> list = new LinkedList<>();
        list.add("A");
        return list;
    }

    private List<String> getRadio2() {
        List<String> list = new LinkedList<>();
        list.add("B");
        return list;
    }

    private List<String> getRadio3() {
        List<String> list = new LinkedList<>();
        list.add("C");
        return list;
    }

    private List<String> getRadio4() {
        List<String> list = new LinkedList<>();
        list.add("D");
        return list;
    }
}