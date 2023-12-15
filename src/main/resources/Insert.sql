--INSERT TO ROL
INSERT INTO ROL (nombre_rol) VALUES
('Admin'),
('Cliente');

--INSRT TO USUARIO
INSERT INTO USUARIO VALUES ('1005438555', 'PAOLA LUCIA', 'MARTINEZ', 'PaolaM@gmail.com', 'Paola123', 2),
('1004563215', 'Gabriel', 'Luna', 'gabiElMejor@gmail.com', 'GabiLuna321', 2),
('1005897832', 'Sofia', 'Tous', 'tousSofii@gmail.com', 'SalsaDeTomate', 2);

--INSERT TO RESTAURANTE
INSERT INTO RESTAURANTE VALUES ('FFFFF1D', 'RESTAURANTE LA ABUELA', 'GOURMET', 
								'SAHAGUN CALLE 32', 'RESTAURANTE HOGAREÑO', 4.2),
								('FFFFF2D', 'TWIN DISHES', 'GOURMET',
                                								'SAHAGUN KRA 50', 'RESTAURANTE BAR', 4.6);


--INSERT TO RESEÑA
INSERT INTO RESENA (id_usuario, id_restaurante, comentario, calificacion) VALUES ('1005438555', 'FFFFF1D', 'EXCELENTE SEVICIO POR PARTE DE LA ABUELITA',
						  4);

--INSERT TO RESERVA
INSERT INTO RESERVA (id_usuario, id_restaurante, fecha_hora, numero_comnsales) VALUES('1005438555', 'FFFFF1D', '2023/12/13', 5);

--INSERT TO RESERVA_CONFIRMADA
INSERT INTO RESERVA_CONFIRMADA (id_reserva, codigo_confirmacion, fecha_confirmacion ) VALUES(1, 1223, '2023/12/13');


INSERT INTO PREFERENCIAS_GASTRONOMICAS (id_usuario, preferencia) VALUES ('1005438555', 'Carnes Maduradas'),
('1005438555', 'Bowls');