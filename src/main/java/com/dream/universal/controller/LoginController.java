package com.dream.universal.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.dream.universal.service.WelcomeService;

@Controller
public class LoginController {
	@Autowired
	private WelcomeService welcomeService;
	
	
	
	@RequestMapping(value={"/","/login"}, method = RequestMethod.GET)
    public String login(Map<String,Object> map){
		
		long id =1;
		String name=welcomeService.selectName(id);
		map.put("name", name);
		System.out.println(name);
        return "welcome";
    }

}
