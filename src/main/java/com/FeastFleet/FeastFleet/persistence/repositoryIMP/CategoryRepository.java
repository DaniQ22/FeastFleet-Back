package com.FeastFleet.FeastFleet.persistence.repositoryIMP;

import com.FeastFleet.FeastFleet.domain.dto.Category;
import com.FeastFleet.FeastFleet.domain.repository.CategoryRepositoryInter;
import com.FeastFleet.FeastFleet.persistence.crud.CategoryCrud;
import com.FeastFleet.FeastFleet.persistence.entity.Categoria;
import com.FeastFleet.FeastFleet.persistence.mapper.CategoryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CategoryRepository implements CategoryRepositoryInter {

    private  final CategoryCrud crud;

    private final CategoryMapper mapper;

    @Autowired
    public CategoryRepository(CategoryCrud crud, CategoryMapper mapper) {
        this.crud = crud;
        this.mapper = mapper;
    }

    @Override
    public List<Category> getAll() {
        List<Categoria> categorias = crud.findAll();
        return mapper.toCategories(categorias);
    }
}
