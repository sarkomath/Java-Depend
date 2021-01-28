package ru.netology.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor

public class Film {
    // убираем лишние поля, т.к. дата-полей в задании нужно не много
    private int id; // id в менеджере
    private String Date; // дата выхода
    private String Genre; // жанр
    private String productName; // название фильма
}
