package Images_WebApp.Images_WebApp.Repository;

import Images_WebApp.Images_WebApp.ImageObject.ImageEntity;
import org.springframework.data.repository.CrudRepository;


public interface ImageRepository extends CrudRepository<ImageEntity, Long> {
    //List<Image> findByName(@Param("q") String name);
}
