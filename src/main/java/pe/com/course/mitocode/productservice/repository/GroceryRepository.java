package pe.com.course.mitocode.productservice.repository;

import pe.com.course.mitocode.productservice.entity.Grocery;

import java.util.List;

public interface GroceryRepository {

    void save(Grocery grocery);

    List<Grocery> findAll();

    List<Grocery> findAllForName(String categoryName);
}
