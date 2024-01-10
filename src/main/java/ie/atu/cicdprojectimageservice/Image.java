package ie.atu.cicdprojectimageservice;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@NoArgsConstructor
@Document(collection = "ImageDB")
public class Image {



    @Id
    private ObjectId _id;

    public long getImageid() {
        return Imageid;
    }

    public void setImageid(long imageid) {
        Imageid = imageid;
    }

    private long Imageid;


    @NotBlank(message = "Title cannot be blank")
    private String title;
    @NotBlank(message = "Description cannot be blank")
    private String description;

    @NotBlank(message = "URL cannot be blank")
    private String url;

    public Image(String title, String description, String url){
        setTitle(title);
        setDescription(description);
        setUrl(url);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if(title.length() >= 3){
            title = title;
        }
        else{
            throw new IllegalArgumentException("Title must be a minimum of 3 characters");
        }
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        if(description.length() >= 5){
            description = description;
        }
        else{
            throw new IllegalArgumentException("Description must be a minimum of 5 characters");
        }
        this.description = description;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        if(url.length() >= 10){
            url = url;
        }
        else{
            throw new IllegalArgumentException("URL must be a minimum of 10 characters");
        }
        this.url = url;

    }

    public ObjectId get_id() {
        return _id;
    }

    public void set_id(ObjectId _id) {
        this._id = _id;
    }
}
