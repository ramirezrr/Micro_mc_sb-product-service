package pe.com.course.mitocode.productservice.controller;

import org.springframework.web.bind.annotation.*;
import pe.com.course.mitocode.productservice.entity.Furniture;
import pe.com.course.mitocode.productservice.service.FurnitureService;

import java.util.List;

@RestController
public class FurnitureController {

    private final FurnitureService furnitureService;

    public FurnitureController(FurnitureService furnitureService) {
        this.furnitureService = furnitureService;
    }

    @PostMapping("/furniture")
    public void saveDepartamento(@RequestBody Furniture furniture) {
        furnitureService.saveFurniture(furniture);
    }

    @GetMapping("/furniture")
    public List<Furniture> fetchDepartamentoList() {
        return furnitureService.getAllFurniture();
    }

    @DeleteMapping("/furniture")
    public void deleteFurniture(@RequestBody Furniture furniture) {
        furnitureService.deleteFurniture(furniture);
    }
}
