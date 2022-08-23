package com.citiustech.DAO;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.citiustech.model.DirectorEntity;
import com.citiustech.model.MovieEntity;
import com.citiustech.util.HibernateUtil;

public class DaoClass {
	
	
	
	public void addMovies(MovieEntity movie) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
	       Session session = sessionFactory.openSession();
		//Session session = sessionFactory.getCurrentSession();
		System.out.println(session);
	       
	       session.beginTransaction();
	       session.save(movie);
	      // System.out.println(movie);
	       session.getTransaction().commit();
	}
	
	public List<MovieEntity> getMoviesOnLanguages(String language){
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		
		List<MovieEntity> movies;
		Session session = sessionFactory.openSession();
		Query query=session.createQuery("from MovieEntity where language=:l");
		query.setParameter("l", language);
		movies=query.getResultList();
		
		return movies;
		
	}
	
	public List<DirectorEntity> getMoviesOnDirector(String director){
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		List<DirectorEntity> dir;
		Session session = sessionFactory.openSession();
		Query query=session.createQuery("from DirectorEntity where directorName=:d");
		query.setParameter("d", director);
		dir=query.getResultList();
		
		return dir;
		
	}
	
	public void deleteMovie() {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
	    Session session = sessionFactory.openSession();
	    
	    MovieEntity movie = session.get(MovieEntity.class, "M1002");
	    session.beginTransaction();
	    session.delete(movie);
	    System.out.println(movie);
	    session.getTransaction().commit();
	}
	
	public void updateMovie() {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
	    Session session = sessionFactory.openSession();
	     
		MovieEntity movie = session.get(MovieEntity.class, "M1004");
		movie.setRevenueInDollars(movie.getRevenueInDollars()+10000);
			session.beginTransaction();
	       session.save(movie);
	       System.out.println(movie);
	       session.getTransaction().commit();
	}
	
	@SuppressWarnings("unchecked")
	public List<String> getDistinctLanguages(){
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		List<MovieEntity> movies;
		Session session = sessionFactory.openSession();
		Query query=session.createQuery("from MovieEntity");
		movies=query.getResultList();
		
		List<String> languages = movies.stream().map(m->m.getLanguage()).collect(Collectors.toList());
		languages = languages.stream().distinct().collect(Collectors.toList());
		
		return languages ;
	}
	
	public Map<String,String> getMovieNameAndDirectorName(){
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		List<MovieEntity> movies;
		Session session = sessionFactory.openSession();
		Query query=session.createQuery("from MovieEntity");
		movies=query.getResultList();
		
		Map<String,String> map = new HashMap();
		
		for(MovieEntity m : movies) {
			map.put(m.getMovieName(),m.getDirector().getDirectorName());
		}
		
		return map;
	}
}
