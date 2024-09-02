package pe.com.course.mitocode.productservice.config;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ResourceLoader;
import org.springframework.data.mongodb.core.MongoTemplate;
import pe.com.course.mitocode.productservice.entity.Furniture;

import java.io.InputStream;
import java.util.List;

@Configuration
public class DataLoader {

    /*
        Para q ejecute el json y se inserte
    */

    private final MongoTemplate mongoTemplate;

    private final ResourceLoader resourceLoader2;

    public DataLoader(MongoTemplate mongoTemplate, @Qualifier("gridFsTemplate") ResourceLoader resourceLoader2) {
        this.resourceLoader2 = resourceLoader2;
        this.mongoTemplate = mongoTemplate;
    }

    @Bean
    public CommandLineRunner loadData() {
        return args -> {
            // Cargar datos del archivo JSON
            ObjectMapper objectMapper = new ObjectMapper();
            InputStream inputStream = resourceLoader2.getResource("classpath:/bd/initial_data.json").getInputStream();
            List<Furniture> furnitureList = objectMapper.readValue(inputStream, new TypeReference<>() {
            });

            // Insertar datos en MongoDB
            mongoTemplate.insertAll(furnitureList);
        };
    }
}
