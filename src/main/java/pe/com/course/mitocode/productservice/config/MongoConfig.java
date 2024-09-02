package pe.com.course.mitocode.productservice.config;

import com.mongodb.ConnectionString;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.core.MongoTemplate;

@Configuration
public class MongoConfig {

    @Bean
    public MongoClient mongoClient() {
        // Crea un cliente MongoDB conectado a localhost en el puerto 27017
        ConnectionString connectionString = new ConnectionString("mongodb://root:pasw@localhost:27017/pruebas-db?authSource=admin");
        return MongoClients.create(connectionString);
    }

    @Bean
    public MongoTemplate mongoTemplate(MongoClient mongoClient) {
        // Configura MongoTemplate para la base de datos 'example_database'
        MongoTemplate template = new MongoTemplate(mongoClient, "pruebas-db-2");
        // Establece un WriteConcernResolver básico
        template.setWriteConcernResolver(action -> com.mongodb.WriteConcern.ACKNOWLEDGED);
        return template;
    }

}
