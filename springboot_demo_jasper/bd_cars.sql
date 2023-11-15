Create database bd_cars;
use bd_cars;
CREATE TABLE tb_vehiculos (
    id INT AUTO_INCREMENT PRIMARY KEY,
    marca VARCHAR(255),
    modelo VARCHAR(255),
    year INT,
    precio DECIMAL(10, 2),
    color VARCHAR(255)
);
INSERT INTO tb_vehiculos (marca, modelo, year, precio, color)
VALUES
    ('Toyota', 'Corolla', 2022, 25000.00, 'Azul'),
    ('Honda', 'Civic', 2021, 22000.00, 'Blanco'),
    ('Ford', 'Focus', 2020, 19000.00, 'Gris'),
    ('Chevrolet', 'Malibu', 2022, 27000.00, 'Rojo'),
    ('Volkswagen', 'Golf', 2021, 23000.00, 'Plateado'),
    ('Nissan', 'Altima', 2022, 26000.00, 'Negro'),
    ('Hyundai', 'Elantra', 2020, 19500.00, 'Blanco'),
    ('Kia', 'Optima', 2021, 22500.00, 'Gris'),
    ('Mazda', 'Mazda3', 2022, 25500.00, 'Azul'),
    ('Subaru', 'Impreza', 2020, 20000.00, 'Rojo');
