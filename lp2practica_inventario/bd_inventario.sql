CREATE DATABASE IF NOT EXISTS bd_inventario;
USE bd_inventario;

CREATE TABLE IF NOT EXISTS productos (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    descripcion VARCHAR(255),
    precio DOUBLE NOT NULL,
    cantidad_disponible INT NOT NULL
);

CREATE TABLE IF NOT EXISTS compras (
    id INT AUTO_INCREMENT PRIMARY KEY,
    producto_id INT NOT NULL,
    cantidad INT NOT NULL,
    total DOUBLE NOT NULL,
    fecha TIMESTAMP NOT NULL,
    FOREIGN KEY (producto_id) REFERENCES productos(id)
);

-- Inserta algunos productos de ejemplo
INSERT INTO productos (nombre, descripcion, precio, cantidad_disponible) VALUES
    ('Smartphone Galaxy S21', 'Teléfono inteligente con cámara avanzada', 899.99, 50),
    ('Portátil ASUS ZenBook', 'Portátil ultradelgado y potente', 1299.99, 30),
    ('Televisor LED 4K', 'Televisor de alta definición con resolución 4K', 699.99, 20),
    ('Auriculares Inalámbricos Sony', 'Auriculares con cancelación de ruido', 199.99, 40),
    ('Impresora Multifunción HP', 'Impresora para hogar y oficina', 149.99, 25),
    ('Refrigeradora Samsung', 'Refrigeradora de doble puerta con dispensador de agua', 1199.99, 15),
    ('Cámara Mirrorless Canon EOS', 'Cámara de fotografía profesional', 899.99, 10),
    ('Robot Aspirador iRobot Roomba', 'Aspiradora robot con tecnología de mapeo', 299.99, 30),
    ('Bicicleta de Montaña', 'Bicicleta todoterreno para aventuras al aire libre', 499.99, 15),
    ('Set de Sartenes Antiadherentes', 'Set de cocina de alta calidad', 79.99, 50);

-- Inserta algunas compras de ejemplo
INSERT INTO compras (producto_id, cantidad, total, fecha) VALUES   (1, 5, 4499.95, '2023-10-04 12:30:00')
    -- Otros registros de compras...
