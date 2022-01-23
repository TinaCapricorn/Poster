package ru.netology;

import java.util.Objects;

public class Movie {
    private int id;
    private String name;
    private String country;

    public Movie(int id, String name, String country) {
        this.id = id;
        this.name = name;
        this.country = country;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Movie movie = (Movie) o;
        return id == movie.id && name.equals(movie.name) && country.equals(movie.country);
    }


}
