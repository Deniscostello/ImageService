package ie.atu.cicdprojectimageservice;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class ImageSuccessTest {

    @BeforeEach
    void setUp(){

    }

    //Title Success test
    @Test
    void testTitleSuccess(){
        Image img1 = new Image("Bedroom", "This is a image concept of a bedroom", "https://media.designcafe.com/wp-content/uploads/2023/12/20173446/aesthetic-bedroom-ideas.jpg" );
        assertEquals("Bedroom", img1.getTitle());
    }

    //Description Success test
    @Test
    void testDescSuccess(){
        Image img2 = new Image("Dinner", "Lasagna", "https://jessicainthekitchen.com/wp-content/uploads/2021/06/Vegan-Lasagna-17.jpg");
        assertEquals("Lasagna", img2.getDescription());
    }

    //URL Success test
    @Test
    void testURLSuccess(){
        Image img3 = new Image("Phone", "iPhone", "https://i.pinimg.com/originals/5b/90/7c/5b907cf16e909474944a388fcb139979.jpg");
        assertEquals("https://i.pinimg.com/originals/5b/90/7c/5b907cf16e909474944a388fcb139979.jpg", img3.getUrl());
    }

    @AfterEach
    void tearDown(){

    }
}
