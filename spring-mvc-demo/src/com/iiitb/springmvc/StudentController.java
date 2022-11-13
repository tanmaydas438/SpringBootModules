package com.iiitb.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {
	
	@RequestMapping("/showForm")
	public String showForm(Model model)
	{
		Student s=new Student();
		model.addAttribute("student",s);
		return "student-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm(@ModelAttribute("student")Student s)
	{
		//Student s=(Student) model.getAttribute("student");
		
		//model.addAttribute("student",s);
		System.out.println("Hello");
		return "student-confirmation";
	}
}
