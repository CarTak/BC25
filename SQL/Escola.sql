-- Escolher uma temática de sua preferência para modelar um banco de dados com no mínimo 3 tabelas. Exemplos: Escola, Livraria, Esportes, etc;
-- Crie um diagrama de Entidade-Relacionamento demonstrando as entidades, relacionamentos e suas cardinalidades. Pode até mesmo realizar um desenho no caderno, basta tirar foto depois;
-- Crie as tabelas utilizando a linguagem SQL e obedecendo o que foi feito no diagrama;
-- Faça uso dos comandos de manipulação de dados: INSERT, UPDATE, DELETE;
-- Faça uso dos comandos de busca: SELECT;
-- Realize queries com junção e filtros WHERE;
-- Para cada entidade do seu banco crie uma classe em Java. Ou seja, se seu exemplo possuir 3 tabelas representando entidades, devem a ver 3 classes análogas! 


CREATE TABLE alunos(
	idAluno INTEGER PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(30) NOT NULL,
    sobrenome VARCHAR(30) NOT NULL,
    email VARCHAR(30) NOT NULL,
    dataNasc DATE NOT NULL
);

CREATE TABLE professores(
	idProfessor INTEGER PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(30) NOT NULL,
    sobrenome VARCHAR(30) NOT NULL,
    email VARCHAR(30) NOT NULL,
    dataNasc DATE NOT NULL    
);

CREATE TABLE materia(
	idMateria INTEGER PRIMARY KEY AUTO_INCREMENT,
    materia VARCHAR(30) NOT NULL,
    idProfessor INTEGER NOT NULL,
    FOREIGN KEY(idProfessor) REFERENCES professores(idProfessor)
);

CREATE TABLE nota(
	idNota INTEGER PRIMARY KEY AUTO_INCREMENT,
    nota decimal(2, 1),
    idMateria INTEGER NOT NULL,
    idAluno INTEGER NOT NULL,
    idProfessor INTEGER NOT NULL,
    FOREIGN KEY(idAluno) REFERENCES alunos(idAluno),
    FOREIGN KEY(idMateria) REFERENCES materia(idMateria),
    FOREIGN KEY(idProfessor) REFERENCES professores(idProfessor)
);

-- Carregando a tabela alunos
INSERT INTO alunos(nome,sobrenome,email,dataNasc) VALUES ("José", "Mauro", "jm@gmail.com", "2010-10-25"), ("Ricardo", "Goes", "rigo@gmail.com", "2011-01-12"), ("Maria", "Severina", "maria@gmail.com", "2009-06-11"), ("Lilian", "Cabral", "liliancabral@gmail.com", "2014-03-01"),("Ricardo", "Zetta", "zetta@gmail.com", "2012-06-16"),("Lisandra", "Pires", "lispires@gmail.com", "2011-10-07"),("Pedro", "Paulo", "pepa@gmail.com", "2015-07-09"),("Murilo", "Rosa", "muro@gmail.com", "2014-08-16"),("Kate", "Midler", "katemidler@gmail.com", "2016-05-08"),("Cristina", "Aguilera", "crisaguilera@gmail.com", "2012-07-09"),("Paulo", "Jose", "jopa@gmail.com", "2013-05-30"),("Paulo", "Ricardo", "rpm@gmail.com", "2000-02-01"),("Ruth", "Paiva", "ruthpa@gmail.com", "2009-07-16"),("Carlos", "Jose", "carlosjose@gmail.com", "2007-08-09"),("Mercia", "Mussi", "merciamussi@gmail.com", "209-05-12"),("Luis", "Silva", "lusi@gmail.com", "2010-07-17"),("Meire", "Messias", "meme@gmail.com", "2014-09-27"),("Mika", "Montes", "mikamontes@gmail.com", "2001-10-26"),("Gustavo", "Lima", "gustavolimaa@gmail.com", "2006-08-19"),("Luis", "Miguel", "luismiguel@gmail.com", "2009-11-13"),("Hellen", "Garcia", "hega@gmail.com", "2013-01-30");

-- Carregando a tabela professores
INSERT INTO professores(nome,sobrenome,email,dataNasc) VALUES ("Mauro", "Rocha", "maurorocha@gmail.com", "1980-10-13"),("Mirthes", "Rosa", "mirthes@gmail.com", "1990-07-24"),("Ricardo", "Maduro", "ricmad@gmail.com", "1987-11-12"),("Mary", "Maria", "mem@gmail.com", "1993-12-25"),("Patricia", "Pillar", "patti@gmail.com", "1999-02-01"),("João", "Jones", "jojo@gmail.com", "1989-09-22");

-- Carregando a tabela de materias
INSERT INTO materia(materia,idProfessor) VALUES ("Matemática", 6),("Português", 2),("Inglês", 2),("Geografia", 1),("Historia", 3),("Educacão Fisica", 5),("Quimica", 4);

