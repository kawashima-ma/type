package jp.co.type.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import jp.co.type.dto.AnswerDto;
import jp.co.type.dto.QuestionDto;
import jp.co.type.service.AnswerService;
import jp.co.type.service.QuestionService;

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
		return "question";
	}

}