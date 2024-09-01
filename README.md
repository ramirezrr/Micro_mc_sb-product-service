# Product Service (Postgres)

Este proyecto es un servicio de gestión de productos basado en Spring Boot y JPA, utilizando una base de datos Postgres.

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
  jpa:
    properties:
      hibernate:
        dialect: org.hibernate.dialect.PostgreSQLDialect # Especifica el dialecto de Hibernate para PostgreSQL. Esto asegura que Hibernate genere consultas SQL compatibles con la sintaxis de PostgreSQL.
        format_sql: true # Activa el formato de las consultas SQL generadas, lo que facilita la lectura y depuración.
    hibernate:
      ddl-auto: none # Configura Hibernate para no realizar ninguna acción automática en el esquema de la base de datos (ni crear, ni actualizar, ni validar tablas). Esto es útil cuando se maneja el esquema de la base de datos manualmente o a través de otros mecanismos.
  datasource:
    url: jdbc:postgresql://localhost:5432/pruebas # URL de conexión a la base de datos PostgreSQL. Incluye el host, el puerto y el nombre de la base de datos.
    username: postgres # Nombre de usuario para conectarse a la base de datos.
    password: postgres # Contraseña para el nombre de usuario especificado.
  sql:
    init:
      mode: always # Indica que el archivo de inicialización SQL (data.sql) debe ejecutarse siempre al iniciar la aplicación, no solo en el arranque si la base de datos está vacía.
      schema-locations: classpath:bd/data.sql # Ubicación del archivo SQL que se ejecutará para inicializar la base de datos. En este caso, el archivo se encuentra en el directorio de recursos del classpath.
      continue-on-error: false # Permite que la inicialización continúe incluso si se encuentran errores durante la ejecución del archivo SQL. Esto puede ser útil para evitar que la aplicación se detenga debido a errores menores en el script SQL.


  ```

## Para crear tablas manualmente

```sql
DROP TABLE if exists furniture;
DROP SEQUENCE if exists furniture_seq;

-- Primero, crea la secuencia (si no existe)
CREATE SEQUENCE IF NOT EXISTS furniture_seq;

-- Luego, crea la tabla
CREATE TABLE IF NOT EXISTS furniture (
                                       furniture_id BIGINT DEFAULT nextval('furniture_seq') PRIMARY KEY,
  furniture_description VARCHAR(255),
  furniture_fecha_registro DATE,
  furniture_name VARCHAR(255)
  );

-- Inserta datos en la tabla usando la secuencia para generar el ID
INSERT INTO furniture (furniture_id, furniture_name, furniture_fecha_registro, furniture_description)
VALUES
  (nextval('furniture_seq'), 'Table', CURRENT_DATE, 'new'),
  (nextval('furniture_seq'), 'Chair', CURRENT_DATE, 'new'),
  (nextval('furniture_seq'), 'Sofa', CURRENT_DATE, 'old'),
  (nextval('furniture_seq'), 'Door', CURRENT_DATE, 'old');

select * from furniture;

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

