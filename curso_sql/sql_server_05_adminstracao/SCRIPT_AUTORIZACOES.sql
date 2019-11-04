-- AUTORIZAÇÕES A NIVEL DE USUÁRIO
ALTER SERVER ROLE [dbcreator] ADD MEMBER [marcos]

ALTER SERVER ROLE [dbcreator] DROP MEMBER [marcos]

-- AUTORIZAÇÕES A NÍVEL DE SERVER E BANCO

-- LISTAR REGRAS A NÍVEL DE SERVIDOR
SELECT * FROM sys.fn_builtin_permissions('') WHERE class_desc = 'SERVER'

-- AUTORIZAÇÕES A NÍVEL DE BANCO DE DADOS
USE SUCOS_VENDAS
CREATE LOGIN jorge WITH PASSWORD = 'Jorgin@123'
CREATE USER jorge FOR LOGIN jorge

USE SUCOS_VENDAS
EXEC sp_addrolemember 'db_datareader', 'jorge'
EXEC sp_addrolemember 'db_datawriter', 'jorge'