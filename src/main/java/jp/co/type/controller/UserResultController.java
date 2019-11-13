package jp.co.type.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import jp.co.type.dto.UserResultDto;
import jp.co.type.service.UserResultService;


@Controller
public class UserResultController {
	@Autowired
	private UserResultService resultService;
//	@Autowired
//	private EditFormFactory editFormFactory;
//	@Autowired
//	private UserDtoFactory userDtoFactory;
	@Autowired
	private HttpSession session;

	@RequestMapping(value = "/result", method = RequestMethod.GET)
	public String edit(Model model) {



//		UserDto loginUser = (UserDto) session.getAttribute("loginUser");
//		// 編集対象のユーザー情報を取得する
//		UserResultDto UserResult = resultService.getEditUser(loginUser.getId());

		UserResultDto userResult = resultService.getUserResult(1);

System.out.println(userResult.getDrivescore());

//		model.addAttribute("editForm", editFormFactory.create(editUser));
//		model.addAttribute("isShowPulldown", isShowPulldown(managementForm.getIdAsInteger(),
//				((UserDto) session.getAttribute("loginUser")).getId()));
		return "result";
	}

}
