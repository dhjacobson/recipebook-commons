package com.dhjacobson.recipebook_commons.api;

import com.dhjacobson.recipebook_commons.models.Recipe;

import javax.ws.rs.client.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

public class StupidDataAccessLayer {

    WebTarget base;

    public StupidDataAccessLayer(String host) {
        Client client = ClientBuilder.newClient();
        this.base = client.target(String.format("http://%s:8080/recipes", host));

        String url = "http://my-json-feed";
    }

    public StupidDataAccessLayer() {
        this("10.0.2.2");
    }

    public Recipe fetchRecipe(int recipeId) throws RecipebookApiError {

        WebTarget target = base.path(Integer.toString(recipeId));
        try {
            return target.request(MediaType.APPLICATION_JSON).get(Recipe.class);
        } catch (javax.ws.rs.ProcessingException e) {
            throw new RecipebookApiError(target);
        }
    }

    public int createRecipe(Recipe recipe) {
        Entity<Recipe> entityToPost = Entity.entity(recipe, MediaType.APPLICATION_JSON);

        WebTarget target = base.path("create");
        Response response = target.request(MediaType.APPLICATION_JSON).post(entityToPost);
        return response.readEntity(Integer.class);
    }

    public int updateRecipe(int recipeId, Recipe newRecipe) {
        Entity<Recipe> entityToPut = Entity.entity(newRecipe, MediaType.APPLICATION_JSON);

        WebTarget target = base.path(Integer.toString(recipeId) + "/update");
        Response response = target.request(MediaType.APPLICATION_JSON).put(entityToPut);
        return response.readEntity(Integer.class);
    }

}
