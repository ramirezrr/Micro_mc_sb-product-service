package pe.com.course.mitocode.productservice.service;

import pe.com.course.mitocode.productservice.entity.Furniture;

import java.util.List;

public interface FurnitureService {

    Furniture saveFurniture(Furniture departamento);

    List<Furniture> fetchFurnitureList();

}
