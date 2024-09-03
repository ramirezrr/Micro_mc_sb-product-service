package pe.com.course.mitocode.productservice.dto;

import pe.com.course.mitocode.productservice.model.ProductEntity;

import java.util.Date;

public record ProductDTO(String id, String productName, String productDescription, Date productDateRegister) {

    public ProductDTO(ProductEntity a) {
        this(a.getId(), a.getProductName(), a.getProductDescription(), a.getProductDateRegister());
    }

    public ProductEntity dtoToEntity() {
        return new ProductEntity(id, productName, productDescription, productDateRegister);
    }

}
