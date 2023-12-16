package com.FeastFleet.FeastFleet.domain.validation;

import com.FeastFleet.FeastFleet.domain.dto.Review;
import com.FeastFleet.FeastFleet.web.message.MessageException;

public class ReviewValidation {

    public static boolean validationSaveReview(Review review) {
        if (review.getComment().isEmpty()) {
            throw new MessageException("Escriba un comentario");
        }
        if (review.getQualification() < 1 || review.getQualification()>5) {
            throw new MessageException("Ingrese una calificacion entre 1 y 5");
        }
        return true;
    }
}
