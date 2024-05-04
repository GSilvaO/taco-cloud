package com.gsilva.tacocloud.tacos.repository;

import org.springframework.data.repository.CrudRepository;

import com.gsilva.tacocloud.tacos.domain.TacoOrder;

public interface OrderRepository extends CrudRepository<TacoOrder, Long> { }
