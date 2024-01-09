package ie.atu.cicdprojectimageservice;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class ImageController {

    @PostMapping("addImage")
    public ResponseEntity<Map<String, List<Image>>> saveImage(){

    }
}
