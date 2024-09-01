package pe.com.course.mitocode.productservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.course.mitocode.productservice.entity.Furniture;
import pe.com.course.mitocode.productservice.repository.FurnitureRepository;

import java.util.List;
@Service
public class FurnitureServiceImpl implements FurnitureService {

    @Autowired
    private FurnitureRepository furnitureRepository;


    @Override
    public Furniture saveFurniture(Furniture departamento) {
        return furnitureRepository.save(departamento);
    }

    @Override
    public List<Furniture> fetchFurnitureList() {
        return (List<Furniture>) furnitureRepository.findAll();
    }
}
