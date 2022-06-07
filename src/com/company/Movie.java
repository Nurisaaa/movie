package com.company;

import java.util.List;

public class Movie {
    private String name;
    private int year;
    private String description;
    private Director director;
    private List<Cast> casts;

    public Movie(String name, int year, String description, Director director, List<Cast> castss) {
        this.name = name;
        this.year = year;
        this.description = description;
        this.director = director;
        this.casts = castss;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    public List<Cast> getCastss() {
        return casts;
    }

    public void setCastss(List<Cast> castss) {
        this.casts = castss;
    }
}
