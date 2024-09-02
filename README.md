# Product Service (MONGO - Rest template)

## Descripción del Proyecto

El **Product Service** es un microservicio desarrollado en Java utilizando Spring Boot, diseñado para gestionar una colección de productos (muebles) en una base de datos MongoDB. El servicio permite realizar operaciones CRUD (crear, leer, actualizar y eliminar) sobre los documentos de muebles.

## Versiones

- **Spring Boot**: 3.3.1
- **MongoDB**: 6.0.8
- **Mongo Express**: 1.0.0-alpha.4
- **Java**: 21
- **Lombok**: 1.18.26 (opcional)

## Características

- **MongoDB**: Base de datos NoSQL utilizada para almacenar la información de los muebles.
- **Mongo Express**: Interfaz web para administrar MongoDB.
- **Datos Iniciales**: Carga datos de ejemplo desde un archivo JSON al iniciar la aplicación.
- **CRUD Operations**: Permite crear, leer, actualizar y eliminar registros de muebles a través de endpoints REST.

## ¿Qué es MongoTemplate?
MongoTemplate es una clase de Spring Data MongoDB que proporciona una API de alto nivel para realizar operaciones con MongoDB. Facilita la interacción con una base de datos MongoDB mediante la ejecución de consultas, la inserción de documentos, y otras operaciones relacionadas con la gestión de datos.

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

- **Archivo JSON**: `initial_data.json` en `src/main/resources/bd/` con datos de ejemplo para los muebles.

## Endpoints REST

- **POST** `/furniture`: Inserta un nuevo mueble.
- **GET** `/furniture`: Obtiene la lista de muebles.
- **DELETE** `/furniture`: Elimina un mueble existente.

## Ejemplos de Solicitudes

- **POST** a `http://localhost:8080/furniture`

    ```json
    {
      "furniture_name": "Chair",
      "furniture_description": "Wooden chair",
      "furniture_date_register": "2024-09-01T10:10:10Z"
    }
    ```

- **GET** a `http://localhost:8080/furniture`

- **DELETE** a `http://localhost:8080/furniture`

    ```json
    {
      "id": "66d539d87d4235320fa41e65",
      "furniture_name": null,
      "furniture_description": null,
      "furniture_date_register": null
    }
    ```

## Querys simples: 
```spring-mongodb-json

db.products.insertOne({"furniture_name":"table", "furniture_description": "new", "furniture_date_register": "11/11/2021"})

db.products.find()
Eliminar

db.Furniture.deleteMany({})
```
---

