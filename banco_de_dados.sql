create database leo;
USE leo;
create table pessoa (
cpf INT PRIMARY KEY NOT NULL,
nome varchar(45) NOT NULL
);
insert into pessoa (cpf, nome) value (123, 'Leonardo');