-- Crear la base de datos si aún no existe
CREATE DATABASE IF NOT EXISTS bd_farmacia;

-- Usar la base de datos
USE bd_farmacia;

-- Crear la tabla "medicamentos"
CREATE TABLE medicamentos (
    idmedicamento INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(255),
    descripcion TEXT,
    categoria VARCHAR(50),
    precio DECIMAL(38, 2),
    stock INT,
    proveedor VARCHAR(100)
);

-- Insertar algunos registros de ejemplo
INSERT INTO medicamentos (nombre, descripcion, categoria, precio, stock, proveedor) VALUES
    ('Aspirina', 'Medicamento para aliviar el dolor', 'Analgésico', 5.99, 100,  'Farmacia A'),
    ('Amoxicilina', 'Antibiótico de amplio espectro', 'Antibiótico', 8.50, 50,  'Farmacia B'),
    ('Loratadina', 'Antihistamínico para alergias', 'Antihistamínico', 3.25, 75,  'Farmacia C');

-- Verificar la creación de la tabla
SELECT * FROM medicamentos;
