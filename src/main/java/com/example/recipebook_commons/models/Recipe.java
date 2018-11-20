package com.example.recipebook_commons.models;

import com.fasterxml.jackson.annotation.JsonCreator;

import java.util.ArrayList;
import java.util.List;

public class Recipe {

    private String title;
    private String author;
    private Recipe adaptedFrom;
    private Integer activeTimeMinutes;
    private Integer totalTimeMinutes;
    private Integer difficulty;
    private Integer serves;
    private String description;
    private List<RecipeIngredient> ingredients = new ArrayList<>();
    private List<RecipeStep> steps = new ArrayList<>();

    @JsonCreator
    public Recipe() {
    }

    public Recipe(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Recipe getAdaptedFrom() {
        return adaptedFrom;
    }

    public void setAdaptedFrom(Recipe adaptedFrom) {
        this.adaptedFrom = adaptedFrom;
    }

    public Integer getActiveTimeMinutes() {
        return activeTimeMinutes;
    }

    public void setActiveTimeMinutes(Integer activeTimeMinutes) {
        this.activeTimeMinutes = activeTimeMinutes;
    }

    public Integer getTotalTimeMinutes() {
        return totalTimeMinutes;
    }

    public void setTotalTimeMinutes(Integer totalTimeMinutes) {
        this.totalTimeMinutes = totalTimeMinutes;
    }

    public Integer getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(Integer difficulty) {
        this.difficulty = difficulty;
    }

    public void setServes(Integer serves) {
        this.serves = serves;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<RecipeIngredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<RecipeIngredient> ingredients) {
        this.ingredients = ingredients;
    }

    public List<RecipeStep> getSteps() {
        return steps;
    }

    public void setSteps(List<RecipeStep> steps) {
        this.steps = steps;
    }

    public void addIngredient(RecipeIngredient ingredient) {
        ingredients.add(ingredient);
    }

    public void addStep(RecipeStep step) {
        steps.add(step);
    }

    public void addStep(String instructions) {
        steps.add(new RecipeStep(instructions));
    }
}
