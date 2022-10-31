-- AULA MYSQL 24.10
-- COMANDOS BÁSICOS NO WORKBENCNCH	
-- Para o SQL tanto faz caixa baixa e CAIXA ALTA

SHOW DATABASES; -- Lista os bancos de dados existentes no seu computador

CREATE DATABASE empresa; -- Cria um banco de dados com o nome especificado

USE empresa; -- Seleciona o banco empresa para aplicar os comandos SQL

DROP DATABASE empresa; -- Apagar seu banco de dados (Já ERA)

SHOW TABLES; -- lista todas as tabelas presentes no banco empresa

-- Criando tabelas no banco de dados
-- Departamento: idDepartamento(numerico), nome(texto), salarioMax(numerico)
CREATE TABLE departamento(
	idDepartamento INTEGER PRIMARY KEY AUTO_INCREMENT, -- Chave primária: Identifica unicamente um registro de tabela
    nome VARCHAR(30) NOT NULL, -- VARCHAR(LIMITE): TEXTO VARIAVEL, NOT NULL = obrigatório
    salarioMax DECIMAL(10, 2) NOT NULL -- DECIMAL(digitos, precisao)
);

DESC departamento; -- Detalhar a estrutura tabela

DROP TABLE departamento; -- remove a tabela

-- Tabela Empregado
-- CHAVE ESTRANGEIRA - É UMA CHAVE QUE SE REFERE A CHAVE PRIMÁRIA DE OUTRA TABELA
CREATE TABLE empregado(
	idEmpregado INTEGER PRIMARY KEY AUTO_INCREMENT,  -- o banco preenche automaticamente
    nome VARCHAR(30) NOT NULL, -- torna nome obrigatório
    email VARCHAR(30) UNIQUE NOT NULL, -- email não pode ser repetido na tabela
	dataNasc DATE NOT NULL, -- "1999-02-01" - padrão americano
    salario DECIMAL(10,2) NOT NULL, -- 10 = TOATL DIGITOS, 2 = PRECISÂO EM DIGITOS (APÓS)
    idDepartamento INTEGER NOT NULL, -- Campo para guardar a chave do departamento
    FOREIGN KEY(idDepartamento) REFERENCES departamento(idDepartamento) -- Oficializa  o relacionamento entre departamento - empregado
);
-- O BANCO ESTÁ CIENTE DESSA RELAÇÃO ENTRE AS DUAS TABELAS

CREATE TABLE dependente(
	idDependente INTEGER PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(30) NOT NULL,
    dataNasc DATE NOT NULL,
    idResponsavel INTEGER NOT NULL, -- idEmpregado
    FOREIGN KEY(idResponsavel) REFERENCES empregado(idEmpregado) -- Torna o banco ciente do relacionamento
);

-- Inserir dados
INSERT INTO departamento VALUES (NUll, "Recursos Humanos", 5500.0); -- SEGUE A ORDEM DAS COLUNAS
INSERT INTO departamento VALUES (NULL, "TI", 6900.00);
INSERT INTO departamento VALUES (NULL, "Suporte", 6000.0);
SELECT * FROM departamento; -- Listar os dados da tabela

INSERT INTO empregado VALUES (NULL,"Carlos José","carlos.josé@gmail.com","1993-04-03",3500.0,1);
INSERT INTO empregado VALUES (NULL,"João Paulo","joaopaulo@gmail.com","1998-02-03",4500.0,2);
INSERT INTO empregado VALUES (NULL,"André Vieira","andrevieira@gmail.com","1978-01-03",6500.0,3);
SELECT * FROM empregado; -- Lista TODOS os empregados

-- Nessa forma, indica-se quais colunas serão preenchidas
INSERT INTO dependente(nome, dataNasc, idResponsavel) VALUES ("Carlin Jr","2010-05-01",1);
INSERT INTO dependente(nome, dataNasc, idResponsavel) VALUES ("Maria Carla","2015-03-02",2);
INSERT INTO dependente(nome, dataNasc, idResponsavel) VALUES ("Pedro Antonio","2013-05-02",3);
INSERT INTO dependente(nome, dataNasc, idResponsavel) VALUES ("Andre Jr","2012-02-02",1);
SELECT * FROM dependente;

-- atualizar registros
UPDATE empregado 
SET salario = 5000.0; -- Todos os empregados receberiam salario = 5000 (Perigo)

UPDATE empregado
SET salario = 5000.0
WHERE idEmpregado = 1; 

UPDATE empregado
SET nome = "João Paulo Marques", salario = 5500.0, idDepartamento = 1
Where idEmpregado = 2;

UPDATE departamento
SET salarioMax = 9000
WHERE idDepartamento = 2;

UPDATE dependente
SET idResponsavel = 1
WHERE idDependente = 3;

SELECT * FROM empregado;
SELECT * FROM departamento;
SELECT * FROM dependente;

-- Deletar registros
DELETE FROM dependente; -- Limpa todos os registros da tabela

DELETE FROM dependente
WHERE idDependente = 4;

DELETE FROM departamento
WHERE idDEpartamento = 3; -- Não Funciona se existirem funcionarios associados ao departamento

