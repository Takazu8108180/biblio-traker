package jp.personal.takaichi.app.bibliotraker.domain.book;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Value;

@Value
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class Author {
  
  String value;

  public static Author of(String author) {
    return new Author(author);
  }
}
