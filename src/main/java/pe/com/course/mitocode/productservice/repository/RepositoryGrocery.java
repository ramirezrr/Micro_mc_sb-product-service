package pe.com.course.mitocode.productservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import pe.com.course.mitocode.productservice.entity.Grocery;

import java.util.List;

public interface RepositoryGrocery extends MongoRepository<Grocery, String> {


    @Query(value = "{groceryName:'?0'}", fields = "{'groceryDateRegister' : 1, 'groceryDescription' : 1, 'groceryName': 1}")
    List<Grocery> findAllForName(String groceryName);
    /*
    *   Desglose de la Anotación @Query
        Consulta (Query) Personalizada:

        value="{category:'?0'}": Define la consulta en MongoDB. En este caso, la consulta busca documentos donde el campo category sea igual al valor proporcionado como argumento en el método findAll.
        ?0 es un placeholder que se reemplaza con el primer argumento del método, que en este caso es el parámetro category de tipo String.
        Campos (Projection):

        fields="{'name' : 1, 'quantity' : 1}": Define qué campos deben ser incluidos en los documentos que se devuelven como resultado de la consulta. En este caso:
        'name' : 1: Incluye el campo name en el resultado.
        'quantity' : 1: Incluye el campo quantity en el resultado.
        Los campos con valor 1 indican que deben ser incluidos en los documentos retornados. Los campos con valor 0 se excluyen, pero en este caso, no se usa 0, así que no hay campos excluidos explícitamente.
        Método de Repositorio:

        List<GroceryItem> findAll(String category): Define el método en el repositorio que utilizará la consulta personalizada. Este método toma un argumento category y devuelve una lista de objetos GroceryItem.
    * */
}
