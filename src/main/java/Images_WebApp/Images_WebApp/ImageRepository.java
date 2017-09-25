package Images_WebApp.Images_WebApp;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


public interface ImageRepository extends CrudRepository<Image, Long> {
   // List<Image> findByName(@Param("q") String name);
}
