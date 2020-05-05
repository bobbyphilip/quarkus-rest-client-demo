package org.acme;

import javax.inject.Inject;
import javax.json.Json;
import javax.json.JsonObject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.eclipse.microprofile.rest.client.inject.RestClient;

@Path("/hello")
public class ExampleResource {

    @Inject
    @RestClient
    MailService mailService;

    @Produces(MediaType.TEXT_PLAIN)
    @GET
    public String hello() {
        System.out.print("In the API");
        JsonObject key = Json.createObjectBuilder().add("key", "ABCD").build();
        System.out.println("The json built is "+key);
        JsonObject response = mailService.ping(key);
        System.out.println("The response is " + response);
        return "hello";
    }
}
