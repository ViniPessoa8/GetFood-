drop database getFood;
create database getFood;
use getFood;

create table curso(
	codigo varchar(25) not null,
	primary key(codigo),
	nome varchar(50) not null
);

create table turma(
	codigo varchar(25) not null,
	primary key(codigo),
	curso varchar(25) not null,
	foreign key (curso) references curso(codigo)
);

create table aluno(
	matricula varchar(14) not null,
	primary key(matricula),
	foto longblob,
	saldo float,
	nome varchar(50) not null,
    beneficiario int(1) not null,
	curso varchar(50) not null,
    foreign key(curso) references curso(codigo),
	turma varchar(25) not null,
	foreign key (turma) references turma(codigo)
);

create table funcionario(
	matricula varchar(12) not null,
	primary key(matricula),
	cargo varchar(25) not null,
	nome varchar(50) not null
);

create table ficha(
	valor float not null,
	primary key(valor)
);

create table venda(
	codigo int not null auto_increment,
	primary key(codigo),
	matrAl varchar(12) not null,
	foreign key(matrAl) references aluno(matricula),
	matrFun varchar(12) not null,
	foreign key(matrFun) references funcionario(matricula),
	valor float not null,
    tipo int not null,
	dt date not null
);

CREATE TABLE login(
	login varchar(20) not null,
    senha varchar(255) not null,
    matrFun varchar(12) not null,
    primary key(login),
    foreign key (matrFun) references funcionario(matricula)
);


select * from funcionario;
