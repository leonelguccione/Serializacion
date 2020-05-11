package modelo;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DVD implements Serializable
{
    private List movies = new ArrayList();

    public List getMovies()
    {
        return movies;
    }

    public void setMovies(List movies)
    {
        this.movies = movies;
    }

    public String toString()
    {
        String stMovies = "";
        Iterator iter = getMovies().iterator();
        while(iter.hasNext())
        {
            Movie unaMovie = (Movie)iter.next();
            stMovies = stMovies + unaMovie.toString();
        }
        return stMovies;
    }
}
