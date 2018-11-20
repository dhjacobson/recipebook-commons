package com.dhjacobson.recipebook_commons.api;

import javax.ws.rs.client.WebTarget;

public class RecipebookApiError extends Error {

    public static String MESSAGE_PREFIX = "Cannot find service at ";

    public RecipebookApiError(String message) {
        super(message);
    }

    public RecipebookApiError(WebTarget target) {
        super(MESSAGE_PREFIX + target.getUri().toString());
    }

}
