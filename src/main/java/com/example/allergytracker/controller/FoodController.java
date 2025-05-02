package com.example.allergytracker.controller;

import com.example.allergytracker.model.Food;
import com.example.allergytracker.service.FoodService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/foods")
public class FoodController {
    private final FoodService foodService;

    public FoodController(FoodService foodService) {
        this.foodService = foodService;
    }

    @PostMapping("/add")
    public String addFood(@RequestBody Food food) {
        foodService.addFood(food);
        return "Food saved.";
    }

    @GetMapping("/all")
    public List<Food> getAllFoods() {
        return foodService.getAllFoods();
    }
}
