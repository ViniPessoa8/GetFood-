DROP DATABASE imgBD;
CREATE DATABASE imgBD;
USE imgBD;
CREATE TABLE imagem (
	codigo int not null primary key auto_increment,
    img blob not null
);

SELECT * FROM imagem;