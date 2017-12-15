use getFood;
insert into ficha(valor) values(5);
INSERT INTO funcionario(matricula,cargo,nome) VALUES ('0','admin','Administrador');
INSERT INTO login(login, senha, matrFun) VALUES ('admin',MD5('admin'),'0');

/*Criação dos Cursos (Para a defesa)*/
INSERT INTO curso(codigo, nome) VALUES('1','Edificacoes');
INSERT INTO curso(codigo, nome) VALUES('2','Eletrotecnica');
INSERT INTO curso(codigo, nome) VALUES('3','Informatica');
INSERT INTO curso(codigo, nome) VALUES('4','Mecanica');
INSERT INTO curso(codigo, nome) VALUES('5','Quimica');

/*Criação das Turmas (Para a defesa)*/
INSERT INTO turma(codigo, curso) VALUES('IINF11-A','1');
INSERT INTO turma(codigo, curso) VALUES('IINF11-B','1');
INSERT INTO turma(codigo, curso) VALUES('IINF21-A','1');
INSERT INTO turma(codigo, curso) VALUES('IINF21-B','1');
INSERT INTO turma(codigo, curso) VALUES('IINF31-A','1');
INSERT INTO turma(codigo, curso) VALUES('IINF31-B','1');