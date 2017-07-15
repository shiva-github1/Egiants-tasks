package com.upload.springboot.controller;

import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api")
public class UploadController {

	public static final Logger logger = LoggerFactory.getLogger(UploadController.class);

	@RequestMapping(method = RequestMethod.POST)
	public String uploadJson(@RequestBody String jsonData) {
		logger.info("jsonData is : {}", jsonData);
			
		
		return jsonData;
	}
	
	
}