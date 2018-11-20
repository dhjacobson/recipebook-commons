package com.example.recipebook_commons.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RecipeStep extends RecipeElement {

    private String text;

    public RecipeStep(@JsonProperty("text") String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
