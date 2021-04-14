package ru.netology.manager;

import ru.netology.domain.Film;

public class FilmManager {
    private Film[] items = new Film[0];

    public void add(Film item) {
        int length = items.length + 1;
        Film[] tmp = new Film[length];
        System.arraycopy(items, 0, tmp, 0, items.length);
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = item;
        items = tmp;
    }

    int limit = 10;

    public FilmManager() {
    }

    public FilmManager(int limit) {
        this.limit = limit;
    }

    public Film[] limit() {
        if (items.length >= limit) {
            int ost = items.length - limit; //считаем, сколько фильмов мы не добавляем
            Film[] result = new Film[items.length - ost];
            for (int i = 0; i < result.length; i++) {
                int index = items.length - i - 1;
                result[i] = items[index];
            }
            return result;
        } else {
            Film[] result = new Film[items.length];
            for (int i = 0; i < result.length; i++) {
                int index = items.length - i - 1;
                result[i] = items[index];
            }
            return result;
        }
    }
}