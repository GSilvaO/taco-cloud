package com.gsilva.tacocloud.tacos.domain.mapper;

import com.gsilva.tacocloud.tacos.domain.Ingredient;
import com.gsilva.tacocloud.tacos.domain.IngredientUDT;

public class IngredientMapper {
    public static IngredientUDT toIngredientUDT(Ingredient ingredient) {
        return new IngredientUDT(ingredient.getName(), ingredient.getType());
    }
}
