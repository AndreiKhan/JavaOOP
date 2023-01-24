package services;

import java.util.ArrayList;

import models.Movie;

public class FilmService implements IFilmService, IDataService {

    @Override
    public Movie getMovie(String movieName) {
        return null;
    }

    @Override
    public void addMovie(String movieName) {
        Movie movie = new Movie();
        movie.setName(movieName);

        if(GetAllMovies().contains(movie)) {
            System.out.println("Этот фильм уже есть в списке");
            
        } else {
            GetAllMovies().add(movie);
        }
    }

    @Override
    public void editMovie(String movieName) {
        Movie movie = new Movie();
        movie.setName(movieName);

        if(GetAllMovies().contains(movie)) {
            GetAllMovies().remove(movie);

        } else {
            System.out.println("Этого фильма нет в списке");
        }
    }

    @Override
    public void deleteMovie(String movieName) {
        Movie movie = new Movie();
        movie.setName(movieName);
        
        if(GetAllMovies().contains(movie)) {
            GetAllMovies().remove(movie);
        } else {
            System.out.println("Этого фильма нет в списке");
        }
    }

    @Override
    public ArrayList<Movie> GetAllMovies() {
        ArrayList<Movie> movies = new ArrayList<Movie>();
        return movies;
    }
}
