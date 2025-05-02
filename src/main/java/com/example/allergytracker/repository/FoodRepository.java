package com.example.allergytracker.repository;

import com.example.allergytracker.model.Food;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FoodRepository extends JpaRepository<Food, Long> {
}
