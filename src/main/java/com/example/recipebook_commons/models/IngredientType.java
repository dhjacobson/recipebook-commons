package com.example.recipebook_commons.models;

import com.example.recipebook_commons.enums.IngredientTypeCategory;
import com.example.recipebook_commons.enums.IngredientTypeCategory;
import com.fasterxml.jackson.annotation.JsonProperty;

public class IngredientType {

    private String title;
    private IngredientTypeCategory category;

    public IngredientType(@JsonProperty("title") String title, @JsonProperty ("category") IngredientTypeCategory category) {
        this.title = title;
        this.category = category;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public IngredientTypeCategory getCategory() {
        return category;
    }

    public void setCategory(IngredientTypeCategory category) {
        this.category = category;
    }
}
