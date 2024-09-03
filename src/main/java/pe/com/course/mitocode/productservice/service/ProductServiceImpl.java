package pe.com.course.mitocode.productservice.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pe.com.course.mitocode.productservice.dto.ProductDTO;
import pe.com.course.mitocode.productservice.repository.ProductMongoRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {


    private final ProductMongoRepository productMongoRepository;

    @Override
    public void saveProduct(ProductDTO productDto) {
        productMongoRepository.save(productDto.dtoToEntity());
    }

    @Override
    public List<ProductDTO> getAllProducts() {
        return productMongoRepository.findAll().stream()
                .map(ProductDTO::new)
                .toList();
    }


}
