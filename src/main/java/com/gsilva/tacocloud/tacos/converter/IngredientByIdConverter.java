package com.gsilva.tacocloud.tacos.converter;

import java.util.HashMap;
import java.util.Map;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import com.gsilva.tacocloud.tacos.domain.Ingredient;
import com.gsilva.tacocloud.tacos.domain.Type;
import com.gsilva.tacocloud.tacos.repository.IngredientRepository;

@Component
public class IngredientByIdConverter implements Converter<String, Ingredient> {

    private final IngredientRepository ingredientRepository;
    
    public IngredientByIdConverter(IngredientRepository ingredientRepository) {
      this.ingredientRepository = ingredientRepository;
    }

    @Override
    public Ingredient convert(String id) {
        return ingredientRepository.findById(id).orElse(null);
    }

}
