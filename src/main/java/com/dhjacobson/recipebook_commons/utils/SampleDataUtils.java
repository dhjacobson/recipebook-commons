package com.dhjacobson.recipebook_commons.utils;

import com.dhjacobson.recipebook_commons.models.IngredientQuantity;
import com.dhjacobson.recipebook_commons.enums.IngredientTypeCategory;
import com.dhjacobson.recipebook_commons.enums.QuantityUnit;
import com.dhjacobson.recipebook_commons.models.IngredientType;
import com.dhjacobson.recipebook_commons.models.Recipe;
import com.dhjacobson.recipebook_commons.models.RecipeIngredient;

import java.util.ArrayList;

public class SampleDataUtils {

    public static ArrayList<Recipe> sampleRecipes() {
        ArrayList<Recipe> recipes = new ArrayList<>();

        Recipe firstRecipe = new Recipe();
        firstRecipe.setTitle("Favorite Meatloaf");
        firstRecipe.setAuthor("James Beard");
        firstRecipe.setActiveTimeMinutes(60);
        firstRecipe.setTotalTimeMinutes(240);
        firstRecipe.setDifficulty(2);
        firstRecipe.setDescription("This meatloaf is amazing!");

        IngredientType groundPork = new IngredientType("ground pork", IngredientTypeCategory.MEAT);
        RecipeIngredient porkForMeatloaf = new RecipeIngredient(
                groundPork,
                new IngredientQuantity(1.0, QuantityUnit.POUND)
        );
        firstRecipe.addIngredient(porkForMeatloaf);

        IngredientType groundBeef = new IngredientType("ground beef", IngredientTypeCategory.MEAT);
        RecipeIngredient beefForMeatloaf = new RecipeIngredient(
                groundBeef,
                new IngredientQuantity(2.0, QuantityUnit.POUND)
        );
        firstRecipe.addIngredient(beefForMeatloaf);

        IngredientType breadCrumbs = new IngredientType("bread crumbs", IngredientTypeCategory.DRY_INGREDIENT);
        RecipeIngredient breadCrumbsForMeatloaf = new RecipeIngredient(
                breadCrumbs,
                new IngredientQuantity(1.5, QuantityUnit.CUP)
        );
        firstRecipe.addIngredient(breadCrumbsForMeatloaf);

        firstRecipe.addStep("Preheat oven to 350.");
        firstRecipe.addStep("Combine ground beef, ground pork, and bread crumbs into a in a large bowl. Mix with hands, just enough for ingredients to be combined. DO NOT OVERMIX.");
        firstRecipe.addStep("Form into a loaf on a pan with an area below for the grease to drain into.");
        firstRecipe.addStep("Bake at 350 for two hours.");

        recipes.add(firstRecipe);


        Recipe secondRecipe = new Recipe();
        secondRecipe.setTitle("Salmon with Soy-Mustard Sauce");
        secondRecipe.setAuthor("Cooks' Illustrated");
        secondRecipe.setTotalTimeMinutes(35);
        secondRecipe.setDifficulty(2);

        IngredientType salmonFillet = new IngredientType("salmon fillet", IngredientTypeCategory.FISH);
        RecipeIngredient salmonForSalmonAndSoy = new RecipeIngredient(
                salmonFillet,
                new IngredientQuantity(1.0, QuantityUnit.COUNT)
        );
        secondRecipe.addIngredient(salmonForSalmonAndSoy);

        IngredientType soyMustardSauce = new IngredientType("soy mustard sauce", IngredientTypeCategory.SPICE);
        RecipeIngredient soyForSalmonAndSoy = new RecipeIngredient(
                soyMustardSauce,
                new IngredientQuantity(0.5, QuantityUnit.CUP)
        );
        secondRecipe.addIngredient(soyForSalmonAndSoy);

        secondRecipe.addStep("Preheat oven to 275.");
        secondRecipe.addStep("Lather salmon with olive oil. Sprinkle salt over salmon.");
        secondRecipe.addStep("Bake salmon at 275 for 25 minutes, or until white juices start to come out.");
        secondRecipe.addStep("Brush salmon with soy-mustard, and serve.");

        recipes.add(secondRecipe);

        return recipes;
    }

}
