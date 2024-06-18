package com.gsilva.tacocloud.tacos.repository;

import org.springframework.data.repository.CrudRepository;

import com.gsilva.tacocloud.tacos.domain.ingredient.Ingredient;

public interface IngredientRepository extends CrudRepository<Ingredient, String> { }
