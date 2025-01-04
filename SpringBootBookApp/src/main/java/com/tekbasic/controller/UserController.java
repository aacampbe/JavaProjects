package com.tekbasic.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.tekbasic.Username.User;
import com.tekbasic.repository.UserRepository;
@Controller
public class UserController{
@Autowired
private UserRepository userRep;
 @GetMapping("/")
 public String home(Model m) {
	 System.out.println("Check index");
	 return "index";
 }

 @GetMapping("/login")
 public String login(Model model, User user) {
  model.addAttribute("users", user);
  return "login";
 }

 @GetMapping("/register")
 public String register(Model model, User user) {
  model.addAttribute("users", user);
  return "register";
 }

 @PostMapping("/register")
 public String registerSava(@ModelAttribute("user") User user, Model model) {
	 if (userRep.findAll().contains(user)) {
		   model.addAttribute("Userexist", user);
		   return "register";
	 }
	 userRep.save(user);
	 return "redirect:/register?success";
 }
}