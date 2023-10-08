CREATE DATABASE IF NOT EXISTS bd_ferreteria;
USE bd_ferreteria;
CREATE TABLE IF NOT EXISTS tbl_productos (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    descripcion VARCHAR(255),
    precio DOUBLE NOT NULL,
    cantidad INT NOT NULL
);
INSERT INTO tbl_productos (nombre, descripcion, precio, cantidad) VALUES
    ('Martillo', 'Martillo de acero inoxidable', 15.99, 100),
    ('Destornillador', 'Destornillador de punta plana', 7.5, 150),
    ('Sierra Circular', 'Sierra circular para madera', 89.99, 20),
    ('Llave Inglesa', 'Llave ajustable de 10 pulgadas', 12.5, 75),
    ('Taladro Eléctrico', 'Taladro inalámbrico recargable', 59.99, 30),
    ('Cinta Métrica', 'Cinta métrica de 5 metros', 5.99, 50),
    ('Pintura Blanca', 'Pintura acrílica para interiores', 19.99, 40),
    ('Alicates', 'Alicates de corte diagonal', 8.5, 60),
    ('Clavos', 'Clavos galvanizados de 2 pulgadas', 3.99, 500),
    ('Llave de Tubo', 'Llave de tubo ajustable', 15.5, 25);
