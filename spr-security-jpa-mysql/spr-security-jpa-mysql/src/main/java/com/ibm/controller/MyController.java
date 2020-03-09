package com.ibm.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

	@RequestMapping("/")
	String getMessage() {
		return "Hello everyone...";
	}
	
	@RequestMapping("/test")
	String getMessageTest() {
		return "Hello Test...";
	}
	
	@RequestMapping("/users")
	String getMesageForUsers() {
		return "Hello user, you are now logged in...";
	}
	
	@RequestMapping("/admin")
	String getMessageForAdmin() {
		return "Hello Admin...";
	}
	
//	@RequestMapping("/403")
//	String getAccessDeniedMessage() {
//		return "You are not authorized to view contents of this page...";
//	}
	
}
