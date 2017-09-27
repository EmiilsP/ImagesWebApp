package Images_WebApp.Images_WebApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImageService {

    @Autowired
    public ImageRepository imageRepository;

    public void createImage() {
        Image image = new Image("Here will be passed path for image", "name", "tag");
        imageRepository.save(image);
    }
}
