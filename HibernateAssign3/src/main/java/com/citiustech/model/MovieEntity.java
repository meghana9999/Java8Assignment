package com.citiustech.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class MovieEntity {
	@Id
	private String movieId;
	private String movieName;
	private String language;
	private int releasedIn;
	private int revenueInDollars;
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="directorId")
	private  DirectorEntity director;
	
	public MovieEntity() {
		super();
	}
	
	public MovieEntity(String movieId, String movieName, String language, int releasedIn, int revenueInDollars) {
		super();
		this.movieId = movieId;
		this.movieName = movieName;
		this.language = language;
		this.releasedIn = releasedIn;
		this.revenueInDollars = revenueInDollars;
	}
	public MovieEntity(String movieId, String movieName, String language, int releasedIn, int revenueInDollars,
			DirectorEntity director) {
		super();
		this.movieId = movieId;
		this.movieName = movieName;
		this.language = language;
		this.releasedIn = releasedIn;
		this.revenueInDollars = revenueInDollars;
		this.director = director;
	}
	public String getMovieId() {
		return movieId;
	}
	public void setMovieId(String movieId) {
		this.movieId = movieId;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public int getReleasedIn() {
		return releasedIn;
	}
	public void setReleasedIn(int releasedIn) {
		this.releasedIn = releasedIn;
	}
	public int getRevenueInDollars() {
		return revenueInDollars;
	}
	public void setRevenueInDollars(int revenueInDollars) {
		this.revenueInDollars = revenueInDollars;
	}
	public DirectorEntity getDirector() {
		return director;
	}
	public void setDirector(DirectorEntity director) {
		this.director = director;
	}
	@Override
	public String toString() {
		return "MovieEntity [movieId=" + movieId + ", movieName=" + movieName + ", language=" + language
				+ ", releasedIn=" + releasedIn + ", revenueInDollars=" + revenueInDollars + ", director=" + director
				+ "]";
	}
	
	
	
}
