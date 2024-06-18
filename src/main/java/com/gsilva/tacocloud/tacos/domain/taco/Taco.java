package com.gsilva.tacocloud.tacos.domain.taco;

import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.springframework.data.cassandra.core.cql.Ordering;
import org.springframework.data.cassandra.core.cql.PrimaryKeyType;
import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKeyColumn;
import org.springframework.data.cassandra.core.mapping.Table;

import com.datastax.oss.driver.api.core.uuid.Uuids;
import com.gsilva.tacocloud.tacos.domain.ingredient.Ingredient;
import com.gsilva.tacocloud.tacos.domain.ingredient.IngredientUDT;
import com.gsilva.tacocloud.tacos.domain.ingredient.mapper.IngredientMapper;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
@Table
public class Taco {

    @PrimaryKeyColumn(type = PrimaryKeyType.PARTITIONED)
    private UUID id = Uuids.timeBased();

    @PrimaryKeyColumn(type = PrimaryKeyType.CLUSTERED,
                      ordering = Ordering.DESCENDING)
    private Date createdAt = new Date();
    
    @NotNull
    @Size(min=5, message="Name must be at least 5 characters long")
    private String name;
    
    @NotNull
    @Size(min=1, message="You must choose at least 1 ingredient")
    @Column("ingredients")
    // Columns that contains collections of data must be collections of native
    // types or user-defined types (UDT) 
    private List<IngredientUDT> ingredients;

    public void addIngredient(Ingredient ingredient) {
        this.ingredients.add(IngredientMapper.toIngredientUDT(ingredient));
    }
}
