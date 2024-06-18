package com.gsilva.tacocloud.tacos.repository;

import org.springframework.data.repository.CrudRepository;

import com.gsilva.tacocloud.tacos.domain.taco.TacoOrder;

public interface OrderRepository extends CrudRepository<TacoOrder, String> { }
