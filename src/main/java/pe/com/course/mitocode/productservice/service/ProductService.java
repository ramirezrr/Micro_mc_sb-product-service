package pe.com.course.mitocode.productservice.service;

import pe.com.course.mitocode.productservice.dto.ProductDTO;

import java.util.List;

public interface ProductService {


    void saveProduct(ProductDTO productEntity);

    List<ProductDTO> getAllProducts();

}
