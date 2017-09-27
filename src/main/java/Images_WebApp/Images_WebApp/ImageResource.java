package Images_WebApp.Images_WebApp;

import org.springframework.stereotype.Component;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/img")
@Component
public class ImageResource {
    @Path("/test")
    @GET
    @Produces("text/plain")
    public String right() {
        return "Done right";
    }
}
