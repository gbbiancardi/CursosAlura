CREATE TABLE COMPRAS (
ID NUMBER PRIMARY KEY,
VALOR NUMBER,
DATA DATE,
OBSERVACOES VARCHAR2(30),
RECEBIDO CHAR CHECK (RECEBIDO IN (0, 1)
));

CREATE SEQUENCE ID_SEQ;

INSERT INTO COMPRAS (ID, VALOR, DATA, OBSERVACOES, RECEBIDO)
VALUES (ID_SEQ.NEXTVAL, 100, '12-MAY-2007', 'COMPRAS DE MAIO', '1');

SELECT * FROM COMPRAS;

SELECT VALOR, DATA FROM COMPRAS;

SELECT VALOR * 3, DATA FROM COMPRAS;

SELECT VALOR * 3 AS TRIPLO, DATA FROM COMPRAS;

INSERT INTO COMPRAS (ID, VALOR, DATA, OBSERVACOES, RECEBIDO)
VALUES (ID_SEQ.NEXTVAL, 150, '12-JUN-2007', 'COMPRAS DE JUNHO', '0');

SELECT * FROM COMPRAS;

SELECT VALOR, DATA FROM COMPRAS
WHERE VALOR > 100;

SELECT VALOR, DATA FROM COMPRAS
WHERE VALOR < 120;

SELECT * FROM COMPRAS
WHERE VALOR < 120 AND RECEBIDO = '1';

SELECT * FROM COMPRAS
WHERE VALOR < 120 OR RECEBIDO = '1';

SELECT * FROM COMPRAS
WHERE OBSERVACOES = 'COMPRAS';

SELECT * FROM COMPRAS 
WHERE OBSERVACOES LIKE 'COMPRAS%';

SELECT * FROM COMPRAS
WHERE OBSERVACOES LIKE '%DE%';

SELECT * FROM COMPRAS
WHERE (VALOR > 1000 AND VALOR < 3000) OR (VALOR > 5000);