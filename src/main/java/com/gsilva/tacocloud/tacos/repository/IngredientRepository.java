package com.gsilva.tacocloud.tacos.repository;

import com.gsilva.tacocloud.tacos.domain.Ingredient;

import org.springframework.data.repository.CrudRepository;

public interface IngredientRepository extends CrudRepository<Ingredient, String> { }
