package ie.atu.cicdprojectimageservice;

import org.springframework.stereotype.Service;

@Service
public class ImageService {

    public void addImage(Image image){
        System.out.println("Image" + image + "saved");
    }
}
