package com.gilberto.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gilberto.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
