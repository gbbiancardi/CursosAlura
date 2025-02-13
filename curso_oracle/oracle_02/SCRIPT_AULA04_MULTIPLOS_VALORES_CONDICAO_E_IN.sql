DESC MATRICULA;

SELECT TIPO FROM MATRICULA;

SELECT DISTINCT TIPO FROM MATRICULA; -- SELECIONA APENAS UM VALOR DE CADA TIPO, N�O LISTA TODOS

SELECT C.NOME, M.TIPO, COUNT(M.ID) AS QUANTIDADE FROM MATRICULA M
	JOIN CURSO C ON C.ID = M.CURSO_ID
WHERE M.TIPO = 'PAGA_PF' OR M.TIPO = 'PAGA_PJ'
GROUP BY C.NOME, M.TIPO;

SELECT C.NOME, M.TIPO, COUNT(M.ID) AS QUANTIDADE FROM MATRICULA M
	JOIN CURSO C ON C.ID = M.CURSO_ID
WHERE M.TIPO IN ('PAGA_PF', 'PAGA_PJ') -- TEM O MESMO EFEITO, POR�M � UM MODO MAIS SUSSINTO DE DECLARAR O M�TODO
GROUP BY C.NOME, M.TIPO;

SELECT * FROM ALUNO;

SELECT A.NOME, C.NOME FROM CURSO C
	JOIN MATRICULA M ON M.CURSO_ID = C.ID
	JOIN ALUNO A ON A.ID = M.ALUNO_ID
WHERE A.ID IN (1, 3, 4)
ORDER BY A.NOME;

-- DIVULGAR O CURSO NOVO DE ORACLE APENAS PARA ALUNOS QUE FIZERAM CURSOS SQL E PHP
SELECT * FROM CURSO;

SELECT A.NOM, C.NOME FROM CURSO C
	JOIN MATRICULA M ON M.CURSO_ID = C.ID
	JOIN ALUNO A ON A.ID = M.ALUNO_ID
WHERE C.ID IN (1, 9);

-- Exiba todos os tipos de matr�cula que existem na tabela. Use DISTINCT para que n�o haja repeti��o.
SELECT DISTINCT TIPO FROM MATRICULA;

-- Exiba todos os cursos e a sua quantidade de matr�culas. Mas filtre por matr�culas dos tipos PF ou PJ.
SELECT C.NOME, COUNT(M.ID) FROM CURSO C
	JOIN MATRICULA M ON C.ID = M.CURSO_ID
WHERE M.TIPO IN ('PAGA_PF', 'PAGA_PJ')
GROUP BY C.NOME;

-- Traga todos os exerc�cios e a quantidade de respostas de cada uma. Mas dessa vez, somente dos cursos com ID 1 e 3.
SELECT E.PERGUNTA, COUNT(R.ID) AS QUANTIDADE RESPOSTAS FROM EXERCICIO E
	JOIN RESPOSTA R ON E.ID = R.REXERCICIO_ID
	JOIN SECAO S ON S.ID = E.SECAO_ID
	JOIN CURSO C ON C.ID = S.CURSO_ID
WHERE C.ID IN (1, 3)
GROUP BY E.PERGUNTA;