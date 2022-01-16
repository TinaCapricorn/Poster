package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AfishaManagerTest {

//    private AfishaManager repository = Mockito.mock(AfishaManager.class);


    @Test
    void showMovies() {
        AfishaManager afishaManger = new AfishaManager(6);
        int expected = 6;
        int actual = afishaManger.getShowedMovies().length;
        assertEquals(expected, actual);
    }

    @Test
    void showMoreMovies() {
        AfishaManager afishaManger = new AfishaManager(13);
        int expected = 13;
        int actual = afishaManger.getShowedMovies().length;
        assertEquals(expected, actual);
    }

    @Test
    void showOverMovies() {
        AfishaManager afishaManger = new AfishaManager(18);
        int expected = 15;
        int actual = afishaManger.getShowedMovies().length;
        assertEquals(expected, actual);
    }

    @Test
    void showLessMovies() {
        AfishaManager afishaManger = new AfishaManager(-3);
        int expected = 10;
        int actual = afishaManger.getShowedMovies().length;
        assertEquals(expected, actual);
    }

    @Test
    void saveMovie() {
        AfishaManager afishaManger = new AfishaManager(10);
        afishaManger.save(new Movie(16,"Test", "Russia"));
        int expected = 16;
        int actual = afishaManger.getMovies().length;
        assertEquals(expected, actual);
    }

}