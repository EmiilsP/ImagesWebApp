package Images_WebApp.Images_WebApp.Configuration;

import Images_WebApp.Images_WebApp.Resource.ImageResource;
import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.servlet.ServletContainer;
import org.springframework.stereotype.Component;

import javax.ws.rs.ApplicationPath;

@ApplicationPath("rest")
@Component
public class JerseyConfiguration extends ResourceConfig {
    public JerseyConfiguration() {
        register(ImageResource.class);
        register(ServletContainer.class);
    }
}
