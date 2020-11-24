package com.web.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.web.main.model.Participant;
import com.web.main.model.Question;
import com.web.main.service.ServiceI;



@Controller
public class ParticipantController {
	
	@Autowired
	private ServiceI service;
	
	@RequestMapping("/index")
	public String m1(@RequestParam("uname")String uname,@RequestParam("pass")String pass,Model m)
	{
		m.getAttribute(uname);
		m.getAttribute(pass);
		service.getAdmin(uname, pass);
		if(uname=="admin" && pass=="admin")
		{
		return "register";
		}
		else
		{return "login";}
	}
	
	@RequestMapping(value = "/reg")
	public String m1(@ModelAttribute ("p") Participant p)
	{
		
		System.out.println("in controller");
		service.addParticipant(p);
		return "login";
	}
	
	@RequestMapping(value = "/log")
	public String m2()
	{
		return "login";
	}
	
	@RequestMapping("/register")
	public String m3()
	{
		return "register";
	}
	
	@RequestMapping("/regq")
	public String m4(@ModelAttribute("q")Question q)
	{
		service.addQuestion(q);
		return "login";
	}

}
