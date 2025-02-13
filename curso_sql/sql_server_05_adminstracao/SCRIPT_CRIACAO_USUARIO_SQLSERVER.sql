CREATE LOGIN marcos WITH PASSWORD = 'Marcola@12345'

SELECT * FROM MASTER.SYS.sql_logins

SELECT NAME, LOGINPROPERTY(NAME, 'PasswordLastSetTime') FROM master.sys.sql_logins

-- VERIFICAR SE A POL�TICA DE SEGURAN�A EST� SENDO APLICADA
CREATE LOGIN pedro WITH PASSWORD = 'pedro'

-- VERIFICA SE O NOME DE USU�RIO � IGUAL A SENHA
SELECT SERVERPROPERTY('localhost') AS SERVER_NAME, 
NAME AS LOGIN_NAME FROM master.sys.sql_logins
WHERE PWDCOMPARE(NAME, PASSWORD_HASH) = 1