-- Carregando a tabela de notas
INSERT INTO nota(nota,idMateria,idAluno,idProfessor) VALUES (7.7, 1, 1, 6),(8.0, 3, 1, 2),(6.5, 5, 1, 3),(7.3, 6, 1, 5),(6.0, 2, 2, 2),(7.4, 3, 2, 2),(9.1, 4, 2, 1),(9.0, 5, 2, 3),(4.9, 6, 2, 5),(9.4, 1, 3, 6),(8.4, 7, 3, 4),(6.8, 1, 4, 6),(7.4, 3, 4, 2),(6.9, 5, 4, 3),(9.1, 7, 4, 4),(8.4, 2, 5, 2),(5.4, 3, 5, 2),(3.0, 4, 5, 1),(7.7, 5, 5, 3),(8.4, 6, 5, 5),(4.4, 5, 6, 3),(5.1, 6, 6, 5),(1.0, 1, 7, 6),(6.7, 3, 7, 2),(9.9, 5, 7, 3),(8.0, 2, 8, 2),(4.5, 4, 8, 1),(6.7, 5, 8, 3),(8.3, 6, 8, 5),(5.4, 1, 9, 6),(7.4, 2, 9, 2),(7.7, 3, 9, 2),(3.7, 5, 9, 3),(7.4, 6, 9, 5),(5.3, 2, 10, 2),(6.8, 4, 10, 1),(4.4, 5, 10, 3),(8.0, 6, 10, 5),(7.4, 1, 11, 6),(8.7, 3, 11, 2),(4.6, 5, 11, 3),(7.7, 6, 11, 5),(5.7, 1, 12, 6),(6.7, 3, 12,2),(7.2, 4, 12,1),(9.8, 5, 12, 3),(6.7, 6, 12, 5),(6.9, 1, 13, 6),(7.6, 2, 13, 2),(4.3, 3, 13, 2),(7.4, 4, 13, 1),(6.7, 1, 14, 6),(5.4, 2, 14, 2),(8.1, 4, 14, 1),(5.7, 5, 14, 3),(6.6, 6, 14, 5),(6.6, 2, 15, 2),(8.7, 3, 15, 2),(7.3, 4, 15, 1),(9.0, 5, 15, 3),(6.0, 6, 15, 5),(4.7, 1, 16, 6),(6.7, 3, 16, 2),(8.7, 4, 16, 1),(9.7, 6, 16, 5),(8.3, 1, 17, 6),(5.7, 3, 17, 2),(4.8, 5, 17, 3),(7.4, 6, 17, 1),(8.0, 7, 17, 4),(0.7, 1, 18, 6),(5.0, 1, 19, 6),(7.3, 3, 19, 2),(5.9, 4, 19, 1),(6.8, 5, 19, 3),(9.5, 6, 19, 5),(7.6, 3, 20, 2),(8.8, 4, 20, 1),(6.7, 5, 20, 3),(3.3, 2, 18, 2),(7.7, 4, 20, 1),(8.4, 5, 20, 3),(7.1, 1, 21, 6),(6.2, 2, 21, 2),(9.0, 5, 21, 3),(9.8, 6, 21, 5);

-- inserindo novo aluno
INSERT INTO alunos VALUES(NULL, "Richard","Clayton","richard@gmail.com","2010-04-09");
INSERT INTO professores VALUES(NULL,"Mary","Help","maryhelp@gmail.com","2001-07-07");
INSERT INTO materia VALUES(NULL,"Astronomia",1);

-- Deletando Aluno
DELETE FROM alunos WHERE idAluno = 22;
DELETE FROM professores WHERE idProfessor = 7;
DELETE FROM materia WHERE nome = "Astronomia";

-- Alteração de registo
UPDATE alunos SET email = "josemauro@gmail.com" WHERE idAluno = 1;
UPDATE professores SET nome = "Mario" WHERE idProfessor = 1;
UPDATE materia SET materia = "Astronomia" WHERE idProfessor = 5;

-- Busca utilizando Select com utilização da clausula WHERE
SELECT alu.nome AS nomeAluno, alu.sobrenome AS sobrenomeAluno ,pro.nome AS professorNome, pro.sobrenome AS sobrenomeProfessor,mat.materia,nota.nota
FROM nota 
	INNER JOIN alunos alu
    ON nota.idAluno = alu.idAluno
    INNER JOIN professores pro
    ON nota.idProfessor = pro.idProfessor
    INNER JOIN materia mat
    ON nota.idMateria = mat.idMateria
WHERE nota.nota > 1 ORDER BY alu.idAluno;    

SELECT alu.nome AS nomeAluno, alu.sobrenome AS sobrenomeAluno ,pro.nome AS professorNome, pro.sobrenome AS sobrenomeProfessor,mat.materia,nota.nota
FROM nota, alunos alu, professores pro, materia mat
WHERE nota.nota > 1 
AND nota.idAluno = alu.idAluno
AND nota.idProfessor = pro.idProfessor
AND nota.idMateria = mat.idMateria
ORDER BY alu.idAluno;



select * from alunos;
select * from professores;
select * from materia;
select * from nota;
drop table alunos;
drop table professores;
drop table materia;
drop table nota;