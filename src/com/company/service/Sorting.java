package com.company.service;

import com.company.*;

import java.util.List;

public class Sorting implements SortAble {
    @Override
    public void printAllMovies(List<Movie> movies) {
        for (Movie m : movies) {
            System.out.println("Name: " + m.getName());
            System.out.println("Year: " + m.getYear());
            System.out.println("Description: " + m.getDescription());
            System.out.println("Director: " + m.getDirector().getName() + " " + m.getDirector().getLastName());
            System.out.print("Actors: ");
            for (Cast c : m.getCastss()) {
                System.out.println(c.getFullName()+ "with role: "+c.getRole());
            }
        }
    }

    @Override
    public void sortByYear(List<Movie> movies) {
        MovieYearComparator movieYearComparator = new MovieYearComparator();
        movies.sort(movieYearComparator);
        for (Movie m : movies) {
            System.out.println("Name: " + m.getName());
            System.out.println("Year: " + m.getYear());
            System.out.println("Description: " + m.getDescription());
            System.out.println("Director: " + m.getDirector().getName() + " " + m.getDirector().getLastName());
            System.out.print("Actors: ");
            for (Cast c : m.getCastss()) {
                System.out.println(c.getFullName()+ "with role: "+c.getRole());
            }
        }
    }

    @Override
    public void sortByName(List<Movie> movies) {
        MovieNameComparator movieNameComparator = new MovieNameComparator();
        movies.sort(movieNameComparator);
        for (Movie m : movies) {
            System.out.println("Name: " + m.getName());
            System.out.println("Year: " + m.getYear());
            System.out.println("Description: " + m.getDescription());
            System.out.println("Director: " + m.getDirector().getName() + " " + m.getDirector().getLastName());
            System.out.print("Actors: ");
            for (Cast c : m.getCastss()) {
                System.out.println(c.getFullName()+ "with role: "+c.getRole());
            }
        }
    }

    @Override
    public void sortByDirectorName(List<Movie> movies) {
        MovieDirectorComparator movieDirectorComparator = new MovieDirectorComparator();
        movies.sort(movieDirectorComparator);
        for (Movie m : movies) {
            System.out.println("Name: " + m.getName());
            System.out.println("Year: " + m.getYear());
            System.out.println("Description: " + m.getDescription());
            System.out.println("Director: " + m.getDirector().getName() + " " + m.getDirector().getLastName());
            System.out.print("Actors: ");
            for (Cast c : m.getCastss()) {
                System.out.println(c.getFullName()+ "with role: "+c.getRole());
            }
        }
    }


}
