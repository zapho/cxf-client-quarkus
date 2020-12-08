package org.acme;

import com.whatever.AllergyService.AllergyService;
import com.whatever.AllergyService.ArrayOfAllergy;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("/hello")
public class GreetingResource {

    @Inject
    AllergyService allergyService;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Hello RESTEasy";
    }

    @GET
    @Path("allergies")
    @Produces(MediaType.APPLICATION_JSON)
    public ArrayOfAllergy getAllergies(@QueryParam("search") String search) {
        return allergyService.searchByName(search);
    }
}
