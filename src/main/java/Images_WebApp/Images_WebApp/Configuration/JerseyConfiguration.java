package Images_WebApp.Images_WebApp.Configuration;

import Images_WebApp.Images_WebApp.Resource.ImageResource;
import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.servlet.ServletContainer;
import org.springframework.stereotype.Component;

import javax.ws.rs.ApplicationPath;

/**
 * Cik es saprotu Jersey 2.x nevajag web.xml jo mana gadijuma si klase pilda so funkciju?
 * Vai esmu registrejis visu nepieciesamo, lai veiktu primitivas darbibas starp front-end un back-end?
 */
@ApplicationPath("rest")
@Component
public class JerseyConfiguration extends ResourceConfig {
    public JerseyConfiguration() {
        register(ImageResource.class);
        register(ServletContainer.class);
    }
}
