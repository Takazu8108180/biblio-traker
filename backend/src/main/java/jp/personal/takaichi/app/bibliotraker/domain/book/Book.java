package jp.personal.takaichi.app.bibliotraker.domain.book;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE, staticName = "of")
public class Book {
  
  private final Id id;

  private Title title;

  private Author author;
}
