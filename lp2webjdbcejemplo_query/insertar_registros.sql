-- Insertar registros de ejemplo en la tabla `categoria`
INSERT INTO `bd_productos`.`categoria` (`descrip_cat`) VALUES
('Electrónica'),
('Ropa'),
('Hogar'),
('Alimentos');

-- Insertar registros de ejemplo en la tabla `producto`
INSERT INTO `bd_productos`.`producto` (`descripcion`, `precio`, `cantidad`, `fechavencimiento`, `idcategoria`) VALUES
('Teléfono inteligente', 499.99, 100, '2023-12-31', 1), -- Categoría: Electrónica
('Camiseta de algodón', 19.99, 200, '2024-06-30', 2),  -- Categoría: Ropa
('Sartén antiadherente', 29.99, 50, '2024-09-30', 3),  -- Categoría: Hogar
('Arroz integral', 5.99, 300, '2025-12-31', 4),        -- Categoría: Alimentos
('Tablet Android', 199.99, 50, '2023-12-31', 1),      -- Categoría: Electrónica
('Jeans azules', 29.99, 100, '2024-08-31', 2),        -- Categoría: Ropa
('Olla a presión', 39.99, 30, '2024-11-30', 3),       -- Categoría: Hogar
('Harina de trigo', 4.99, 200, '2025-10-31', 4),      -- Categoría: Alimentos
('Portátil ultradelgado', 799.99, 30, '2023-12-31', 1),-- Categoría: Electrónica
('Chaqueta de cuero', 89.99, 50, '2024-09-30', 2);    -- Categoría: Ropa
