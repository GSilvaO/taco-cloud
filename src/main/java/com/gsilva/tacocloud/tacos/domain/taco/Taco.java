package com.gsilva.tacocloud.tacos.domain.taco;

import java.util.Date;
import java.util.List;

import com.gsilva.tacocloud.tacos.domain.ingredient.Ingredient;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class Taco {

    private Date createdAt = new Date();
    
    @NotNull
    @Size(min=5, message="Name must be at least 5 characters long")
    private String name;
    
    @NotNull
    @Size(min=1, message="You must choose at least 1 ingredient")
    private List<Ingredient> ingredients;

    public void addIngredient(Ingredient ingredient) {
        this.ingredients.add(ingredient);
    }
}
