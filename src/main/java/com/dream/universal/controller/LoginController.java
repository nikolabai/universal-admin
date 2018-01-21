package com.dream.universal.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.dream.universal.domain.SysUser;
import com.dream.universal.service.WelcomeService;
import com.dream.universal.utils.RedisClient;

@Controller
public class LoginController {
	@Autowired
	private WelcomeService welcomeService;
	@Autowired  
    private RedisClient redisClinet;
	
	
	@RequestMapping(value={"/","/login"}, method = RequestMethod.GET)
    public String login(Map<String,Object> map){
		
		long id =1;
		String name=welcomeService.selectName(id);
		map.put("name", name);
		System.out.println(name);
        return "welcome";
    }
	//测试redis
	@RequestMapping(value={"/user"}, method = RequestMethod.GET)
    public String getUser(Map<String,Object> map){
		
		long id =1;
		SysUser user=welcomeService.selectUser(id);
		try {
			redisClinet.set("name", user.getEmail());
			map.put("name", redisClinet.get("name"));
			System.out.println("redis"+redisClinet.get("name"));
		} catch (Exception e) {
			e.printStackTrace();
		}  
        return "welcome";
    }

}
