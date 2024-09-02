package pe.com.course.mitocode.productservice.service;

import pe.com.course.mitocode.productservice.entity.Grocery;

import java.util.List;

public interface GroceryService {

    void saveGrocery(Grocery grocery);

    List<Grocery> getAllGrocery();

    List<Grocery> findAllForName(String groceryName);
}
