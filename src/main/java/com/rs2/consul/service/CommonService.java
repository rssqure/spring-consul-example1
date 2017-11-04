package com.rs2.consul.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CommonService {

	Logger logger = LogManager.getLogger(CommonService.class.getName());

    @RequestMapping("/consul/service")	
	public String service() {
		logger.trace("In common service");
        return "Hello from Consule Common Service!";		
	}
}
