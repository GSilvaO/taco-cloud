package com.gsilva.tacocloud.tacos.domain.taco;

import java.util.List;

import org.springframework.data.cassandra.core.mapping.UserDefinedType;

import com.gsilva.tacocloud.tacos.domain.ingredient.IngredientUDT;

import lombok.Data;

@Data
@UserDefinedType("taco")
public class TacoUDT {

    private final String name;
    private final List<IngredientUDT> ingredients;

}
