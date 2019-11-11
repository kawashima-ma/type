package jp.co.type.controller;

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
import jp.co.type.form.LoginForm;
import jp.co.type.service.LoginService;

@Controller
public class LoginController {
	@Autowired
	private LoginService loginService;
	@Autowired
	private HttpSession session;

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String doGet(@ModelAttribute LoginForm loginForm, Model model) {
		model.addAttribute("loginForm", loginForm);
		return "login";
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
    public String doPost(@Valid  @ModelAttribute  LoginForm loginForm, BindingResult result, Model model) {

		if(result.hasErrors()){
			model.addAttribute("loginForm", loginForm);
        		return "login";
		}

		UserDto user = loginService.login(loginForm.getLogin_id(), loginForm.getPassword());
		if(user == null) {
			result.rejectValue("login_id", "ログインに失敗しました", "ログインに失敗しました");
			return "login";
		}
		session.setAttribute("loginUser",user);
		return "redirect:question";
	}
}
