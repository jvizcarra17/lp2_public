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
    fechavencimiento datetime(6),
    stock INT,
    proveedor VARCHAR(100)
);

-- Insertar algunos registros de ejemplo
INSERT INTO medicamentos (nombre, descripcion, categoria, precio, fechavencimiento, stock, proveedor)
VALUES
  ('Paracetamol', 'Analgésico y antipirético comúnmente utilizado', 'Analgésicos', 5.99, '2023-10-15 08:00:00', 50, 'Farmacia A'),
  ('Ibuprofeno', 'Antiinflamatorio no esteroideo', 'Antiinflamatorios', 7.49, '2023-11-30 14:30:00', 40, 'Farmacia B'),
  ('Amoxicilina', 'Antibiótico de amplio espectro', 'Antibióticos', 12.75, '2023-09-25 10:15:00', 30, 'Farmacia C'),
  ('Omeprazol', 'Inhibidor de la bomba de protones', 'Gastrointestinales', 8.99, '2024-01-10 09:45:00', 60, 'Farmacia D'),
  ('Loratadina', 'Antihistamínico para alergias', 'Antialérgicos', 6.25, '2024-02-20 16:00:00', 20, 'Farmacia E');


-- Verificar la creación de la tabla
SELECT * FROM medicamentos;
