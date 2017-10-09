package Images_WebApp.Images_WebApp.Service;

import Images_WebApp.Images_WebApp.ImageObject.ImageEntity;
import Images_WebApp.Images_WebApp.Repository.ImageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImageService {

    @Autowired
    public ImageRepository imageRepository;

    public ImageService(){}

    public ImageService(String path,String name, String tag) {
        ImageEntity image = new ImageEntity(path, name, tag);
        imageRepository.save(image);
    }

    public ImageService(String path,String name) {
        ImageEntity image = new ImageEntity(path, name);
        imageRepository.save(image);
    }
}
