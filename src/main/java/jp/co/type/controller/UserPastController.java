package jp.co.type.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import jp.co.type.dto.UserResultDto;
import jp.co.type.service.UserResultService;

@Controller
public class UserPastController {

	@Autowired
	private UserResultService resultService;
//	@Autowired
//	private EditFormFactory editFormFactory;
//	@Autowired
//	private UserDtoFactory userDtoFactory;
	@Autowired
	private HttpSession session;




	@RequestMapping(value = "/userPast", method = RequestMethod.GET)
	public String past(Model model, @RequestParam("user_id") int num) {

		List<UserResultDto> userpastResults = resultService.getUserResultAll(num);

		model.addAttribute("userpastResults",userpastResults);
//		model.addAttribute("editForm", editFormFactory.create(editUser));
//		model.addAttribute("isShowPulldown", isShowPulldown(managementForm.getIdAsInteger(),
//				((UserDto) session.getAttribute("loginUser")).getId()));
		return "/userPast";
	}

}
