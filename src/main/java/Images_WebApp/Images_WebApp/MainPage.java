package Images_WebApp.Images_WebApp;

import javax.annotation.Resource;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("")
@Resource
public class MainPage {

    @GET
    @Produces("text/plain")
    public String right(){
        return "Done right";
    }

}
