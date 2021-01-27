package ru.netology.manager;

import org.junit.jupiter.api.Test;
import ru.netology.domain.Film;

import static org.junit.jupiter.api.Assertions.*;

public class FilmManagerTestNonEmpty {

  @Test
  public void shouldRemoveIfExists() {
    FilmManager manager = new FilmManager();
    int idToRemove = 1;
    Film first = new Film(1, 1, "action", "Бладшот");
    Film second = new Film(2, 2, "cartoon", "Вперед");
    Film third = new Film(3, 3, "comedy", "Отель <<Белград>>");
    Film fourth = new Film(4, 4, "action", "Джентельмены");
    Film fifth = new Film(5, 5, "horror", "Человек-невидимка");
    Film sixth = new Film(6, 6, "cartoon", "Тролли. Мировой тур");
    Film seventh = new Film(7, 7, "comedy", "Номер один");
    manager.add(first);
    manager.add(second);
    manager.add(third);
    manager.add(fourth);
    manager.add(fifth);
    manager.add(sixth);
    manager.add(seventh);

    manager.removeById(idToRemove);

    Film[] actual = manager.getAll();
    Film[] expected = new Film[]{seventh, sixth, fifth, fourth, third, second};

    assertArrayEquals(expected, actual);
  }

  @Test
  public void shouldNotRemoveIfNotExists() {
    FilmManager manager = new FilmManager();
    int idToRemove = 4;
    Film first = new Film(1, 1, "action", "Бладшот");
    Film second = new Film(2, 2, "cartoon", "Вперед");
    Film third = new Film(3, 3, "comedy", "Отель <<Белград>>");
    Film fourth = new Film(4, 4, "action", "Джентельмены");
    Film fifth = new Film(5, 5, "horror", "Человек-невидимка");
    Film sixth = new Film(6, 6, "cartoon", "Тролли. Мировой тур");
    Film seventh = new Film(7, 7, "comedy", "Номер один");
    manager.add(first);
    manager.add(second);
    manager.add(third);
    manager.add(fourth);
    manager.add(fifth);
    manager.add(sixth);
    manager.add(seventh);

    manager.removeById(idToRemove);

    Film[] actual = manager.getAll();
    Film[] expected = new Film[]{seventh, sixth, fifth, third, second, first};

    assertArrayEquals(expected, actual);
  }
}