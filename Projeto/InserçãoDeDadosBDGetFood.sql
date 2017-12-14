use getFood;
insert into ficha(valor) values(5);
INSERT INTO funcionario(matricula,cargo,nome) VALUES ('0','admin','Administrador');
INSERT INTO login(login, senha, matrFun) VALUES ('admin',MD5('admin'),'0');

/*Criação dos Cursos*/

/*INSERT INTO curso(codigo, nome) VALUES ('1','Informática');
INSERT INTO curso(codigo, nome) VALUES ('2','Mecânica');
INSERT INTO curso(codigo, nome) VALUES ('3','Edificações');
INSERT INTO curso(codigo, nome) VALUES ('4','Química');
INSERT INTO curso(codigo, nome) VALUES ('5','Eletrotécnica');
INSERT INTO turma(codigo,curso) VALUES ('IINF31B', '1');
INSERT INTO aluno(matricula,nome,saldo,turma,curso,foto,beneficiario) VALUES ('201511440260', 'Vinícius Cavalcante de Brito Pessoa',0,'IINF31B','1',null,0);
INSERT INTO funcionario(matricula,cargo,nome) VALUES ('123456789','Coordenador','Jucibs');
INSERT INTO login(login,senha,matrFun) VALUES ('admin',MD5('admin'),'123456789');
INSERT INTO aluno(matricula,nome,saldo,turma,curso,foto,beneficiario) VALUES ('201511440767', 'Bolsonaro 2018',0,'IINF31B','1',null,0);
INSERT INTO venda(matrAl, matrFun, valor, tipo, dt) VALUES ('201511440260', '123456789', 20.0, 0, '2017-10-02');
INSERT INTO funcionario(matricula,cargo,nome) VALUES ('666','Presidente da República','Satã');
INSERT INTO aluno(matricula,nome,saldo,turma,curso,foto,beneficiario) VALUES ('201511440001', 'Daniel',0,'IINF31B','1',null,1);

SELECT DISTINCT codigo, matrAl, matrFun, valor, tipo, dt , A.beneficiario as beneficio FROM venda as V, aluno as A WHERE dt between '2017-11-13' and '2017-11-13' order by beneficio;
SELECT  codigo, matrAl, matrFun, valor, tipo, dt , A.beneficiario as beneficio FROM aluno as A INNER JOIN venda as V ON A.matricula = V.matrAl;
DELETE FROM venda WHERE matrAl = '201511440001';
SELECT * FROM aluno;
SELECT * FROM funcionario;
select * from venda;
select * from aluno;
select * from login;
select * from ficha;
select * from curso;
SELECT DISTINCT codigo, matrAl, matrFun, valor, tipo, dt , A.beneficiario as beneficio FROM venda as V, aluno as A WHERE A.beneficiario = 0 AND (dt between '2017-11-13' and '2017-11-17');

update aluno set saldo=5 where matricula = 201511440260;

select * from aluno where matricula = 201511440767;*/
