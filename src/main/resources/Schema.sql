    -- -----------------------------------------------------
-- Table "ROL"
-- -----------------------------------------------------
CREATE TABLE ROL(
    "id_rol" SERIAL NOT NULL,
    "nombre_rol" VARCHAR(15) NULL,
    PRIMARY KEY ("id_rol")
    );

  -- -----------------------------------------------------
-- Table "USUARIO"
-- -----------------------------------------------------
  CREATE TABLE USUARIO (
    "id_usuario" VARCHAR(20) NOT NULL,
    "nombre" VARCHAR(20)  NULL,
    "apellido" VARCHAR(20) NULL,
    "correo_electronico" VARCHAR(30) NULL,
    "contraseña" VARCHAR(18) NULL,
    "id_rol" INT NOT NULL, 
    PRIMARY KEY ("id_usuario"),
    FOREIGN KEY ("id_rol") REFERENCES ROL ("id_rol")
    );

    
    -- -----------------------------------------------------
-- Table "RESTAURANTE"
-- -----------------------------------------------------
CREATE TABLE RESTAURANTE (
    "id_restaurante" VARCHAR(20) NOT NULL,
    "nombre" VARCHAR(30) NULL,
    "tipo_cocina" VARCHAR(30) NULL,
    "direccion" VARCHAR(30) NULL,
    "descripcion" VARCHAR(100) NULL,
    "calificacion" FLOAT(5) NULL,
    PRIMARY KEY ("id_restaurante")
);


    -- -----------------------------------------------------
-- Table "RESERVA"
-- -----------------------------------------------------
CREATE Table RESERVA (
    "id_reserva" SERIAL PRIMARY KEY,
    "id_usuario" VARCHAR(20) NOT NULL,
    "id_restaurante" VARCHAR(20) NOT NULL,
    "fecha_hora" TIMESTAMP NULL,
    "numero_comnsales" INT NULL,
    FOREIGN KEY("id_usuario") REFERENCES USUARIO ("id_usuario")
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
    FOREIGN KEY ("id_restaurante") REFERENCES RESTAURANTE ("id_restaurante")
    ON DELETE NO ACTION
    ON UPDATE NO ACTION
    );

                -- -----------------------------------------------------
    -- Table "RESERVA_CONFIRMADA"
    -- -----------------------------------------------------

 CREATE TABLE RESERVA_CONFIRMADA (
     "id_reserva_confirmada" SERIAL PRIMARY KEY,
     "id_reserva" INT NOT NULL,
     codigo_confirmacion SERIAL NOT NULL,
     fecha_confirmacion TIMESTAMP NULL,
     FOREIGN KEY ("id_reserva") REFERENCES RESERVA ("id_reserva")
 );

        -- -----------------------------------------------------
-- Table "RESEÑA"
-- -----------------------------------------------------
CREATE TABLE RESENA (
    "id_reseña" SERIAL PRIMARY KEY,
    "id_usuario" VARCHAR(20) NOT NULL,
    "id_restaurante" VARCHAR(20) NOT NULL,
    "comentario" VARCHAR(100) NULL,
    "calificacion" FLOAT NULL,
    FOREIGN KEY("id_usuario") REFERENCES USUARIO ("id_usuario")
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
    FOREIGN KEY ("id_restaurante") REFERENCES RESTAURANTE ("id_restaurante")
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);

            -- -----------------------------------------------------
-- Table "IMAGEN"
-- -----------------------------------------------------

CREATE TABLE IMAGEN (
"id_imagen" SERIAL NOT NULL,
"nombre" VARCHAR(20) NULL,
"tipo_contenido" VARCHAR (20) NULL,
"datos"  BYTEA NULL,
"id_restaurante" VARCHAR(20) NULL,
PRIMARY KEY ("id_imagen"),
FOREIGN KEY ("id_restaurante") REFERENCES RESTAURANTE ("id_restaurante")
);

            -- -----------------------------------------------------
-- Table "PREFERENCIAS_GASTRONOMICAS"
-- -----------------------------------------------------
CREATE TABLE PREFERENCIAS_GASTRONOMICAS (
    "id_preferencia" SERIAL NOT NULL,
    "id_usuario" VARCHAR(20) NOT NULL,
    "preferencia" VARCHAR(20) NULL,
    PRIMARY KEY ("id_preferencia"),
    FOREIGN KEY ("id_usuario") REFERENCES USUARIO ("id_usuario")
);

            -- -----------------------------------------------------
-- Table "CHAT_GPT"
-- -----------------------------------------------------

CREATE TABLE CHATGP (
    "id_chat" SERIAL NOT NULL,
    "id_usuario" VARCHAR(20) NOT NULL,
    "contenido" VARCHAR(200) NULL,
    "fecha_hora" TIMESTAMP NULL,
    PRIMARY KEY ("id_chat"),
    FOREIGN KEY ("id_usuario") REFERENCES USUARIO ("id_usuario") 
);






