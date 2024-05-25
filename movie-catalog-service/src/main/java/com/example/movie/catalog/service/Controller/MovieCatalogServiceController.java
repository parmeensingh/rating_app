package com.example.movie.catalog.service.Controller;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.movie.catalog.service.model.*;

@RestController
@RequestMapping("/catalog")
public class MovieCatalogServiceController {
	
	 private static final Logger logger = Logger.getLogger( MovieCatalogServiceController.class.getName());
	@GetMapping("/{id}")
	public MovieCatalogServiceModel getMovieDetails(@PathVariable String id) {
		return new MovieCatalogServiceModel(1,4.5,"apes");
	}
	@PostMapping("/product")
	public MovieCatalogServiceModel create(@RequestBody MovieCatalogServiceModel prod) {
		logger.info("Received POST request to create product: " );
		return prod;		
	}
}
