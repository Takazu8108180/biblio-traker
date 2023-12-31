DROP TABLE IF EXISTS book;
DROP TABLE IF EXISTS records;

CREATE TABLE books(
  id VARCHAR(36) NOT NULL,
  title VARCHAR(255) NOT NULL,
  auther VARCHAR(255) NOT NULL,
  PRIMARY KEY(id)
);

CREATE TABLE records(
  id VARCHAR(36) NOT NULL,
  book_id VARCHAR(36) NOT NULL,
  genre VARCHAR(255) NOT NULL,
  score INT NOT NULL,
  report TEXT NOT NULL,
  created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
  updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY(id)
);