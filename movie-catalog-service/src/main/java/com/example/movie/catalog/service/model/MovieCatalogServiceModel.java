package com.example.movie.catalog.service.model;


public class MovieCatalogServiceModel {
	private int id;
	private double rating;
	private String name;
	
	
	public MovieCatalogServiceModel(int id, double rating, String name) {
		super();
		this.id = id;
		this.rating = rating;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
	
	
}
