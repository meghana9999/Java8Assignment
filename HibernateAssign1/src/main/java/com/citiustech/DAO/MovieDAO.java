package com.citiustech.DAO;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.citiustech.model.Movie;
import com.citiustech.util.HibernateUtil;

public class MovieDAO {
	
	public MovieDAO() {
		super();
	}

	public void addMovie(Movie movie) {
		  SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
	       Session session = sessionFactory.openSession();
	       
	       session.beginTransaction();
	       session.save(movie);
	      // System.out.println(movie);
	       session.getTransaction().commit();
	       
	}
	
	public void deleteMovie() {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
	    Session session = sessionFactory.openSession();
	    
	    Movie movie = session.get(Movie.class, "102");
	    session.beginTransaction();
	    session.delete(movie);
	    System.out.println(movie);
	    session.getTransaction().commit();
	}
	
	public void updateMovie() {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
	    Session session = sessionFactory.openSession();
	     
		Movie movie = session.get(Movie.class, "101");
		movie.setRevenueInDollars(movie.getRevenueInDollars()+10000);
			session.beginTransaction();
	       session.save(movie);
	       System.out.println(movie);
	       session.getTransaction().commit();
	}
	
	public Movie getMovieDetails() {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
	     Session session = sessionFactory.openSession();
	     
		Movie movie = session.get(Movie.class, "101");
		return movie;
	}
}
