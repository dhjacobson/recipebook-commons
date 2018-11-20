package dal;

import com.example.recipebook_commons.api.RecipebookApiError;
import org.junit.Test;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import static org.junit.Assert.assertEquals;

public class RecipebookApiErrorTest {

    @Test
    public void targetConstructorMessage() {
        String uri = "http://localhost:8080/recipes/0";

        Client client = ClientBuilder.newClient();
        WebTarget target =  client.target(uri);
        RecipebookApiError e = new RecipebookApiError(target);
        assertEquals(RecipebookApiError.MESSAGE_PREFIX + uri, e.getMessage());
    }

}
