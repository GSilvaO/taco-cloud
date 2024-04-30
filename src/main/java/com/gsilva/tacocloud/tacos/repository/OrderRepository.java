package com.gsilva.tacocloud.tacos.repository;

import com.gsilva.tacocloud.tacos.domain.TacoOrder;

public interface OrderRepository {
    TacoOrder save(TacoOrder order);
}
