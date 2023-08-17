package com.gilberto.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gilberto.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
