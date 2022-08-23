package com.citiustech.HibernateAss3;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import com.citiustech.DAO.DaoClass;
import com.citiustech.model.DirectorEntity;
import com.citiustech.model.MovieEntity;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        DaoClass dao = new DaoClass();
        //addmovies
        //MovieEntity movie = new MovieEntity("M1001","Home Alone","English",1990,476700000);
        //DirectorEntity director = new DirectorEntity("D101","Chris Columbus",1858);
        
        //MovieEntity movie = new MovieEntity("M1002","Home Alone","English",1992,358900000);
        //DirectorEntity director = new DirectorEntity("D101","Chris Columbus",1958);
        
        //MovieEntity movie = new MovieEntity("M1003","Baby's Day Out","English",1994,16800000);
        //DirectorEntity director = new DirectorEntity("D102","Patrick Read Johnsons",1962);
        
        //MovieEntity movie = new MovieEntity("M1004","Taare Zameen Par","Hindi",2007,13000000);
        //DirectorEntity director = new DirectorEntity("D103","Aamir khan",1965);
        
        //MovieEntity movie = new MovieEntity("M1005","Paa","Hindi",2009,4700000);
        //DirectorEntity director = new DirectorEntity("D104","R.Balki",0);
        
        //movie.setDirector(director);
        
        //dao.addMovies(movie);
        
        //Get Movie Details
        //List<MovieEntity> movies=dao.getMoviesOnLanguages("English");
       /*for(MovieEntity m: movies)
        	System.out.println(m);
        	*/
        
        //List<DirectorEntity> director=dao.getMoviesOnDirector("Aamir Khan");
        /*for(DirectorEntity d :director)
        	System.out.println(d);
        	*/
       // List<String> languages=dao.getDistinctLanguages();
        //languages.stream().forEach(System.out::println);
        
        Map<String,String> map=dao.getMovieNameAndDirectorName();
        for(Entry<String, String> entry : map.entrySet()) {
        	System.out.println(entry.getKey()+"--"+entry.getValue());
        }
    }
}
