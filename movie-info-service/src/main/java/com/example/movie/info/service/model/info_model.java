package com.example.movie.info.service.model;

public class info_model {
	private int movie_id;
	private String movie_name;

	
	public info_model(int movie_id, String movie_name) {
		super();
		this.movie_id = movie_id;
		this.movie_name = movie_name;
	}
	
	
	public int getMovie_id() {
		return movie_id;
	}
	public void setMovie_id(int movie_id) {
		this.movie_id = movie_id;
	}
	public String getMovie_name() {
		return movie_name;
	}
	public void setMovie_name(String movie_name) {
		this.movie_name = movie_name;
	}
	
	
	
	
}
