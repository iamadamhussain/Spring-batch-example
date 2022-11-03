package com.adam.springbatchexample1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.adam.springbatchexample1.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {
}
