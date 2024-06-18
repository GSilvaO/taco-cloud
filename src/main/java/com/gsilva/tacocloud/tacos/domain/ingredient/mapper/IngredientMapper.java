package com.gsilva.tacocloud.tacos.domain.ingredient.mapper;

import com.gsilva.tacocloud.tacos.domain.ingredient.Ingredient;
import com.gsilva.tacocloud.tacos.domain.ingredient.IngredientUDT;

public class IngredientMapper {
    public static IngredientUDT toIngredientUDT(Ingredient ingredient) {
        return new IngredientUDT(ingredient.getName(), ingredient.getType());
    }
}
