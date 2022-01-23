package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AfishaManagerTest {

//    private AfishaManager repository = Mockito.mock(AfishaManager.class);


    @Test
    void showMovies() {
        AfishaManager afishaManger = new AfishaManager(6);
        Movie[] movies = {
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
        afishaManger.setMovies(movies);
        Movie[] expected = {
                new Movie(15, "Побег из Шоушенка", "USA"),
                new Movie(14, "Зеленая миля", "USA"),
                new Movie(13, "Жизнь прекрасна", "Italy"),
                new Movie(12, "Одержимость", "USA"),
                new Movie(11, "Терминатор 2", "USA"),
                new Movie(10, "Темный рыцарь", "USA")
        };
        Movie[] actual = afishaManger.getShowedMovies();
        assertArrayEquals(expected, actual);
    }

    @Test
    void showMoreMovies() {
        AfishaManager afishaManger = new AfishaManager(13);
        Movie[] movies = {
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
        afishaManger.setMovies(movies);
        Movie[] expected = {
                new Movie(15, "Побег из Шоушенка", "USA"),
                new Movie(14, "Зеленая миля", "USA"),
                new Movie(13, "Жизнь прекрасна", "Italy"),
                new Movie(12, "Одержимость", "USA"),
                new Movie(11, "Терминатор 2", "USA"),
                new Movie(10, "Темный рыцарь", "USA"),
                new Movie(9, "Приключения Шерлока Холмса и доктора Ватсона", "USSR"),
                new Movie(8, "Достучаться до небес", "Germany"),
                new Movie(7, "Назад в будущее", "USA"),
                new Movie(6, "Унесённые призраками", "Japan"),
                new Movie(5, "Карты, деньги, два ствола", "UK"),
                new Movie(4, "ВАЛЛ·И", "USA"),
                new Movie(3, "Криминальное чтиво", "USA"),
        };
        Movie[] actual = afishaManger.getShowedMovies();
        assertArrayEquals(expected, actual);
    }

    @Test
    void showOverMovies() {
        AfishaManager afishaManger = new AfishaManager(18);
        Movie[] movies = {
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
        afishaManger.setMovies(movies);
        Movie[] expected = {
                new Movie(15, "Побег из Шоушенка", "USA"),
                new Movie(14, "Зеленая миля", "USA"),
                new Movie(13, "Жизнь прекрасна", "Italy"),
                new Movie(12, "Одержимость", "USA"),
                new Movie(11, "Терминатор 2", "USA"),
                new Movie(10, "Темный рыцарь", "USA"),
                new Movie(9, "Приключения Шерлока Холмса и доктора Ватсона", "USSR"),
                new Movie(8, "Достучаться до небес", "Germany"),
                new Movie(7, "Назад в будущее", "USA"),
                new Movie(6, "Унесённые призраками", "Japan"),
                new Movie(5, "Карты, деньги, два ствола", "UK"),
                new Movie(4, "ВАЛЛ·И", "USA"),
                new Movie(3, "Криминальное чтиво", "USA"),
                new Movie(2, "Властелин колец", "USA"),
                new Movie(1, "1+1", "France")
        };
        Movie[] actual = afishaManger.getShowedMovies();
        assertArrayEquals(expected, actual);
    }

    @Test
    void showLessMovies() {
        AfishaManager afishaManger = new AfishaManager(-3);
        Movie[] movies = {
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
        afishaManger.setMovies(movies);
        Movie[] expected = {
                new Movie(15, "Побег из Шоушенка", "USA"),
                new Movie(14, "Зеленая миля", "USA"),
                new Movie(13, "Жизнь прекрасна", "Italy"),
                new Movie(12, "Одержимость", "USA"),
                new Movie(11, "Терминатор 2", "USA"),
                new Movie(10, "Темный рыцарь", "USA"),
                new Movie(9, "Приключения Шерлока Холмса и доктора Ватсона", "USSR"),
                new Movie(8, "Достучаться до небес", "Germany"),
                new Movie(7, "Назад в будущее", "USA"),
                new Movie(6, "Унесённые призраками", "Japan"),
        };
        Movie[] actual = afishaManger.getShowedMovies();
        assertArrayEquals(expected, actual);
    }

    @Test
    void saveMovie() {
        AfishaManager afishaManger = new AfishaManager(10);
        Movie[] movies = {
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
        afishaManger.setMovies(movies);
        afishaManger.save(new Movie(16,"Test", "Russia"));
        int expected = 16;
        int actual = afishaManger.getMovies().length;
        assertEquals(expected, actual);
    }

    @Test
    void MovieEquals(){
        Movie movie1 = new Movie(1, "1+1", "France");
        Movie movie2 = new Movie(1, "1+1", "France");
        boolean expected = true;
        boolean actual = movie1.equals(movie2);
    }

    @Test
    void MovieNotEquals(){
        Movie movie1 = new Movie(1, "1+1", "France");
        Movie movie2 = new Movie(4, "ВАЛЛ·И", "USA");
        boolean expected = false;
        boolean actual = movie1.equals(movie2);
    }

}