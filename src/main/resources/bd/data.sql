/*
Crear una nueva tabla furniture si no existe
*/

DROP TABLE if exists furniture;
DROP SEQUENCE if exists furniture_seq;

-- Primero, crea la secuencia (si no existe)
CREATE SEQUENCE IF NOT EXISTS furniture_seq;

-- Luego, crea la tabla
CREATE TABLE IF NOT EXISTS furniture
(
    furniture_id
    BIGINT
    DEFAULT
    nextval
(
    'furniture_seq'
) PRIMARY KEY,
    furniture_description VARCHAR
(
    255
),
    furniture_fecha_registro DATE,
    furniture_name VARCHAR
(
    255
)
    );

-- Inserta datos en la tabla usando la secuencia para generar el ID
INSERT INTO furniture (furniture_id, furniture_name, furniture_fecha_registro, furniture_description)
VALUES (nextval('furniture_seq'), 'Table', CURRENT_DATE, 'new'),
       (nextval('furniture_seq'), 'Chair', CURRENT_DATE, 'new'),
       (nextval('furniture_seq'), 'Sofa', CURRENT_DATE, 'old'),
       (nextval('furniture_seq'), 'Door', CURRENT_DATE, 'old');

select *
from furniture