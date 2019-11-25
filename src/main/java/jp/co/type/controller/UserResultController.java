package jp.co.type.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import jp.co.type.dto.UserDto;
import jp.co.type.dto.UserResultDto;


@Controller
public class UserResultController {
		@Autowired
	private HttpSession session;

	@RequestMapping(value = "/result", method = RequestMethod.GET)
	public String edit(Model model) {



		UserDto loginUser = (UserDto) session.getAttribute("loginUser");
		UserResultDto userResult = (UserResultDto) session.getAttribute("userResult");

		model.addAttribute("userResult", userResult);
		model.addAttribute("userResult", userResult);
		model.addAttribute("loginUser", loginUser);

		return "result";
	}

}
