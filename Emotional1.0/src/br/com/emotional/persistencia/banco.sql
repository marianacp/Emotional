drop database if exists Emotional_BD;


create database Emotional_BD;

use Emotional_BD;


CREATE TABLE Emocao (
Id_emocao INT PRIMARY KEY auto_increment,
Nome_emocao VARCHAR(15) NOT NULL
);

CREATE TABLE Estilo_musical (
Id_estilo_musical INT PRIMARY KEY auto_increment,
Nome_estilo_musical VARCHAR(45) not null
);

CREATE TABLE Status (
Cod_status INT PRIMARY KEY auto_increment,
Descricao_status VARCHAR(45) not null
);


CREATE TABLE Usuario (
Id_usu INT PRIMARY KEY auto_increment,
Nome VARCHAR(45) not null,
email VARCHAR(45),
Data_nascimento date not null,
CPF VARCHAR(45) not null,
Ativo BIT DEFAULT 0,
Premium BIT DEFAULT 0,
Senha VARCHAR(45) not null,
Login VARCHAR(45) not null,
Foto VARCHAR(80),
Id_emocao INT ,
FOREIGN KEY(Id_emocao) REFERENCES Emocao (Id_emocao)
);

CREATE TABLE Artista (
Id_Artista INT PRIMARY KEY auto_increment,
Id_usu INT,
Id_estilo_musical INT,
FOREIGN KEY(Id_usu) REFERENCES Usuario (Id_usu),
FOREIGN KEY(Id_estilo_musical) REFERENCES Estilo_musical (Id_estilo_musical)
);


CREATE TABLE Administrador (
Id_adm INT PRIMARY KEY auto_increment,
Id_usu INT,
FOREIGN KEY(Id_usu) REFERENCES Usuario (Id_usu)
);

CREATE TABLE Ouvinte (
Id_cliente INT PRIMARY KEY auto_increment,
Id_usu INT,
FOREIGN KEY(Id_usu) REFERENCES Usuario (Id_usu)
);

CREATE TABLE Lista_Amigos (
ID_Lista_Amigos INT PRIMARY KEY auto_increment,
id_solicitante INT NOT NULL,
id_solicitado INT NOT NULL,
confirmacao BIT DEFAULT 0,
FOREIGN KEY(id_solicitante) REFERENCES Usuario (Id_usu),
FOREIGN KEY(id_solicitado) REFERENCES Usuario (Id_usu)	
);


CREATE TABLE Musica (
Id_musica INT PRIMARY KEY auto_increment,
Arquivo_musica VARCHAR(45) not null,
Titulo_musica VARCHAR(45) not null,
Tempo_musica INT not null,
Id_emocao INT not null,
Id_estilo_musical INT not null,
Id_Artista INT not null,
FOREIGN KEY(Id_emocao) REFERENCES Emocao (Id_emocao),
FOREIGN KEY(Id_estilo_musical) REFERENCES Estilo_musical (Id_estilo_musical),
FOREIGN KEY(Id_Artista) REFERENCES Artista (Id_Artista)
);

CREATE TABLE Usuario_estilo_musical (
Id_Usuario_estilo_musical INT PRIMARY KEY auto_increment,
Id_estilo_musical INT,
Id_usu INT,
FOREIGN KEY(Id_estilo_musical) REFERENCES Estilo_musical (Id_estilo_musical),
FOREIGN KEY(Id_usu) REFERENCES Usuario (Id_usu)
);

CREATE TABLE Aprovacao_musica (
Id_Aprovacao_musica INT PRIMARY KEY auto_increment,
Id_musica INT,
Id_adm INT,
Cod_status INT,
FOREIGN KEY(Id_musica) REFERENCES Musica (Id_musica),
FOREIGN KEY(Id_adm) REFERENCES Administrador (Id_adm)
);


CREATE TABLE Playlist (
Id_playlist INT PRIMARY KEY auto_increment,
Nome_playList VARCHAR(45) not null,
Tempo_playlist INT not null,
Id_usu INT,
FOREIGN KEY(Id_usu) REFERENCES Usuario (Id_usu)
);


CREATE TABLE Musica_playlist (
Id_Musica_playlist INT PRIMARY KEY auto_increment,
Id_musica INT,
Id_playlist INT,
FOREIGN KEY(Id_musica) REFERENCES Musica (Id_musica),
FOREIGN KEY(Id_playlist) REFERENCES Playlist (Id_playlist)
);





CREATE TABLE Classifica (
Id_Classifica INT PRIMARY KEY auto_increment,
Id_usu INT not null,
Id_musica INT not null,
Id_emocao INT not null,
FOREIGN KEY(Id_usu) REFERENCES Usuario (Id_usu),
FOREIGN KEY(Id_musica) REFERENCES Musica (Id_musica),
FOREIGN KEY(Id_emocao) REFERENCES Emocao (Id_emocao)
);

