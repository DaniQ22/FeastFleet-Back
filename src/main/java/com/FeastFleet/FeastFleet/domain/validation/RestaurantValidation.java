package com.FeastFleet.FeastFleet.domain.validation;

import com.FeastFleet.FeastFleet.domain.dto.CategoryRestaurant;
import com.FeastFleet.FeastFleet.domain.dto.Restaurant;
import com.FeastFleet.FeastFleet.web.message.MessageException;

import java.util.List;
import java.util.Optional;

public class RestaurantValidation {


    public static boolean validationSave(Restaurant restaurant){

        if (restaurant.getRestaurantId() == null || restaurant.getRestaurantId().isEmpty()){
            throw new MessageException("The restaurant id will not be null");
        }

        if (restaurant.getName() == null || restaurant.getName().isEmpty()){
            throw new MessageException("Enter the name of the restaurant");
        }

        if (restaurant.getAddress() == null || restaurant.getAddress().isEmpty()){
            throw new MessageException("Enter the address of the restaurant");
        }

        List<CategoryRestaurant> categoryRestaurantLis = restaurant.getCategories();
        if (categoryRestaurantLis.isEmpty()){
            throw new MessageException("You must enter at least one category");
        }

        return true;

    }
}
