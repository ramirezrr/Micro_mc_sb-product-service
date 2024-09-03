package pe.com.course.mitocode.productservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import pe.com.course.mitocode.productservice.dto.ProductDTO;
import pe.com.course.mitocode.productservice.service.ProductService;

import java.util.List;

@RestController
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping("/product")
    public void saveDepartamento(@RequestBody ProductDTO productDTO) {
        productService.saveProduct(productDTO);
    }

    @GetMapping("/product")
    public List<ProductDTO> fetchDepartamentoList() {
        return productService.getAllProducts();
    }


}
