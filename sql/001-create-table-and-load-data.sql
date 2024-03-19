DROP TABLE IF EXISTS players;

CREATE TABLE players (
  id int unsigned AUTO_INCREMENT,
  name VARCHAR(20) NOT NULL,
  birthday DATE NOT NULL,
  ps VARCHAR(50) NOT NULL,
  PRIMARY KEY(id)
);

INSERT INTO players (name, birthday, ps) VALUES ("岩崎優", '1991-06-19', "ピッチャー");
INSERT INTO players (name, birthday, ps) VALUES ("岩貞祐太", '1991-09-05', "ピッチャー");
