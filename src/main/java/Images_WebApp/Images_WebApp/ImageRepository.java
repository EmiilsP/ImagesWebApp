package Images_WebApp.Images_WebApp;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import java.util.List;


public interface ImageRepository extends CrudRepository<Image, Long> {
    //List<Image> findByName(@Param("q") String name);
}
