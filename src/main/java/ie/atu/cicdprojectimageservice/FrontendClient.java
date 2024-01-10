package ie.atu.cicdprojectimageservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@FeignClient(name="frontend", url ="http://localhost:3000")
public interface FrontendClient {
    @PostMapping("/images")
    Image imageDetails(@RequestBody Image image);
}
