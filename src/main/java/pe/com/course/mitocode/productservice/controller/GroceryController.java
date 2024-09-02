package pe.com.course.mitocode.productservice.controller;

import org.springframework.web.bind.annotation.*;
import pe.com.course.mitocode.productservice.entity.Grocery;
import pe.com.course.mitocode.productservice.service.GroceryService;

import java.util.List;

@RestController
public class GroceryController {

    private final GroceryService groceryService;

    public GroceryController(GroceryService groceryService) {
        this.groceryService = groceryService;
    }

    @PostMapping("/grocery")
    public void saveDepartamento(@RequestBody Grocery groceryName) {
        groceryService.saveGrocery(groceryName);
    }

    @GetMapping("/grocery")
    public List<Grocery> fetchDepartamentoList() {
        return groceryService.getAllGrocery();
    }

    @GetMapping("/groceryxname")
    public List<Grocery> findAllForName(@RequestParam String groceryName) {
        return groceryService.findAllForName(groceryName);
    }

}
