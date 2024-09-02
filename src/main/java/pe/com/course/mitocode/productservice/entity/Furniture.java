package pe.com.course.mitocode.productservice.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Data
@Document(collection = "Furniture")
public class Furniture {


    @Id // Marca el campo como la clave primaria.
    private String id;

    @JsonProperty("furniture_name")
    private String furnitureName;

    @JsonProperty("furniture_description")
    private String furnitureDescription;

    @JsonProperty("furniture_date_register")
    private Date furnitureDateRegister;


}
