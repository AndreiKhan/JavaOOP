package services;

import models.Movie;

public interface IFilmService {
    Movie getMovie(String movieName);
    void addMovie(String movieName);
    void editMovie(String movieName);
    void deleteMovie(String movieName);    
}
