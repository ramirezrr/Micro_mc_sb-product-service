package pe.com.course.mitocode.productservice.service;

import org.springframework.stereotype.Service;
import pe.com.course.mitocode.productservice.entity.Furniture;
import pe.com.course.mitocode.productservice.repository.FurnitureRepository;

import java.util.List;

@Service
public class FurnitureServiceImpl implements FurnitureService {


    private final FurnitureRepository furnitureRepository;

    public FurnitureServiceImpl(FurnitureRepository furnitureRepository) {
        this.furnitureRepository = furnitureRepository;
    }


    @Override
    public Furniture saveFurniture(Furniture departamento) {
        return furnitureRepository.save(departamento);
    }

    @Override
    public List<Furniture> fetchFurnitureList() {
        return (List<Furniture>) furnitureRepository.findAll();
    }
}
