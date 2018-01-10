package com.zyd.security.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.zyd.security.model.Msg;

@Controller
public class HomeController {
	@RequestMapping("/")
	public String index(Model model) {
		Msg msg = new Msg("测试标题", "测试内容", "额外内容，只对管理员显示");
		model.addAttribute("msg", msg);
		return "home";
	}
}
