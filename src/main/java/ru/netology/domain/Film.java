package ru.netology.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Film {
  // убираем лишние поля, т.к. дата-полей в задании нужно не много
  private int id; // id в менеджере
  private int filmId; // id фильма
  private String genre; // жанр
  private String productName; // название фильма
}
