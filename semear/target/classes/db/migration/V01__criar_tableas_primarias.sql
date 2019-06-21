CREATE TABLE PESSOA_FISICA
(
    ID                      BIGINT(20) PRIMARY KEY AUTO_INCREMENT,
    NOME                    VARCHAR(50) NOT NULL,
    CPF                     VARCHAR(30),
    RG                      VARCHAR(30),
    ORGAO_RG                VARCHAR(30),
    DATA_EMISSAO_RG         DATE,
    DATA_NASCIMENTO         DATE,
    SEXO                    VARCHAR(30),
    NATURALIDADE            VARCHAR(30),
    NACIONALIDADE           VARCHAR(30),
    RACA                    VARCHAR(30),
    TIPO_SANGUE             VARCHAR(30),
    CNH_NUMERO              VARCHAR(30),
    CNH_CATEGORIA           VARCHAR(30),
    CNH_VENCIMENTO          DATE,
    TITULO_ELEITORAL_NUMERO VARCHAR(30),
    TITULO_ELEITORAL_ZONA   VARCHAR(30),
    TITULO_ELEITORAL_SECAO  VARCHAR(30),
    RESERVISTA_NUMERO       VARCHAR(30),
    RESERVISTA_CATEGORIA    VARCHAR(30),
    NOME_MAE                VARCHAR(30),
    NOME_PAI                VARCHAR(30)


) ENGINE = InnoDB
  DEFAULT CHARSET = utf8MB4;


CREATE TABLE ENDERECO
(
    ID               INTEGER UNSIGNED NOT NULL PRIMARY KEY AUTO_INCREMENT,
    LOGRADOURO       VARCHAR(50),
    NUMERO           VARCHAR(50),
    COMPLEMENTO      VARCHAR(50),
    BAIRRO           VARCHAR(50),
    CEP              VARCHAR(50),
    CIDADE           VARCHAR(50),
    ESTADO           VARCHAR(50),
    ID_PESSOA_FISICA BIGINT(20),

    INDEX FK_PESSOA_FISICA (ID_PESSOA_FISICA ASC),

    FOREIGN KEY (`ID_PESSOA_FISICA`)
        REFERENCES PESSOA_FISICA (`ID`)
)
    ENGINE = InnoDB
    DEFAULT CHARSET = utf8MB4
    COMMENT = 'Tabela que armazena os dados do  endereco.';


CREATE TABLE PESSOA_TELEFONE
(
    ID               INTEGER UNSIGNED NOT NULL PRIMARY KEY AUTO_INCREMENT,
    EMAIL            VARCHAR(30),
    TIPO             VARCHAR(30),
    NUMERO           VARCHAR(30),
    ID_PESSOA_FISICA BIGINT(20),


    INDEX FK_PESSOA_FISICA (ID_PESSOA_FISICA ASC),

    FOREIGN KEY (`ID_PESSOA_FISICA`)
        REFERENCES PESSOA_FISICA (`ID`)
)
    ENGINE = InnoDB
    DEFAULT CHARSET = utf8MB4;

CREATE TABLE PESSOA_CONTATO
(
    ID               BIGINT(20) PRIMARY KEY AUTO_INCREMENT,
    NOME             VARCHAR(50) NOT NULL,
    EMAIL            VARCHAR(30),
    FONE_COMERCIAL   VARCHAR(30),
    FONE_RESIDENCIAL VARCHAR(30),
    FONE_CELULAR     VARCHAR(30),
    ID_PESSOA_FISICA BIGINT(20),


    INDEX FK_PESSOA_FISICA (ID_PESSOA_FISICA ASC),

    FOREIGN KEY (`ID_PESSOA_FISICA`)
        REFERENCES PESSOA_FISICA (`ID`)
)
    ENGINE = InnoDB
    DEFAULT CHARSET = utf8MB4;