package pe.com.course.mitocode.productservice.repository;

import org.springframework.stereotype.Component;
import pe.com.course.mitocode.productservice.entity.Grocery;

import java.util.List;

@Component
public class GroceryRepositoryImpl implements GroceryRepository {

    private final RepositoryGrocery repositoryGrocery;

    public GroceryRepositoryImpl(RepositoryGrocery repositoryGrocery) {
        this.repositoryGrocery = repositoryGrocery;
    }

    @Override
    public void save(Grocery grocery) {
        repositoryGrocery.save(grocery);
    }

    @Override
    public List<Grocery> findAll() {
        return repositoryGrocery.findAll();
    }

    @Override
    public List<Grocery> findAllForName(String categoryName) {
        return repositoryGrocery.findAllForName(categoryName);
    }


}
