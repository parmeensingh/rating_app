package com.example.rating.data.service.Controller;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.rating.data.service.model.ratingModel;


@RestController
@RequestMapping("/rating")
public class ratingController {
	Logger logger = LogManager.getLogger(getClass());
	Exception e= new RuntimeException("this is first error");
	@GetMapping("/details/{id}")	
	public ratingModel getInfo(@PathVariable String id) {
		logger.info("first log");
		logger.error("first error");
		return new ratingModel(21,"godzilla");
	}
}
