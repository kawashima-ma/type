package jp.co.type.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import jp.co.type.dto.UserDto;
import jp.co.type.dto.UserResultDto;
import jp.co.type.service.UserResultService;


@Controller
public class UserResultController {
	@Autowired
	private UserResultService resultService;

	@Autowired
	private HttpSession session;

	@RequestMapping(value = "/result", method = RequestMethod.GET)
	public String edit(Model model) {



		UserDto loginUser = (UserDto) session.getAttribute("loginUser");
//		// 編集対象のユーザー情報を取得する


//		UserResultDto userResult = resultService.getUserResult(loginUser.getId());

		UserResultDto userResult = resultService.getUserResult(2);



System.out.println(userResult.getDrivescore());
System.out.println(loginUser.getId());

		model.addAttribute("userResult", userResult);
		model.addAttribute("loginUser", loginUser);

		return "result";
	}

}
