package com.springBootOTPGenerator.message;

import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TarController
{
	//  @RequestMapping(value="/Welcome" ,method=RequestMethod.GET)
	@GetMapping("/welcome1")
		public String dashBoard()
	    {
			System.out.println("The Wasted as fallows the main raws ..........");
	    	
	    	return "string displayed Message has fallows ";
		}
}