-- QUANDO USAR UPDATE E DELETE, LEMBREM-SE DO WHERE!
-- CREATE TABLE (PK = Primary Key, FK = Foreign Key); INSERT INTO, UPDATE; DELETE; SELECT;

-- DESAFIO 1: Criar uma tabela endereco (uf, cidade, cep, rua, numero) que esta relacionada ao empregado (1:1)

CREATE TABLE endereco (
	endereco INTEGER PRIMARY KEY AUTO_INCREMENT,
	rua VARCHAR(30) NOT NULL,
    numero INTEGER NOT NULL,
    CEP VARCHAR(8) NOT NULL,
    cidade VARCHAR(30) NOT NULL,
    uf VARCHAR(2) NOT NULL,
    idFuncionario INTEGER NOT NULL,
	FOREIGN KEY(idFuncionario) REFERENCES empregado(idEmpregado)
);

-- DESAFIO 2: Criar uma tabela projeto (nome, prazo, orcamento, descricao). N:N (Gera uma tabela relacionamento)

CREATE TABLE projeto(
	idProjeto INTEGER PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(50) NOT NULL,
    prazo DATE NOT NULL,
    orcamento DECIMAL(10, 2) NOT NULL,
    descricao VARCHAR(140) NOT NULL
);

INSERT INTO projeto VALUES (NULL, "Goodpay", "2023-05-11", 5500, " Plataforma financeira e educaional feita em JS");
INSERT INTO projeto(nome, prazo, descricao, orcamento) VALUES ("Helpr", "2022-12-16", "É uma plataforma estilo Help Desk", 10000.0);
INSERT INTO projeto(nome, descricao, prazo, orcamento) VALUES ("Shopin", "É uma plataforma de e-commerce", "2023-01-01", 20000.0);

SELECT * FROM projeto;

-- QUANDO TEMOS MUITOS PARA MUITOS, GERAMOS UMA TABELA PARA RELACIONAR AS DUAS ENTIDADES
CREATE TABLE rel_empregado_projeto(
	idRelacionamento INTEGER PRIMARY KEY AUTO_INCREMENT,
    idEmpregado INTEGER NOT NULL, -- CHAVE ESTRANGEIRA DA TABELA EMPREGADO
    idProjeto INTEGER NOT NULL, -- CHAVE ESTRANGEIRA DA TABELA PROJETO
    FOREIGN KEY(idEmpregado) REFERENCES empregado(idEmpregado),
    FOREIGN KEY(idProjeto) REFERENCES projeto(idProjeto)
);

-- COMO ASSOCIAR AS ENTIDADES
SELECT * FROM empregado;
SELECT * FROM projeto;
-- CARLOS JOSÉ(1) = Goodpay(1) e Shopin(3)
INSERT INTO rel_empregado_projeto VALUES(NULL, 1, 1); -- CARLOS JOSE trabalha no Goodpay
INSERT INTO rel_empregado_projeto VALUES(NULL, 1, 3); -- CARLOS JOSE trabalha no Shopin
-- JOÃO PAULO(2) = HELPR(2) E SHOPIN(3)
INSERT INTO rel_empregado_projeto VALUES(NULL, 2, 2); -- JOAO PAULO trabalha no Helpr
INSERT INTO rel_empregado_projeto VALUES(NULL, 2, 3); -- JOAO PAULO trabalha no Shopin
-- ANDRÉ VIEIRA(3) = Goodpay(1), HELPR(2) e SHOPIN(3)
INSERT INTO rel_empregado_projeto VALUES(NULL, 3, 1); -- ANDRE VIERA trabalha no Goodpay
INSERT INTO rel_empregado_projeto VALUES(NULL, 3, 2); -- ANDRE VIERA trabalha no Helpr
INSERT INTO rel_empregado_projeto VALUES(NULL, 3, 3); -- ANDRE VIERA trabalha no Shopin

SELECT * FROM rel_empregado_projeto; -- Guarda apenas os relacionamentos

-- Join nas 3 tabelas
SELECT empregado.nome, projeto.nome as projetoNome, email, salario, prazo, orcamento
FROM rel_empregado_projeto
	INNER JOIN empregado
    ON rel_empregado_projeto.idEmpregado = empregado.idEmpregado
    INNER JOIN projeto
    ON rel_empregado_projeto.idProjeto = projeto.idProjeto
WHERE projeto.nome = "Goodpay"; -- Lista os empregados envolvidos no projeto Goodpay
    
 SELECT empregado.nome, projeto.nome
 FROM rel_empregado_projeto
	INNER JOIN empregado
	ON rel_empregado_projeto.idEmpregado = empregado.idEmpregado
	INNER JOIN projeto
	ON rel_empregado_projeto.idProjeto = projeto.idProjeto
 WHERE empregado.nome = "Carlos José";   
 
 -- RESUMO Cardinalidades
 -- 1:1, quem depende de quem
 -- 1:n, Sempre o lado N recebe a chave
 -- n:n sempre irá gerar uma nova tabela com duas FK
 