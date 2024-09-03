package pe.com.course.mitocode.productservice.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@NoArgsConstructor
@Builder
@AllArgsConstructor
@Data
@Document(collection = "Product")
public class ProductEntity {


    @Id // Marca el campo como la clave primaria.
    private String id;

    @JsonProperty("product_name")
    private String productName;

    @JsonProperty("product_description")
    private String productDescription;


    @JsonProperty("product_date_register")
    private Date productDateRegister;


}
