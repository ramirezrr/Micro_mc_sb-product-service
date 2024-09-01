package pe.com.course.mitocode.productservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
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
    public Furniture saveDepartamento(@RequestBody Furniture furniture) {
        return furnitureService.saveFurniture(furniture);
    }

    @GetMapping("/furniture")
    public List<Furniture> fetchDepartamentoList() {
        return furnitureService.fetchFurnitureList();
    }
}
