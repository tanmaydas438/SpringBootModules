package com.iiitb.springmvc;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	
	
	//for trimming white spaces
	@InitBinder
	public void initBinder(WebDataBinder dataBinder)
	{
		StringTrimmerEditor ed=new StringTrimmerEditor(true);
		dataBinder.registerCustomEditor(String.class, ed);
	}
	@RequestMapping("/showForm")
	public String showFrom(Model model)
	{
		Customer c=new Customer();
		model.addAttribute("customer",c);
		return "customer-form";
	}
	
	@RequestMapping("/processForm")
	public String processFrom(@Valid @ModelAttribute("customer") Customer customer,BindingResult result)
	{
		System.out.println(result.hasErrors());
		if(result.hasErrors())
			return "customer-form";
		else
			return "customer-confirmation";
	}
}
