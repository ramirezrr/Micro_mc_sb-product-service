package pe.com.course.mitocode.productservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import pe.com.course.mitocode.productservice.model.ProductEntity;

public interface ProductMongoRepository extends MongoRepository<ProductEntity, String> {


}
