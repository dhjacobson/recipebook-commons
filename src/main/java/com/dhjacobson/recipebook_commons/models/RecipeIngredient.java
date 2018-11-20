package com.dhjacobson.recipebook_commons.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class RecipeIngredient extends RecipeElement {

    private IngredientType type;
    private IngredientQuantity quantity;

    @JsonCreator
    public RecipeIngredient(@JsonProperty("type") IngredientType type, @JsonProperty("quantity") IngredientQuantity quantity) {
        this.type = type;
        this.quantity = quantity;
    }

    public IngredientType getType() {
        return type;
    }

    public void setType(IngredientType type) {
        this.type = type;
    }

    public IngredientQuantity getQuantity() {
        return quantity;
    }

    public void setQuantity(IngredientQuantity quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return quantity.toString() + " " + this.type.getTitle();
    }
}
