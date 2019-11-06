-- QUAIS ALUNOS PARTICIPAM MAIS DA SALA DE AULA, OU SEJA, QUAIS RESPONDEM MAIS E MENOS EXERCICIOS
SELECT A.NOME, COUNT(R.ID) FROM ALUNO A
	JOIN RESPOSTA R ON A.ID = R.ALUNO_ID
GROUP BY A.NOME;

SELECT COUNT(A.ID) FROM ALUNO A;

SELECT A.NOME FROM ALUNO A;

SELECT * FROM RESPOSTA R
WHERE R.ALUNO_ID = 5;

-- TRAZ TODOS OS DADOS DA TABELA DA ESQUERDA, MESMO N�O TENDO TODOS OS DADOS CORRESPONDENTES � TABELA DA DIREITA
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

-- Exiba todos os alunos e suas poss�veis respostas. 
-- Exiba todos os alunos, mesmo que eles n�o tenham respondido nenhuma pergunta.
SELECT A.NOME, R.RESPOSTA_DADA FROM ALUNO A
	LEFT JOIN RESPOSTA R ON A.ID = R.ALUNO_ID;

-- Exiba agora todos os alunos e suas poss�veis respostas para o exerc�cio com ID = 1.
-- Exiba todos os alunos, at� os que n�o responderam o exerc�cio.
SELECT A.NOME, R.RESPOSTA_DADA FROM ALUNO A
	LEFT JOIN RESPOSTA R ON A.ID = R.ALUNO_ID AND R.EXERCICIO_ID = 1;

-- Qual a diferen�a entre o JOIN convencional (muitas vezes chamado tamb�m de INNER JOIN) para o LEFT JOIN?
---- O INNER JOIN seleciona apenas os elementos que s�o em comum para as duas tabelas.
---- O LEFT JOIN seleciona n�o apenas os elementos em comum entre as tabelas, mas tamb�m todos os elementos da tabela � esquerda.