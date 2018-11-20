package com.example.recipebook_commons.models;

import com.example.recipebook_commons.enums.QuantityUnit;
import com.example.recipebook_commons.utils.RecipeUtils;
import com.fasterxml.jackson.annotation.JsonProperty;

public class IngredientQuantity {

    private Double value;
    private QuantityUnit unit;

    public IngredientQuantity(@JsonProperty("value") Double value, @JsonProperty("unit") QuantityUnit unit) {
        this.value = value;
        this.unit = unit;
    }

    public Double getValue() {
        return value;
    }

    public QuantityUnit getUnit() {
        return unit;
    }

    @Override
    public String toString() {
        String toReturn = RecipeUtils.doubleToShortText(value);

        if (unit != QuantityUnit.COUNT) {
            toReturn += " " + (value==1 ? unit.getShortName() : unit.getShortNamePlural());
        }
        return toReturn;
    }

    //    private Double count;
//    private Quantity<Volume> volume;
//    private Quantity<Mass> mass;
//
//    public IngredientQuantity(Double count, Quantity<Volume> volume, Quantity<Mass> mass) {
//        this.count = count;
//        this.volume = volume;
//        this.mass = mass;
//    }
//
//    public static IngredientQuantity byCount(Double count) {
//        return new IngredientQuantity(count, null, null);
//    }
//
//    public static IngredientQuantity byVolume(Quantity<Volume> volume) {
//        return new IngredientQuantity(null, volume, null);
//    }
//
//    public static IngredientQuantity byMass(Quantity<Mass> mass) {
//        return new IngredientQuantity(null, null, mass);
//    }
//
//    public Double getCount() {
//        return count;
//    }
//
//    public void setCount(Double count) {
//        this.count = count;
//    }
//
//    public Quantity<Volume> getVolume() {
//        return volume;
//    }
//
//    public void setVolume(Quantity<Volume> volume) {
//        this.volume = volume;
//    }
//
//    public Quantity<Mass> getMass() {
//        return mass;
//    }
//
//    public void setMass(Quantity<Mass> mass) {
//        this.mass = mass;
//    }
//
//    @Override
//    public String toString() {
//        if (volume != null) {
//            return String.format(Locale.US, "%s %s", RecipeUtils.doubleToShortText(volume.getValue().doubleValue()), volume.getUnit().getName().toLowerCase());
//        }
//        if (mass != null) {
//            return String.format(Locale.US, "%s %s", RecipeUtils.doubleToShortText(mass.getValue().doubleValue()), mass.getUnit().getName().toLowerCase());
//        }
//        if (count != null) {
//            return count.toString();
//        }
//        throw new IllegalStateException("IngredientQuantity has no values.");
//    }
}
