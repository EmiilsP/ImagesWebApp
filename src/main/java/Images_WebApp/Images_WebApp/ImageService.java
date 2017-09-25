package Images_WebApp.Images_WebApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImageService {

    @Autowired
    public ImageRepository imageRepository;

    public void saveImage(){
        Image image = new Image("Here will be passed path for image", "Here will be passed name","Here will be passed tag");
        imageRepository.save(image);
    }
}
