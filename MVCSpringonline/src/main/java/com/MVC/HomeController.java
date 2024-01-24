package com.MVC;
import java.time.LocalDateTime;
import java.util.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
//@RequestMapping("/HomeController")
public class HomeController {
	//implementing model Interface
	@RequestMapping(path="/a",method=RequestMethod.GET)// RequestMapping->is used to create URL for Controller method
	public String home(Model model) {
		model.addAttribute("name","sinha");
		model.addAttribute("id",420);
		List<String> friends=new ArrayList<String>();
		friends.add("susnetty");
		friends.add("Akhilesh");
		friends.add("Avinash");
		friends.add("Divya");
		friends.add("Anjali");
		model.addAttribute("f",friends);
//		int x=10;
//		System.out.println(10);
		System.out.println("hello guys");
		return "index";
	}
	//implementing ModelAndView class
	@RequestMapping("/about")
	public ModelAndView about() {
		 ModelAndView modelAndView = new ModelAndView();
		 modelAndView.addObject("id", 125);
		 modelAndView.addObject("name", "sundarii");
		 LocalDateTime now=  LocalDateTime.now(); 
		 modelAndView.addObject("time", now);
		System.out.println(" This is  my About Controller...With ModelAndView ");
		modelAndView.setViewName("index2");
		return modelAndView;
	}
	@RequestMapping("/info")
	public String info() {
		System.out.println("hello bros");
		return "index3";
	}
}
