create database leo;
USE leo;
create table pessoa (
cpf INT PRIMARY KEY,
NOME varchar(45)
);
insert into pessoa (cpf, nome) value (123, 'leo');