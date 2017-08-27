use getFood;
INSERT INTO curso(codigo, nome, ano) VALUES ('1','Informática',2017);
INSERT INTO turma(codigo,curso, ano) VALUES ('IINF31B', '1', 2017);
INSERT INTO aluno(matricula,nome,saldo,turma,curso,foto,beneficiario) VALUES ('201511440260', 'Vinícius Cavalcante de Brito Pessoa',0,'IINF31B','1',null,0);
INSERT INTO funcionario(matricula,cargo,nome) VALUES ('123456789','Coordenador','Jucibs');
INSERT INTO login(login,senha,matrFun) VALUES ('admin',MD5('admin'),'123456789');

SELECT * FROM aluno WHERE nome LIKE '%a%';

