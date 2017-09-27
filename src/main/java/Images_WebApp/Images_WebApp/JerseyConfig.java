package Images_WebApp.Images_WebApp;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;


@Configuration
public class JerseyConfig extends ResourceConfig{
    public JerseyConfig() {
        register(ImageResource.class);
    }
}
