package pe.com.course.mitocode.productservice;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import pe.com.course.mitocode.productservice.model.ProductEntity;
import pe.com.course.mitocode.productservice.repository.ProductMongoRepository;

import java.util.Date;

@SpringBootApplication
@RequiredArgsConstructor
public class ProductServiceApplication implements CommandLineRunner {

    private final ProductMongoRepository productMongoRepository;


    public static void main(String[] args) {
        SpringApplication.run(ProductServiceApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        productMongoRepository.deleteAll();

        productMongoRepository.save(ProductEntity.builder().productName("Pc").productDescription("New").productDateRegister(new Date()).build());

        productMongoRepository.save(ProductEntity.builder().productName("Monitor").productDescription("old").productDateRegister(new Date()).build());


    }
}
