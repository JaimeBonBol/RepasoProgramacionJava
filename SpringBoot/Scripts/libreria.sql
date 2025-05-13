-- Migrations will appear here as you chat with AI
DROP DATABASE IF EXISTS libreria;
CREATE DATABASE IF NOT EXISTS libreria;
USE libreria;

-- Migrations will appear here as you chat with AI

create table autor (
  id bigint primary key AUTO_INCREMENT,
  nombre VARCHAR(100) not null,
  apellido VARCHAR(100) not null,
  email VARCHAR(100) unique not null
);

create table libro (
  id bigint primary key AUTO_INCREMENT,
  titulo VARCHAR(100) not null,
  ano_publicacion int not null
);

create table editorial (
  id bigint primary key AUTO_INCREMENT,
  nombre VARCHAR(100) not null,
  direccion VARCHAR(100) not null
);

alter table libro
add column autor_id bigint;

alter table libro
add column editorial_id bigint;

alter table libro
add constraint fk_autor foreign key (autor_id) references autor (id);

alter table libro
add constraint fk_editorial foreign key (editorial_id) references editorial (id);