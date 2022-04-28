package com.app.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.dto.Request;
import com.app.dto.Response;

@RestController
@RequestMapping
public class HomeController {

	public HomeController() {
		System.out.println("in ctor of " + getClass());
	}
	
	@PostMapping("/bfhl")
	public Response testcase(@RequestBody Request request) {
		System.out.println("in testcase ");
		Response resp=new Response();
		String[] obj=request.getInput();
		int place1=0;
		int place2=0;
		int[] num=new int[request.getInput().length];
		String[] character=new String[request.getInput().length];
		for(int i=0;i<request.getInput().length;i++)
		{
			//System.out.println(obj[i]);
			if(Character.isLetter(obj[i].charAt(0))) {	
				//System.out.println(obj[i].charAt(0));
				character[place1++]=obj[i];
			}else {
				num[place2++]=Integer.parseInt(obj[i]);
			}
		}
		
		resp.setStatus(true);
		resp.setUser_id("Ashutosh_Gawande_06111998");
		resp.setEmail("gawandeashu98@gmail.com");
		resp.setRoll_number("PD0834");
		resp.setNumber(num);
		resp.setAlphabates(character);
		
//		response.set_success(true);
//		response.setAlphabets(alphabets);
//		response.setNumbers(num);
//		response.setEmail("shri78rudrawar80@gmail.com");
//		response.setRoll_number("PD0162");
//		response.setUser_id("shrinivas_rudrawar_210941220183");
		return resp;
	}
}
