# Product Service (MEMORIA H2)

Este proyecto es un servicio de gestión de productos basado en Spring Boot y JPA, utilizando una base de datos H2 en memoria.

## Entidad

**Furniture**

- `furnitureId` (Long): Clave primaria generada automáticamente.
- `furnitureName` (String): Nombre del mueble.
- `furnitureDescription` (String): Descripción del mueble.
- `furnitureFechaRegistro` (String): Fecha de registro del mueble.

## Repositorio

**FurnitureRepository**

Interfaz que extiende `CrudRepository` para operaciones CRUD sobre la entidad `Furniture`.

## Servicio

**FurnitureServiceImpl**

Implementa métodos para guardar y recuperar muebles:

- `saveFurniture(Furniture furniture)`: Guarda un mueble.
- `fetchFurnitureList()`: Recupera la lista de muebles.

## Configuración

- **Base de datos**: H2 en memoria.
- **Archivo `application.yml`**:
  ```yaml
  spring:
    h2:
      console:
        enabled: true
    datasource:
      url: jdbc:h2:mem:mydb
      username: sa
      password: sa
      driverClassName: org.h2.Driver
    jpa:
      hibernate:
        ddl-auto: update
      database-platform: org.hibernate.dialect.H2Dialect

## Para crear tablas manualmente

```sql

CREATE SEQUENCE IF NOT EXISTS FURNITURE_SEQ START WITH 1 INCREMENT BY 1;

CREATE TABLE FURNITURE (
FURNITURE_ID BIGINT DEFAULT NEXT VALUE FOR FURNITURE_SEQ PRIMARY KEY,
FURNITURE_NAME VARCHAR(255),
FURNITURE_DESCRIPTION VARCHAR(255),
FURNITURE_FECHA_REGISTRO DATE
);

INSERT INTO FURNITURE (FURNITURE_NAME, FURNITURE_DESCRIPTION, FURNITURE_FECHA_REGISTRO)
VALUES
    ('Table', 'new', CURRENT_DATE),
    ('Chair', 'new', CURRENT_DATE),
    ('Sofa', 'old', CURRENT_DATE),
    ('Door', 'old', CURRENT_DATE);


SELECT *
FROM INFORMATION_SCHEMA.TABLES
WHERE TABLE_NAME = 'FURNITURE';

SELECT *
FROM INFORMATION_SCHEMA.SEQUENCES;

```

http://localhost:8080/h2-console/
```http request
### POST request to example server
POST http://localhost:8080/furniture
Content-Type: application/json

{
  "furnitureName": "",
  "furnitureDescription": "",
  "furnitureFechaRegistro": ""
}

### GET request to example server
GET http://localhost:8080/furniture
Content-Type: application/json

```

