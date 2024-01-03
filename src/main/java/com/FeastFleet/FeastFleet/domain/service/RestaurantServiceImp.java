package com.FeastFleet.FeastFleet.domain.service;

import com.FeastFleet.FeastFleet.domain.dto.Category;
import com.FeastFleet.FeastFleet.domain.dto.CategoryRestaurant;
import com.FeastFleet.FeastFleet.domain.dto.ImgRestaurant;
import com.FeastFleet.FeastFleet.domain.dto.Restaurant;
import com.FeastFleet.FeastFleet.domain.repository.RestaurantRepositoryInter;
import com.FeastFleet.FeastFleet.domain.validation.RestaurantValidation;
import com.FeastFleet.FeastFleet.persistence.entity.ImagenRestaurante;
import com.FeastFleet.FeastFleet.web.message.MessageException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RestaurantServiceImp implements RestaurantServiceInter{

    private final RestaurantRepositoryInter restaurantRepositoryInter;

    @Autowired
    public RestaurantServiceImp(RestaurantRepositoryInter restaurantRepositoryInter) {
        this.restaurantRepositoryInter = restaurantRepositoryInter;
    }


    @Override
    public List<Restaurant> getAll() {
    return restaurantRepositoryInter.getAll();
    }

    @Override
    public Restaurant save(Restaurant restaurant) {
        String restaurantId = restaurant.getRestaurantId();

        RestaurantValidation.validationSave(restaurant);

        Optional<Restaurant> restaurantOptional = restaurantRepositoryInter.getById(restaurantId);

        if (restaurantOptional.isPresent()){
            throw  new MessageException("The restaurant is already");
        }

        List<ImgRestaurant> imagenRestaurantes  = restaurant.getImage();
        if (imagenRestaurantes != null && !imagenRestaurantes.isEmpty()){
            imagenRestaurantes.forEach(image -> image.setRestaurantId(restaurantId));
        }

        List<CategoryRestaurant> categories = restaurant.getCategories();
        if (categories!=null && !categories.isEmpty()){
            categories.forEach(cat -> cat.setRestaurantId(restaurantId));
        }

        return restaurantRepositoryInter.save(restaurant);
    }

    @Override
    public Optional<Restaurant> getById(String id) {
        return restaurantRepositoryInter.getById(id);
    }

    @Override
    public void delete(String id) {
        restaurantRepositoryInter.detele(id);
    }
}
