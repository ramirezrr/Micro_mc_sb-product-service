package pe.com.course.mitocode.productservice.service;

import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;
import pe.com.course.mitocode.productservice.entity.Furniture;

import java.util.List;

@Service
public class FurnitureServiceImpl implements FurnitureService {


    private final MongoTemplate mongoTemplate;

    public FurnitureServiceImpl(MongoTemplate mongoTemplate) {
        this.mongoTemplate = mongoTemplate;
    }



    // Crear un nuevo ítem
    public void saveFurniture(Furniture item) {
        mongoTemplate.insert(item);
    }

    // Devolver una lista de furnitures
    public List<Furniture> getAllFurniture() {
        return mongoTemplate.findAll(Furniture.class);
    }

    public void deleteFurniture(Furniture furniture) {
        mongoTemplate.remove (furniture);
    }
}
