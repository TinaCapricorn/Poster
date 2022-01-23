package ru.netology;

public class AfishaManager {

    private int resultLength;

    private Movie[] movies;

    public void setMovies(Movie[] movies) {
        this.movies = movies;
    }

    public AfishaManager(int resultLength) {
        if (resultLength > 0) {
            this.resultLength = resultLength;
        } else {
            this.resultLength = 10;
        }
    }


    public Movie[] getMovies() {
        return movies;
    }

    public Movie[] getShowedMovies() {
        int maxLength = this.resultLength;
        if (maxLength > this.movies.length){
            maxLength = this.movies.length;
        }
        int lastIndex = this.movies.length - 1;
        Movie[] showedMovies = new Movie[maxLength];
        for (int i = 0; i < maxLength; i++) {
            showedMovies[i] = this.movies[lastIndex];
            lastIndex--;
        }
        return showedMovies;
    }

    public void save(Movie movie){
        int length = this.movies.length + 1;
        Movie[] films = new Movie[length];
        System.arraycopy(movies, 0, films, 0, movies.length);
        int lastIndex = films.length - 1;
        films[lastIndex] = movie;
        movies = films;
    }



}
