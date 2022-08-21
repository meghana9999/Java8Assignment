package com.citiustech.HibernateAssign1;

import com.citiustech.DAO.MovieDAO;
import com.citiustech.model.Movie;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       System.out.println( "Hello World!" );
        
       Movie movie = new Movie("102","xyz","telugu",2020,25000);
       MovieDAO dao = new MovieDAO();
       
      // dao.addMovie(movie);
       
       //Movie m=dao.getMovieDetails();
       //System.out.println(m);
      
       //dao.updateMovie();
       
      // dao.deleteMovie();
    }
}
