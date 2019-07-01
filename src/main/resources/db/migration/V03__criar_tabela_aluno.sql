CREATE TABLE TIPO_PESSOA
(
    ID         INTEGER UNSIGNED NOT NULL PRIMARY KEY AUTO_INCREMENT,
    DESCRICAO  VARCHAR(50),
    OBSERVACAO VARCHAR(50)
)
    ENGINE = InnoDB
    DEFAULT CHARSET = utf8MB4;



CREATE TABLE ENDERECO_TIPO
(
    ID         INTEGER UNSIGNED NOT NULL PRIMARY KEY AUTO_INCREMENT,
    DESCRICAO  VARCHAR(50),
    OBSERVACAO VARCHAR(50)
)
    ENGINE = InnoDB
    DEFAULT CHARSET = utf8MB4;


CREATE TABLE ALUNO
(
    ID                   INTEGER UNSIGNED NOT NULL PRIMARY KEY AUTO_INCREMENT,
    NOME                 VARCHAR(50),
    DATA_MATRICULA       DATE,
    N_MATRICULA          VARCHAR(50),
    GRUPO                VARCHAR(50),
    TURNO                VARCHAR(50),
    LOCAL_TRAB_PAI       VARCHAR(50),
    LOCAL_TRAB_MAE       VARCHAR(50),

    CASA_PROPRIA         VARCHAR(50),
    QTO_FAMILIA          VARCHAR(50),
    QTO_FAMILIA_MAIORES  VARCHAR(50),
    QTO_FAMILIA_MENORES  VARCHAR(50),
    PAI_SEPARADOS        VARCHAR(50),
    DIA_VISITA           VARCHAR(50),
    NOME_ESCOLA          VARCHAR(50),
    ANO_CURSANDO         VARCHAR(50),
    TURMA                VARCHAR(50),
    TURNO_2              VARCHAR(50),
    BENEFICIO            VARCHAR(50),
    NIS                  VARCHAR(50),
    NIS_ALUNO            VARCHAR(50),
    SAUDE_ESF            VARCHAR(50),
    CRAS_REF             VARCHAR(50),
    CURSO_PRETENDIDO     VARCHAR(50),
    OBS_FILIACAO         VARCHAR(50),
    MEDICACAO            VARCHAR(50),
    ALERGIA              VARCHAR(50),
    COMPORTAMENTO_CASA   VARCHAR(50),
    COMPORTAMENTO_ESCOLA VARCHAR(50),
    MEDIA_ESCOLAR        VARCHAR(50),
    PRIORITARIO          VARCHAR(50),


    ID_PESSOA_FISICA         BIGINT(20),
    ID_PESSOA_FISICA_MAE     BIGINT(20),
    ID_PESSOA_FISICA_PAI     BIGINT(20),

    INDEX FK_PESSOA_FISICA (ID_PESSOA_FISICA ASC),
    INDEX FK_PESSOA_FISICA_MAE (ID_PESSOA_FISICA_MAE ASC),
    INDEX FK_PESSOA_FISICA_PAI (ID_PESSOA_FISICA_PAI ASC),

    FOREIGN KEY (`ID_PESSOA_FISICA`) REFERENCES PESSOA_FISICA (`ID`),
    FOREIGN KEY (`ID_PESSOA_FISICA_MAE`) REFERENCES PESSOA_FISICA (`ID`),
    FOREIGN KEY (`ID_PESSOA_FISICA_PAI`) REFERENCES PESSOA_FISICA (`ID`)
)
    ENGINE = InnoDB
    DEFAULT CHARSET = utf8MB4;


