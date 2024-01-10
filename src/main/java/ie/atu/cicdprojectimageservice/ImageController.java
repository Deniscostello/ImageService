package ie.atu.cicdprojectimageservice;

import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class ImageController {
    private final ImageService imageService;

    public ImageController(ImageService imageService) {
        this.imageService = imageService;
    }

    @PostMapping("/addImage")
    public ResponseEntity<Image> saveImage(@Valid @RequestBody Image image){
        System.out.println(image);
        Image addedImage = imageService.addImage(image);
        return ResponseEntity.ok(addedImage);

    }

    @GetMapping("getAllImages")
    public ResponseEntity<Map<String, List<Image>>> getAllImage(){
        List<Image> images = imageService.getImages();
        Map<String, List<Image>> response = new HashMap<>();
        response.put("images", images);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
