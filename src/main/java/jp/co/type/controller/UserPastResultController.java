package jp.co.type.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import jp.co.type.dto.UserResultDto;
import jp.co.type.service.UserResultService;

@Controller
public class UserPastResultController {
	@Autowired
	private UserResultService resultService;
//	@Autowired
//	private EditFormFactory editFormFactory;
//	@Autowired
//	private UserDtoFactory userDtoFactory;

	@RequestMapping(value = "/pastuserresults", method = RequestMethod.GET)
	public String edit(Model model) {



//		UserDto loginUser = (UserDto) session.getAttribute("loginUser");
//		// 編集対象のユーザー情報を取得する
//		UserResultDto UserResult = resultService.getEditUser(loginUser.getId());

		UserResultDto userResult = resultService.getUserResult(1);



		model.addAttribute("userResult", userResult);
//		model.addAttribute("isShowPulldown", isShowPulldown(managementForm.getIdAsInteger(),
//				((UserDto) session.getAttribute("loginUser")).getId()));
		return "pastuserresults";
	}
}
