package com.example.allergytracker.controller;

import com.example.allergytracker.structure.FoodTree;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tree")
public class TreeController {

    private final FoodTree foodTree = new FoodTree(); // RAM içi geçici ağaç

    @PostMapping("/add")
    public String addFood(@RequestParam String name) {
        foodTree.insert(name);
        return "Food inserted into tree.";
    }

    @GetMapping("/search")
    public boolean searchFood(@RequestParam String name) {
        return foodTree.search(name);
    }

    @GetMapping("/all")
    public List<String> getAllFoods() {
        return foodTree.getAllFoods();
    }
}
