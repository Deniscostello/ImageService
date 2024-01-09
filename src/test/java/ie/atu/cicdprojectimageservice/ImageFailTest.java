package ie.atu.cicdprojectimageservice;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class ImageFailTest {
    @BeforeEach
    void setUp(){

    }

    @Test
    void testTitleFailure(){
        Exception exMessage = assertThrows(IllegalArgumentException.class, () -> new Image("T", "This is an image of a bedroom", "https://media.designcafe.com/wp-content/uploads/2023/12/20173446/aesthetic-bedroom-ideas.jpg"));
        assertEquals("Title must be a minimum of 3 characters", exMessage.getMessage());
    }

    @Test
    void testDescFailure(){
        Exception exMessage = assertThrows(IllegalArgumentException.class, () -> new Image("Bedroom", "Thi", "https://media.designcafe.com/wp-content/uploads/2023/12/20173446/aesthetic-bedroom-ideas.jpg"));
        assertEquals("Description must be a minimum of 5 characters", exMessage.getMessage());
    }

    @Test
    void testURLFailure(){
        Exception exMessage = assertThrows(IllegalArgumentException.class, () -> new Image("Bedroom", "This is an image of a bedroom", "https"));
        assertEquals("URL must be a minimum of 10 characters", exMessage.getMessage());
    }

    @AfterEach
    void tearDown(){

    }
}
