# Product Service (MONGO - REPOSITORIO)

## Descripción del Proyecto

El **Product Service** es un microservicio desarrollado en Java utilizando Spring Boot, diseñado para gestionar una
colección de productos (grocerys) en una base de datos MongoDB. El servicio permite realizar operaciones CRUD (crear,
leer, actualizar y eliminar) sobre los documentos de grocery.

## Versiones

- **Spring Boot**: 3.3.1
- **MongoDB**: 6.0.8
- **Mongo Express**: 1.0.0-alpha.4
- **Java**: 21
- **Lombok**: 1.18.26 (opcional)

## Características

- **MongoDB**: Base de datos NoSQL utilizada para almacenar la información de los grocery.
- **Mongo Express**: Interfaz web para administrar MongoDB.
- **Datos Iniciales**: Carga datos de ejemplo desde un archivo JSON al iniciar la aplicación.
- **CRUD Operations**: Permite crear, leer, actualizar y eliminar registros de grocery a través de endpoints REST.

## ¿Qué es  repositorio en Spring Data?

Un repositorio en Spring Data es una interfaz que extiende una interfaz base como MongoRepository o CrudRepository. Esta interfaz base proporciona una implementación automática de métodos para realizar operaciones comunes de acceso a datos, como guardar, encontrar, actualizar y eliminar entidades.

## Dependencias

El proyecto incluye las siguientes dependencias principales en `pom.xml`:

- **Spring Boot Starter Web**: Para crear aplicaciones web y servicios RESTful.
- **Spring Boot Starter Data MongoDB**: Para integrar MongoDB con Spring Data.
- **Lombok**: Para reducir el código repetitivo con anotaciones.

## Configuración

### MongoDB

- **Cliente MongoDB**: Configurado para conectar a `localhost` en el puerto `27017`.
- **Base de Datos**: `pruebas-db-2`
- **Configuración de Conexión**: Utiliza un usuario con credenciales `root` y `pasw`.

### Docker

El proyecto incluye un archivo `docker-compose.yml` para configurar y ejecutar los servicios de MongoDB y Mongo Express:

- **mongo_service**: Contenedor de MongoDB.
- **mongo-express**: Contenedor de Mongo Express para administración de MongoDB.

### Datos Iniciales

- **Archivo JSON**: `data.json` en `src/main/resources/bd/` con datos de ejemplo para los grocery.

## Endpoints REST

- **POST** `/grocery`: Inserta un nuevo grocery.
- **GET** `/grocery`: Obtiene la lista de grocery.
- **GET** `/groceryxName`: Obtiene la lista de grocery por nombre.
## Ejemplos de Solicitudes

```http request
### POST request to example server
POST http://localhost:8080/grocery
Content-Type: application/json

{
  "grocery_name": "wather",
  "grocery_description": "still",
  "grocery_date_register": "2024-09-01T10:10:10Z"
}

### GET request to example server
GET http://localhost:8080/grocery
Content-Type: application/json


### GET X NAME
GET http://localhost:8080/groceryxname?groceryName=milk
Content-Type: application/json

```

## Querys simples:

```spring-mongodb-json

db.products.insertOne({"grocery_name":"apple", "grocery_description": "new", "grocery_date_register": "11/11/2021"})

db.products.find()
Eliminar

db.Furniture.deleteMany({})
```

---

