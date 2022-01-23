package ru.netology;

public class AfishaManager {

    private int resultLength;

    private Movie[] movies = {
            new Movie(1, "1+1", "France"),
            new Movie(2, "Властелин колец", "USA"),
            new Movie(3, "Криминальное чтиво", "USA"),
            new Movie(4, "ВАЛЛ·И", "USA"),
            new Movie(5, "Карты, деньги, два ствола", "UK"),
            new Movie(6, "Унесённые призраками", "Japan"),
            new Movie(7, "Назад в будущее", "USA"),
            new Movie(8, "Достучаться до небес", "Germany"),
            new Movie(9, "Приключения Шерлока Холмса и доктора Ватсона", "USSR"),
            new Movie(10, "Темный рыцарь", "USA"),
            new Movie(11, "Терминатор 2", "USA"),
            new Movie(12, "Одержимость", "USA"),
            new Movie(13, "Жизнь прекрасна", "Italy"),
            new Movie(14, "Зеленая миля", "USA"),
            new Movie(15, "Побег из Шоушенка", "USA")
    };


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
