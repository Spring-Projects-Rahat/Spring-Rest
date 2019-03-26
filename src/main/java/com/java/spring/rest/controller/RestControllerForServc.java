package com.java.spring.rest.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.java.spring.rest.request.RequestVO;
import com.java.spring.rest.response.ResponseVO;

@RestController 
@RequestMapping("/request")
public class RestControllerForServc {

	 private final String sharedKey = "SHARED_KEY";
	 private static final String SUCCESS_STATUS = "success";
	 private static final String ERROR_STATUS = "error";
	 private static final int CODE_SUCCESS = 100;
	 private static final int AUTH_FAILURE = 102;
	 
	 
	 
	 @RequestMapping(value = "/pay", method = RequestMethod.POST)
	 public ResponseVO pay(@RequestParam(value = "key") String key, @RequestBody RequestVO request) {
		
		 ResponseVO response=new ResponseVO();
		 
		 if(sharedKey.equalsIgnoreCase(key))
		 {
			   int userId = request.getUserId();
			   String itemId = request.getItemId();
			   double discount = request.getDiscount();
			   response.setStatus(SUCCESS_STATUS);
			   response.setCode(CODE_SUCCESS);
			   response.setGreeting("Thanks For Using Our Service");
		 } 
		 else
		 {      
		   response.setStatus(ERROR_STATUS);
		   response.setCode(AUTH_FAILURE);
		  }
		 
		 return response;
		 
		 
		 
	 }
	
}
