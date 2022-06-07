package com.company;

import com.company.service.FindAble;
import com.company.service.FindByField;
import com.company.service.SortAble;
import com.company.service.Sorting;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        FindAble findAble = new FindByField();
        SortAble sortAble = new Sorting();
        Cinema cinema = new Cinema();
        Director director = new Director("Some ","Mackinnon");
        List<Cast> casts = new ArrayList<>();
        casts.add(new Cast("Michael Sheen","Aziraphale"));
        casts.add(new Cast("David Tennant","Crowley"));

        Director director1 = new Director("Douglas ","Director");
        List<Cast> casts1 = new ArrayList<>();
        casts1.add(new Cast("Orlando Bloom","Detective"));
        casts1.add(new Cast("Some Girl","Angry Fae"));

        List<Movie> movies = new ArrayList<>();
        movies.add(new Movie("Good omens",2021,"TV Series",director,casts));
        movies.add(new Movie("Carnival Row",2019,"TV Series",director1,casts1));
        cinema.setMovies(movies);
//        findAble.findMovieByActorName(cinema.getMovies());
//        findAble.findMovieByYear(cinema.getMovies());
        sortAble.printAllMovies(cinema.getMovies());
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~`");
        sortAble.sortByDirectorName(cinema.getMovies());

    }
}
