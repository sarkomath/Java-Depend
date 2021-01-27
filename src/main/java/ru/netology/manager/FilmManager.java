package ru.netology.manager;

import ru.netology.domain.Film;

public class FilmManager {
  private Film[] items = new Film[0];

  // добавление фильма
  public void add(Film item) {
    int length = items.length + 1;
    Film[] tmp = new Film[length];
    System.arraycopy(items, 0, tmp, 0, items.length);
    int lastIndex = tmp.length - 1;
    tmp[lastIndex] = item;
    items = tmp;
  }

  // Список фильмов с выдачей в обратном порядке
  public Film[] getAll() {
    Film[] result = new Film[items.length];
    for (int i = 0; i < result.length; i++) {
      int index = items.length - i - 1;
      result[i] = items[index];
    }
    return result;
  }

  // удаление по id
  public void removeById(int id) {
    int length = items.length - 1;
    Film[] tmp = new Film[length];
    int index = 0;
    for (Film item : items) {
      if (item.getId() != id) {
        tmp[index] = item;
        index++;
      }
    }
    items = tmp;
  }
}