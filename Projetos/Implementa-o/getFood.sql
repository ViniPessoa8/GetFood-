<?xml version="1.0" encoding="UTF-8"?>
<project-private xmlns="http://www.netbeans.org/ns/project-private/1">
    <editor-bookmarks xmlns="http://www.netbeans.org/ns/editor-bookmarks/2" lastBookmarkId="0"/>
    <open-files xmlns="http://www.netbeans.org/ns/projectui-open-files/2">
        <group>
            <file>file:/E:/Vine%20e%20Fernands%20furever/%5BIFAM%5D/%7BPROJETOS%7D/GitHub/GetFood-/Projetos/Implementa-o/getFood/src/DAO/LoginDAO.java</file>
            <file>file:/E:/Vine%20e%20Fernands%20furever/%5BIFAM%5D/%7BPROJETOS%7D/GitHub/GetFood-/Projetos/Implementa-o/getFood/src/Interfaces/DesativaTurma.java</file>
        </group>
    </open-files>
</project-private>
                                                                                                                                                                                                                                                                                                                                               varchar(12) not null,
	foreign key(matFun) references funcionario(matricula),
	valor float not null,
    tipo int(1) not null,
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
