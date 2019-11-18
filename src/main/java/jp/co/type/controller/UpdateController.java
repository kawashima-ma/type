package jp.co.type.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import jp.co.type.dto.UserDto;
import jp.co.type.dto.factory.UserDtoFactory;
import jp.co.type.form.UpdateForm;
import jp.co.type.service.UpdateService;



@Controller
public class UpdateController {
	@Autowired
	private UpdateService updateService;
	@Autowired
	private UserDtoFactory userDtoFactory;

	@RequestMapping(value = "/update", method = RequestMethod.GET)
	public String doGet(@ModelAttribute UpdateForm updateForm, Model model, HttpServletRequest request) {
		HttpSession session = request.getSession();
		UserDto loginUser = (UserDto) session.getAttribute("loginUser");
		model.addAttribute("updateForm", updateForm);
		model.addAttribute("user",loginUser);
		return "update";
	}

	@RequestMapping(value = "/update", method = RequestMethod.POST)
    public String doPost(@Valid  @ModelAttribute  UpdateForm updateForm,
    		BindingResult result, Model model,HttpServletRequest request) {
		if(result.hasErrors()){
			model.addAttribute("updateForm", updateForm);
        		return "update";
		}

		String password = updateForm.getPassword();
		String confirm_password = updateForm.getConfirm_password();
		if(!(password.equals(confirm_password))) {
			model.addAttribute("errorMessage","パスワードと確認用パスワードが一致しません");
			System.out.println("焼き芋");
			return "update";
		}

		HttpSession session = request.getSession();
		UserDto loginUser = (UserDto) session.getAttribute("loginUser");
		model.addAttribute("updateForm", updateForm);
		model.addAttribute("user",loginUser);
		updateService.updateUser(userDtoFactory.create(updateForm,loginUser.getId()));

		return "redirect:question";

	}


}
