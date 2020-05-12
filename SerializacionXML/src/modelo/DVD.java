package modelo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DVD
{
    private List movies = new ArrayList();

    public DVD()
    {
    }

    public List getMovies()
    {
        return movies;
    }
	//escribo un comentario xD
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
            stMovies = stMovies + unaMovie.getName() + ", ";
        }
        return stMovies;
    }
}
