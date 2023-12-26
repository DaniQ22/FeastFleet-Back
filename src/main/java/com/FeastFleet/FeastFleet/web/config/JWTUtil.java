package com.FeastFleet.FeastFleet.web.config;


import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTVerificationException;

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

    public boolean isValid(String jwt){
        try{
            JWT.require(Algorith)
                    .build()
                    .verify(jwt);

            return true;

        }catch (JWTVerificationException e){
            return false;
        }
    }

    public String getUsername(String jwt){
        return JWT.require(Algorith)
                .build()
                .verify(jwt)
                .getSubject();
    }

}
