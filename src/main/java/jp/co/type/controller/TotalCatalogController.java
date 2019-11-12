package jp.co.type.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import jp.co.type.service.TotalCatalogService;

@Controller
public class TotalCatalogController {
	@Autowired
	private TotalCatalogService service;
	@RequestMapping(value = "/total", method = RequestMethod.GET)
	public String doGet(Model model) {
		model.addAttribute("users", service.getAllNew());
		//タイプテーブルと紐付けしなくちゃ

		model.addAttribute("type_names",service.getTypeName());
		return "total";
	}

}
