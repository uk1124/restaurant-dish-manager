package com.example.restaurantdishmanager.repository;

import com.example.restaurantdishmanager.model.Dish;

import org.springframework.data.jpa.repository.JpaRepository;

public interface DishRepository extends JpaRepository<Dish, Long> {
}