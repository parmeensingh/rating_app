package com.example.rating.data.service.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.rating.data.service.model.ratingModel;

@RestController
@RequestMapping("/rating")
public class ratingController {
	@GetMapping("/details/{id}")	
	public ratingModel getInfo(@PathVariable String id) {
		return new ratingModel(21,"godzilla");
	}
}
