package com.gilberto.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gilberto.course.entities.enums.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
