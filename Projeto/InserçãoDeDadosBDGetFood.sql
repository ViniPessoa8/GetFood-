use getFood;
INSERT INTO curso(codigo, nome) VALUES ('1','Informática');
INSERT INTO curso(codigo, nome) VALUES ('2','Mecânica');
INSERT INTO curso(codigo, nome) VALUES ('3','Edificações');
INSERT INTO curso(codigo, nome) VALUES ('4','Química');
INSERT INTO curso(codigo, nome) VALUES ('5','Eletrotécnica');
INSERT INTO turma(codigo,curso) VALUES ('IINF31B', '1');
INSERT INTO funcionario(matricula,cargo,nome) VALUES ('123456789','Coordenador','Jucibs');
INSERT INTO login(login,senha,matrFun) VALUES ('admin',MD5('admin'),'123456789');
INSERT INTO ficha(valor) VALUES (0.0);

INSERT INTO venda(matrAl, matrFun, valor, tipo, dt) VALUES ('201511440260', '123456789', 20.0, 0, '2017-10-02');
SELECT * FROM aluno WHERE nome LIKE '%a%';
SELECT * FROM funcionario;
SELECT * FROM ficha;
SELECT * FROM login;

