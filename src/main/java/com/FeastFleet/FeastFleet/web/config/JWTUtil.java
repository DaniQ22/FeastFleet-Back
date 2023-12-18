package com.FeastFleet.FeastFleet.web.config;


import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.concurrent.TimeUnit;

@Component
public class JWTUtil {

    private static String SECRET_KEY = "f34st_fl33d";

    private static Algorithm Algorith = Algorithm.HMAC256(SECRET_KEY); // Algoritmo de encriptación del JWT

    // CREACION DEL TOKEN

    public String create(String username){
        return JWT.create()
                .withSubject(username)
                .withIssuer("UnCopaDeVino")
                .withIssuedAt(new Date())
                .withExpiresAt(new Date(System.currentTimeMillis() + TimeUnit.DAYS.toMillis(15)))
                .sign(Algorith);


    }


}
