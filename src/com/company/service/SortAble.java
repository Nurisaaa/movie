package com.company.service;

import com.company.Movie;

import java.util.List;

public interface SortAble {
    void printAllMovies(List<Movie> movies);
    void sortByYear(List<Movie> movies);
    void sortByName(List<Movie> movies);
    void sortByDirectorName(List<Movie> movies);
}
