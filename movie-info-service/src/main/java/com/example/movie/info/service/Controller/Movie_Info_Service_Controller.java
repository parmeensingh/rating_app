package com.example.movie.info.service.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.movie.info.service.model.info_model;

@RestController
@RequestMapping("/info")
public class Movie_Info_Service_Controller {
	@GetMapping("/getMovie")	
	public info_model getInfo(@RequestParam String id) {
		return new info_model(1,"king kong");
	}
}
