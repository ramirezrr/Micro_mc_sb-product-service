package pe.com.course.mitocode.productservice.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Furniture {


    @Id // Marca el campo como la clave primaria.
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "furniture_seq") // El ID se genera usando la secuencia.
    @SequenceGenerator(name = "furniture_seq", sequenceName = "FURNITURE_SEQ_ID", allocationSize = 1) // Definición de la secuencia (name = java y sequenceName = bd)
    private Long furnitureId;
    private String furnitureName;
    private String furnitureDescription;
    private String furnitureFechaRegistro;

}
