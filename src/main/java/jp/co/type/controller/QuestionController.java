package jp.co.type.controller;

import java.util.ArrayList;
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

		model.addAttribute("ListA", getRadio1());
		model.addAttribute("ListB", getRadio2());
		model.addAttribute("ListC", getRadio3());
		model.addAttribute("ListD", getRadio4());
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

		List<String> drive_ans = form.getDrive_ans();
		List<String> analyze_ans = form.getAnalyze_ans();
		List<String> create_ans = form.getCreate_ans();
		List<String> volunteer_ans = form.getVolunteer_ans();

		List<Integer> int_drive_ans = changeToInt(drive_ans);
		List<Integer> int_analyze_ans = changeToInt(analyze_ans);
		List<Integer> int_create_ans = changeToInt(create_ans);
		List<Integer> int_volunteer_ans = changeToInt(volunteer_ans);


//		配列の中身を4つそれぞれ加算する
		for(int i =0; i<=int_drive_ans.size(); i++) {
			driveScore += int_drive_ans.get(i);
		}

		for(int i =0; i<=int_analyze_ans.size(); i++) {
			analyzeScore += int_analyze_ans.get(i);
		}

		for(int i =0; i<=int_create_ans.size(); i++) {
			createScore += int_create_ans.get(i);
		}

		for(int i =0; i<=int_volunteer_ans.size(); i++) {
			volunteerScore += int_volunteer_ans.get(i);
		}

		ResultAnswerService.resultAnswerService(driveScore,analyzeScore,createScore,volunteerScore);

		model.addAttribute("ListA", getRadio1());
		model.addAttribute("ListB", getRadio2());
		model.addAttribute("ListC", getRadio3());
		model.addAttribute("ListD", getRadio4());
	}

	private List<String> getRadio1() {
        List<String> list = new LinkedList<String>();
        list.add("A");
        return list;
    }

    private List<String> getRadio2() {
        List<String> list = new LinkedList<String>();
        list.add("B");
        return list;
    }

    private List<String> getRadio3() {
        List<String> list = new LinkedList<String>();
        list.add("C");
        return list;
    }

    private List<String> getRadio4() {
        List<String> list = new LinkedList<String>();
        list.add("D");
        return list;
    }

    private List<Integer> changeToInt(List<String> type_ans) {
    	List<Integer> x = new ArrayList<Integer>();
        for (int i = 0; i < type_ans.size(); i++) {
            x.add(Integer.parseInt(type_ans.get(i)));
        }
        return x;
    }
}