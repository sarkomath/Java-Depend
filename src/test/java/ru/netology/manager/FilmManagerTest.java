package ru.netology.manager;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.domain.Film;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class FilmManagerTest {
    private FilmManager manager = new FilmManager();

    Film first = new Film(1, "1991", "action", "Action Film");
    Film second = new Film(2, "1992", "drama", "Drama Film");
    Film third = new Film(3, "1993", "horror", "Horror Film");
    Film fourth = new Film(1, "1994", "comedy", "Comedy Film");
    Film fifth = new Film(2, "1995", "thriller", "Thriller Film");
    Film sixth = new Film(3, "1996", "military", "Military Film");
    Film seventh = new Film(1, "1997", "romantic", "Romantic Film");
    Film eighth = new Film(2, "1998", "animation", "Animation Film");
    Film ninth = new Film(3, "1999", "criminal", "Criminal Film");
    Film tenth = new Film(1, "2000", "comics", "Bad Film");

    @BeforeEach
    public void setUp() {

        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);
        manager.add(eighth);
        manager.add(ninth);
        manager.add(tenth);
    }

    //добавление 10 фильмов
    @Test
    public void AddFilmToManager() {
        Film[] actual = manager.limit();
        Film[] expected = new Film[]{third, second, first};
    }

    // добавление больше чем 10
    @Test
    public void addMore() {

        Film eleventh = new Film(11, "2001", "animation", "Animation Film Again");
        Film twelfth = new Film(12, "2002", "criminal", "Criminal Film Annihilation");
        Film thirteenth = new Film(13, "2003", "horror", "Friday");

        manager.add(eleventh);
        manager.add(twelfth);
        manager.add(thirteenth);

        Film[] actual = manager.limit();
        Film[] expected = new Film[]{thirteenth, twelfth, eleventh, tenth, ninth, eighth, seventh, sixth, fifth, fourth};
    }

    //очищение менеджера
    @Test
    public void deleteAllFromManager() {

        Film[] actual = manager.limit();
        Film[] expected = new Film[]{};
    }
}