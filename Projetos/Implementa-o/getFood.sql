drop database getFood;
create database getFood;
use getFood;

create table curso(
	codigo varchar(25) not null,
	primary key(codigo),
	nome varchar(50) not null,
    ano int(4) not null
);

create table turma(
	codigo varchar(25) not null,
	primary key(codigo),
	curso varchar(25) not null,
	foreign key (curso) references curso(codigo),
    ano int (4) not null
);

create table aluno(
	matricula varchar(14) not null,
	primary key(matricula),
	foto longblob,
	saldo float,
	nome varchar(50) not null,
    beneficiario int(1) not null,
	curso varchar(25) not null,
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
	codigo int not null,
	primary key(codigo),
	matrAl varchar(12) not null,
	foreign key(matrAl) references aluno(matricula),
	matrFun float(12) not null,
	foreign key(matrFun) references funcionario(matricula),
	valor float not null,
	dt date not null
);

create table relatorio(
	dt date not null,
	codigo int not null,
	primary key(codigo),
	totalSaldo float not null,
	totalAlunos int not null,
	codVenda int not null,
	foreign key(codVenda) references venda(codigo)
);

CREATE TABLE login(
	login varchar(25),
    senha varchar(255),
    matrFun varchar(12)
);



select * from funcionario;
