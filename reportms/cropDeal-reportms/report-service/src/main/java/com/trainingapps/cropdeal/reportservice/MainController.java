package com.trainingapps.cropdeal.reportservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
	
	@GetMapping("/report")
	public String getReport() {
		return "Report Displayed successfully";
	}

}
