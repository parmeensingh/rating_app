package com.example.movie.catalog.service.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.movie.catalog.service.model.*;

@RestController
@RequestMapping("/catalog")
public class MovieCatalogServiceController {
	@GetMapping("/{id}")
	public MovieCatalogServiceModel getMovieDetails(@PathVariable String id) {
		return new MovieCatalogServiceModel(1,4.5,"apes");
	}
}
