package org.acme;

import javax.json.JsonObject;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;



@RegisterRestClient
@Path("1.0")
@Produces("application/json")
@Consumes("application/json")
public interface MailService {

    @POST
    @Path("/users/ping2.json")
    JsonObject ping(JsonObject parameterJson);
}
