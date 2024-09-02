package pe.com.course.mitocode.productservice;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.io.ClassPathResource;
import org.springframework.data.mongodb.core.MongoTemplate;
import pe.com.course.mitocode.productservice.entity.Grocery;

import java.util.List;

@SpringBootApplication
public class ProductServiceApplication implements CommandLineRunner {

    private final MongoTemplate mongoTemplate;

    public ProductServiceApplication(MongoTemplate mongoTemplate) {
        this.mongoTemplate = mongoTemplate;
    }

    public static void main(String[] args) {
        SpringApplication.run(ProductServiceApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        // Cargar archivo JSON desde el classpath
        ObjectMapper mapper = new ObjectMapper();
        List<Grocery> items = mapper.readValue(
                new ClassPathResource("bd/data.json").getFile(),
                new TypeReference<List<Grocery>>() {
                }
        );

        // Guardar todos los ítems en MongoDB
        items.forEach(mongoTemplate::save);
    }
}
