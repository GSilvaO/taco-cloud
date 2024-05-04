package com.gsilva.tacocloud.tacos.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import lombok.Data;

@Data
@Table
public class Ingredient {

    @Id
    private final String id;
    private final String name;
    private final Type type;
}