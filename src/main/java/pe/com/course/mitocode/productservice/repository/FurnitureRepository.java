package pe.com.course.mitocode.productservice.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pe.com.course.mitocode.productservice.entity.Furniture;

@Repository
public interface FurnitureRepository extends CrudRepository<Furniture, Long> {

}
