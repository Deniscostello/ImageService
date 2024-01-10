package ie.atu.cicdprojectimageservice;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ImageRepository extends MongoRepository<Image, ObjectId> {
}
