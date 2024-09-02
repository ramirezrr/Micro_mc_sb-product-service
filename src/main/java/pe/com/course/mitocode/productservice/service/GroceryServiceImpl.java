package pe.com.course.mitocode.productservice.service;

import org.springframework.stereotype.Service;
import pe.com.course.mitocode.productservice.entity.Grocery;
import pe.com.course.mitocode.productservice.repository.GroceryRepository;

import java.util.List;

@Service
public class GroceryServiceImpl implements GroceryService {


    private final GroceryRepository groceryRepository;

    public GroceryServiceImpl(GroceryRepository groceryRepository) {
        this.groceryRepository = groceryRepository;
    }


    @Override
    public void saveGrocery(Grocery grocery) {
        groceryRepository.save(grocery);
    }

    @Override
    public List<Grocery> getAllGrocery() {
        return groceryRepository.findAll();
    }

    @Override
    public List<Grocery> findAllForName(String groceryName) {
        return groceryRepository.findAllForName(groceryName);
    }
}
