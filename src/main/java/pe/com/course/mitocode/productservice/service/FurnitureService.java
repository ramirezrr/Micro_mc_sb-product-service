package pe.com.course.mitocode.productservice.service;

import pe.com.course.mitocode.productservice.entity.Furniture;

import java.util.List;

public interface FurnitureService {

    void saveFurniture(Furniture furniture);

    List<Furniture> getAllFurniture();

    void deleteFurniture(Furniture furniture);
}
