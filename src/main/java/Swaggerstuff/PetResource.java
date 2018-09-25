package Swaggerstuff;

import io.swagger.*;
import io.swagger.models.Response;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.*;

import javax.ws.rs.*;

@Path("/pet")
@Produces({"application/json", "application/xml"})
public class PetResource {

    @GET
    @Path("/{petId}")
    public Pet getPetById(@PathParam("petId") Long petId) throws io.swagger.sample.exception.NotFoundException {
        // return pet
        return new Pet();
    }

    @POST
    @Consumes("application/json")
    public Response addPet(
            @Parameter(description = "Pet object that needs to be added to the store", required = true) Pet pet) {
        // add pet
        return Response.ok().entity("SUCCESS").build();
    }
}

