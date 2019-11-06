-- QUAIS ALUNOS PARTICIPAM MAIS DA SALA DE AULA, OU SEJA, QUAIS RESPONDEM MAIS E MENOS EXERCICIOS
SELECT A.NOME, COUNT(R.ID) FROM ALUNO A
	JOIN RESPOSTA R ON A.ID = R.ALUNO_ID
GROUP BY A.NOME;

SELECT COUNT(A.ID) FROM ALUNO A;

SELECT A.NOME FROM ALUNO A;

SELECT * FROM RESPOSTA R
WHERE R.ALUNO_ID = 5;

-- TRAZ TODOS OS DADOS DA TABELA DA ESQUERDA, MESMO NÃO TENDO TODOS OS DADOS CORRESPONDENTES À TABELA DA DIREITA
SELECT A.NOME, COUNT(R.ID) AS RESPOSTAS FROM ALUNO A
	LEFT JOIN RESPOSTA R ON R.ALUNO_ID = A.ID
GROUP BY A.NOME;

-- BUSCAR AS RESPOSTAS SEM ALUNO
SELECT A.NOME, R.RESPOSTA_DADA FROM ALUNO A
	RIGHT JOIN RESPOSTA R ON R.ALUNO_ID = A.ID;

SELECT * FROM ALUNO
WHERE ID = 5000;

INSERT INTO RESPOSTA(ID, EXERCICIO_ID, ALUNO_ID, RESPOSTA_DADA)
VALUES (28, 1, 5000, 'VB E C#');

SELECT A.NOME, R.RESPOSTA_DADA FROM ALUNO A
	RIGHT JOIN RESPOSTA R ON R.ALUNO_ID = A.ID;

DELETE FROM RESPOSTA
WHERE ALUNO_ID = 5000;]

-- Exiba todos os alunos e suas possíveis respostas. 
-- Exiba todos os alunos, mesmo que eles não tenham respondido nenhuma pergunta.
SELECT A.NOME, R.RESPOSTA_DADA FROM ALUNO A
	LEFT JOIN RESPOSTA R ON A.ID = R.ALUNO_ID;

-- Exiba agora todos os alunos e suas possíveis respostas para o exercício com ID = 1.
-- Exiba todos os alunos, até os que não responderam o exercício.
SELECT A.NOME, R.RESPOSTA_DADA FROM ALUNO A
	LEFT JOIN RESPOSTA R ON A.ID = R.ALUNO_ID AND R.EXERCICIO_ID = 1;

-- Qual a diferença entre o JOIN convencional (muitas vezes chamado também de INNER JOIN) para o LEFT JOIN?
---- O INNER JOIN seleciona apenas os elementos que são em comum para as duas tabelas.
---- O LEFT JOIN seleciona não apenas os elementos em comum entre as tabelas, mas também todos os elementos da tabela à esquerda.