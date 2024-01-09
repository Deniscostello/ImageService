package ie.atu.cicdprojectimageservice;

import org.springframework.stereotype.Service;

@Service
public class ImageService {

    public String addImage(Image image){
        return "Image" + image + "saved";
    }
}
