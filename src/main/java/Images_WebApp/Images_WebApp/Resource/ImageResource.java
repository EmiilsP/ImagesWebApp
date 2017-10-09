package Images_WebApp.Images_WebApp.Resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.stereotype.Component;

@Path("/fileservice")
@Component
public class ImageResource {
     @GET
    @Path("/string")
    @Produces(MediaType.APPLICATION_JSON)
    public String testString(){
        return "Success";
    }

    @GET
    @Path("/array")
    @Produces(MediaType.APPLICATION_JSON)
    public int[] testArray(){
        return new int[]{1,2,3,55};
    }
}
