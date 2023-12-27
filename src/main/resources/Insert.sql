
INSERT INTO CATEGORIA (nombre_categoria, descripcion) VALUES ('Corriente', 'Restaurantes donde se prepara comida que refleja lo que los comensales consumen en sus hogares.'),
('Bar', 'Se trata de restaurantes donde su funcion príncipal es vender licores'),('Comidas rápidas','Comidas rápidas tales como hamburguesas, pizzas, perros, etc'),
('Asados', 'Restaurantes donde principalmente se venden asados');
--INSERT TO ROL


--INSRT TO CLIENTE
INSERT INTO CLIENTE VALUES ('1005438555', 'PAOLA LUCIA', 'MARTINEZ', 'PaolaM@gmail.com', '7775473', 'calle 12'),
('1004563215', 'Gabriel', 'Luna', 'gabiElMejor@gmail.com', '7775698', 'calle 15'),
('1005897832', 'Sofia', 'Tous', 'tousSofii@gmail.com', '7774115', 'calle 19');

INSERT INTO USUARIO VALUES  ('sofySol', '$2a$12$gX2JJUH3FFMtHqMMLVVJq.o5lgTvlgO4p6X9gvUkIsxU03hkG92ki', false, false), ('DaniQ22','$2a$12$/yHgE8RuJhnuvaNt.zaCN.t9ZmW2shqBpLm46PG25DMiWAfve3v9C', false, false);

INSERT INTO ROL (nombre_rol, id_usuario) VALUES
('Admin', 'DaniQ22'),
('Cliente', 'SofySol')
;

--INSERT TO RESTAURANTE
INSERT INTO RESTAURANTE VALUES ('FFFFF1D', 'RESTAURANTE LA ABUELA', 'GOURMET',
								'SAHAGUN CALLE 32', 'RESTAURANTE HOGAREÑO', 4.2),
								('FFFFF2D', 'TWIN DISHES', 'GOURMET',
                                								'SAHAGUN KRA 50', 'RESTAURANTE BAR', 4.6);


--INSERT TO RESEÑA
INSERT INTO RESENA (id_cliente, id_restaurante, comentario, calificacion) VALUES ('1005438555', 'FFFFF1D', 'EXCELENTE SEVICIO POR PARTE DE LA ABUELITA',
						  4);

--INSERT TO RESERVA
INSERT INTO RESERVA (id_cliente, id_restaurante, fecha_hora, numero_comnsales) VALUES('1005438555', 'FFFFF1D', '2023/12/13', 5);

--INSERT TO RESERVA_CONFIRMADA
INSERT INTO RESERVA_CONFIRMADA (id_reserva, codigo_confirmacion, fecha_confirmacion ) VALUES(1, 1223, '2023/12/13');


INSERT INTO PREFERENCIAS_GASTRONOMICAS (id_cliente, preferencia) VALUES ('1005438555', 'Carnes Maduradas'),
('1005438555', 'Bowls');

insert into imagen ("id_imagen", "id_restaurante") values ('https://images.unsplash.com/photo-1517248135467-4c7edcad34c4?q=80&w=1470&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D',
														  'FFFFF2D');