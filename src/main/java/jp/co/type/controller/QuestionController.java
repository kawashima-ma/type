package jp.co.type.controller;

import java.util.LinkedList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import jp.co.type.dto.AnswerDto;
import jp.co.type.dto.QuestionDto;
import jp.co.type.dto.UserDto;
import jp.co.type.form.AnswerForm;
import jp.co.type.service.AnswerService;
import jp.co.type.service.QuestionService;
import jp.co.type.service.ResultAnswerService;
import jp.co.type.service.UserResultService;

@Controller
public class QuestionController {

	@Autowired
	private QuestionService questionService;
	@Autowired
	private AnswerService answerService;
	@Autowired
	private UserResultService resultService;


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
	@Autowired
	private HttpSession session;

	@RequestMapping(value = "/a", method = RequestMethod.POST)
	public String getcheckInfo(@ModelAttribute AnswerForm form, Model model) {
		int driveScore = 0;
		int analyzeScore = 0;
		int createScore = 0;
		int volunteerScore = 0;

		List<String> point2 = form.getPoint2lists();
		List<String> point1 = form.getPoint1lists();


//		配列の中身を4つそれぞれ加算する
		for(int i =1; i<=point2.size()-1; i++) {
			if(point2.get(i).equals("A")) {
				driveScore += 2;
			}
			if(point2.get(i).equals("B")) {
				analyzeScore += 2;
			}
			if(point2.get(i).equals("C")) {
				createScore += 2;
			}
			if(point2.get(i).equals("D")) {
				volunteerScore += 2;
			}
		}

		for(int i =1; i<=point1.size()-1; i++) {
			if(point1.get(i).equals("A")) {
				driveScore += 1;
			}
			if(point1.get(i).equals("B")) {
				analyzeScore += 1;
			}
			if(point1.get(i).equals("C")) {
				createScore += 1;
			}
			if(point1.get(i).equals("D")) {
				volunteerScore += 1;
			}
		}



		UserDto loginUser =(UserDto)session.getAttribute("loginUser");
		int loginUser_id = loginUser.getId();
		ResultAnswerService.resultAnswerService(loginUser_id,driveScore,analyzeScore,createScore,volunteerScore);

		model.addAttribute("ListA", getRadio1());
		model.addAttribute("ListB", getRadio2());
		model.addAttribute("ListC", getRadio3());
		model.addAttribute("ListD", getRadio4());

//		UserResultDto userResult = resultService.getUserResult(loginUser.getId());

//		UserResultDto userResult = resultService.getUserResult(loginUser.getId());


//		System.out.println(userResult.getDrivescore());
//		System.out.println(loginUser.getId());


//		model.addAttribute("userResult", userResult);

		return "result";
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