package com.MVC.ViewToController;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.MVC.Model.User;
import com.MVC.UserDao.UserService;
@Controller
public class SignUpController {
	@Autowired
	private UserService userService;
	@ModelAttribute//print commonthings in handler methods
	public void commonDataModel( Model model) {
		model.addAttribute("heading", "Learn Spring mvc");
		model.addAttribute("para", "hope you are learning springs");
	}
//process controller
	@RequestMapping("/contact")
	public String contact(Model model) {
//		model.addAttribute("heading", "Learn Spring mvc");
//		model.addAttribute("para",  "hope you are learning springs");
System.out.println("project refreshed");
		return "signup";
	}

//handler controller which will specify the final destination of signup.jsp
	@RequestMapping(path = "/process", method = RequestMethod.POST)
	public String handleFormData(@ModelAttribute User user,Model model)

	{   //not fulling form it will still be remain in same page
		if(user.getUserName().isEmpty() && user.getUserEmail().isEmpty()&& user.getUserPassword().isEmpty()) {
			return "signup";
		}
//		model.addAttribute("heading", "Learn Spring mvc");
//		model.addAttribute("para", "hope you are learning springs");
		 //userService.createUser(user);
		userService.createUser(user);
		System.out.println(user);
//		model.addAttribute("u",user.getUserName());
//		model.addAttribute("e",user.getUserEmail());
//		model.addAttribute("p",user.getUserPassword());
      return "success";

	}
	/*
	 * //handler controller which will specify the final destination of signup.jsp
	 * 
	 * @RequestMapping(path="/process",method=RequestMethod.POST) public String
	 * handleFormData(
	 * 
	 * @RequestParam("userName")String user_Name ,
	 * 
	 * @RequestParam("userEmail")String user_Email,
	 * 
	 * @RequestParam("userPassword")String user_Password, Model model)
	 * 
	 * 
	 * 
	 * { System.out.println("Your Name is "+user_Name);
	 * System.out.println("Your Email is "+user_Email);
	 * System.out.println("Your Password is "+user_Password); //process or //store
	 * the data in db model.addAttribute("un", user_Name); model.addAttribute("ue",
	 * user_Email); model.addAttribute("up", user_Password);
	 * 
	 * return "success";
	 * 
	 * }
	 */
}
