-- -----------------------------------------------------
-- Table "ROL"
-- -----------------------------------------------------
CREATE TABLE CATEGORIA(
"id_categoria" SERIAL PRIMARY KEY,
"nombre_categoria" VARCHAR(50)  NULL,
 "descripcion" VARCHAR(100) NULL
 );

 -- -----------------------------------------------------
 -- Table "RESTAURANTE"
 -- -----------------------------------------------------

 CREATE TABLE RESTAURANTE (
     "id_restaurante" VARCHAR(30) NOT NULL,
     "nombre" VARCHAR(30) NULL,
     "tipo_cocina" VARCHAR(30) NULL,
     "direccion" VARCHAR(30) NULL,
     "descripcion" VARCHAR(100) NULL,
     "calificacion" FLOAT(5) NULL,
     PRIMARY KEY ("id_restaurante")
 );

    -- --------------------------------------------------
 -- Table "RESTAURANTE_CATEGORIA"
 -- -----------------------------------------------------
 CREATE TABLE RESTAURANTE_CATEGORIA (
 "id_categoria" INT NOT NULL,
 "id_restaurante" VARCHAR NOT NULL,
 PRIMARY KEY ("id_categoria", "id_restaurante"),
 FOREIGN KEY ("id_categoria") REFERENCES CATEGORIA ("id_categoria"),
 FOREIGN KEY ("id_restaurante") REFERENCES RESTAURANTE ("id_restaurante")

 );

     -- -----------------------------------------------------
     -- Table "CLIENTE"
     -- -----------------------------------------------------
     CREATE TABLE CLIENTE(
     "id_cliente" VARCHAR(30) PRIMARY KEY,
     "nombre" VARCHAR(30) NOT NULL,
     "apellido" VARCHAR(30) NOT NULL,
     "correo_electronico" VARCHAR(30) NOT NULL,
     "telefono" VARCHAR(30) NOT NULL,
     "direccion" VARCHAR(30) NOT NULL
     );

  -- ---------------------------------------------------
-- Table "USUARIO"
-- -----------------------------------------------------
  CREATE TABLE USUARIO (
    "nombre_usuario" VARCHAR(30) PRIMARY KEY,
    "contraseña" VARCHAR(300) NULL,
    "locked" BOOLEAN,
    "disabled" BOOLEAN

    );

     -- ---------------------------------------------------
    -- Table "ROL"
    -- ----------------------------------------------------
    CREATE TABLE ROL(
        "id_rol" SERIAL NOT NULL,
        "nombre_rol" VARCHAR(15) NULL,
        "id_usuario" VARCHAR(20) NOT NULL,

        PRIMARY KEY ("id_rol"),
        FOREIGN KEY("id_usuario") REFERENCES USUARIO ("nombre_usuario")
        );


    -- -------------------------------------------------
-- Table "RESERVA"
-- -----------------------------------------------------
CREATE Table RESERVA (
    "id_reserva" SERIAL PRIMARY KEY,
    "id_cliente" VARCHAR(30) NOT NULL,
    "id_restaurante" VARCHAR(30) NOT NULL,
    "fecha_hora" TIMESTAMP NULL,
    "numero_comnsales" INT NULL,
    FOREIGN KEY("id_cliente") REFERENCES CLIENTE ("id_cliente")
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
    FOREIGN KEY ("id_restaurante") REFERENCES RESTAURANTE ("id_restaurante")
    ON DELETE NO ACTION
    ON UPDATE NO ACTION
    );

                -- -----------------------------------------
    -- Table "RESERVA_CONFIRMADA"
    -- -----------------------------------------------------

 CREATE TABLE RESERVA_CONFIRMADA (
     "id_reserva_confirmada" SERIAL PRIMARY KEY,
     "id_reserva" INT NOT NULL,
     codigo_confirmacion SERIAL NOT NULL,
     fecha_confirmacion TIMESTAMP NULL,
     FOREIGN KEY ("id_reserva") REFERENCES RESERVA ("id_reserva")
 );

        -- ---------------------------------------------
-- Table "RESEÑA"
-- -----------------------------------------------------
CREATE TABLE RESENA (
    "id_reseña" SERIAL PRIMARY KEY,
    "id_cliente" VARCHAR(30) NOT NULL,
    "id_restaurante" VARCHAR(30) NOT NULL,
    "comentario" VARCHAR(100) NULL,
    "calificacion" FLOAT NULL,
    FOREIGN KEY("id_cliente") REFERENCES CLIENTE ("id_cliente")
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
    FOREIGN KEY ("id_restaurante") REFERENCES RESTAURANTE ("id_restaurante")
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);

            -- ------------------------------------------
-- Table "IMAGEN"
-- -----------------------------------------------------

CREATE TABLE IMAGEN ("id_imagen" VARCHAR(500) primary key,
					"id_restaurante" VARCHAR(20) NOT NULL,
					FOREIGN KEY ("id_restaurante") REFERENCES restaurante("id_restaurante"));

            -- -----------------------------------------
-- Table "PREFERENCIAS_GASTRONOMICAS"
-- -----------------------------------------------------
CREATE TABLE PREFERENCIAS_GASTRONOMICAS (
    "id_preferencia" SERIAL NOT NULL,
    "id_cliente" VARCHAR(30) NOT NULL,
    "preferencia" VARCHAR(30) NULL,
    PRIMARY KEY ("id_preferencia"),
    FOREIGN KEY ("id_cliente") REFERENCES CLIENTE ("id_cliente")
);

            -- -----------------------------------------
-- Table "CHAT_GPT"
-- -----------------------------------------------------

CREATE TABLE CHATGP (
    "id_chat" SERIAL NOT NULL,
    "id_cliente" VARCHAR(30) NOT NULL,
    "contenido" VARCHAR(200) NULL,
    "fecha_hora" TIMESTAMP NULL,
    PRIMARY KEY ("id_chat"),
    FOREIGN KEY ("id_cliente") REFERENCES CLIENTE ("id_cliente")
);