package com.FeastFleet.FeastFleet.persistence.repositoryIMP;

import com.FeastFleet.FeastFleet.domain.dto.Review;
import com.FeastFleet.FeastFleet.domain.repository.ReviewRepositoryInter;
import com.FeastFleet.FeastFleet.persistence.crud.ResenaCrud;
import com.FeastFleet.FeastFleet.persistence.mapper.ReviewMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ReviewRepository implements ReviewRepositoryInter {
    private final ResenaCrud crud;

    private final ReviewMapper mapper;

    @Autowired
    public ReviewRepository(ResenaCrud crud, ReviewMapper mapper) {
        this.crud = crud;
        this.mapper = mapper;
    }


    @Override
    public List<Review> getAll() {
        List reviews = crud.findAll();
        return mapper.toReview(reviews);
    }
}
