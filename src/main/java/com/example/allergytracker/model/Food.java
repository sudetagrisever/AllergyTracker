package com.example.allergytracker.model;

import jakarta.persistence.*;

@Entity
public class Food {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String ingredients;

    public Food() {}

    public Food(String name, String ingredients) {
        this.name = name;
        this.ingredients = ingredients;
    }

    public Long getId() { return id; }
    public String getName() { return name; }
    public String getIngredients() { return ingredients; }

    public void setId(Long id) { this.id = id; }
    public void setName(String name) { this.name = name; }
    public void setIngredients(String ingredients) { this.ingredients = ingredients; }
}
