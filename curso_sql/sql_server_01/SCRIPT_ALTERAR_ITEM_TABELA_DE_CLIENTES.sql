ALTER TABLE TABELA_DE_CLIENTES
ALTER COLUMN CPF
VARCHAR(11) NOT NULL

ALTER TABLE TABELA_DE_CLIENTES
ADD CONSTRAINT PK_CLIENTES
PRIMARY KEY CLUSTERED (CPF)

INSERT INTO [dbo].[TABELA_DE_CLIENTES]
           ([CPF]
           ,[NOME]
           ,[ENDERECO_1]
           ,[ENDERECO_2]
           ,[BAIRRO]
           ,[CIDADE]
           ,[ESTADO]
           ,[CEP]
           ,[DATA_DE_NASCIMENTO]
           ,[IDADE]
           ,[SEXO]
           ,[LIMITE_DE_CREDITO]
           ,[VOLUME_DE_COMPRA]
           ,[PRIMEIRA_COMPRA])
     VALUES
           ( '00398764521'
           , 'JOÃO DA SILVA'
           , 'RUA PROJETADA A NUMERO 10'
           , ''
           , 'CENTRO'
           , 'SÃO PAULO'
           , 'SP'
           , '00987050'
           , '1990-10-25'
           , 29
           , 'M'
           , 120000.50
           , 1000
           , 1 )