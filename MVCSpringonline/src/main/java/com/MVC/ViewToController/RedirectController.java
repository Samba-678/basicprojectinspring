package com.MVC.ViewToController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class RedirectController {
	//1.using redirectprefix
//	@RequestMapping("/one")
//	public String methodOne() {
//		System.out.println("This is my First Handler...");
//		return "redirect:/two";
//	}
//	
//	@RequestMapping("/two")
//	public String methodTwo() {
//		System.out.println("This is my Second Handler...");
//		return "signup";
//	}
	
	//2.using RedirectView
	@RequestMapping("/one")
	public RedirectView methodOne() {
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl("two");//relative url
		System.out.println("This is my First Handler...");
		return redirectView;
	}
	@RequestMapping("/two")
	public String methodTwo() {
		System.out.println("This is my Second Handler...");
		return "signup";
	}
}
