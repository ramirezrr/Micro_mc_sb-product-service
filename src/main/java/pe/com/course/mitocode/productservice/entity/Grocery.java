package pe.com.course.mitocode.productservice.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Data
@Document(collection = "Grocery")
public class Grocery {


    @Id // Marca el campo como la clave primaria.
    private String id;

    @JsonProperty("grocery_name")
    private String groceryName;

    @JsonProperty("grocery_description")
    private String groceryDescription;

    @JsonProperty("grocery_date_register")
    private Date groceryDateRegister;


}
