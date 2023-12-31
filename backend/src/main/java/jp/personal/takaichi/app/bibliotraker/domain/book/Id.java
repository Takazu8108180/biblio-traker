package jp.personal.takaichi.app.bibliotraker.domain.book;

import java.util.UUID;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Value;
import lombok.val;

@Value
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class Id {
  
  String value;

  public static Id of(String id) {
    return new Id(id);
  }

  public static Id generate() {
    val uuid = UUID.randomUUID().toString();

    return Id.of(uuid);
  }
}
