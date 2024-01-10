package ie.atu.cicdprojectimageservice;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ImageService {
    private final ImageRepository imageRepository;

    public ImageService(ImageRepository imageRepository) {
        this.imageRepository = imageRepository;
    }


    public Image addImage(Image image){
        return imageRepository.save(image);
    }

    public List<Image> getImages(){
         return imageRepository.findAll();

    }
}
