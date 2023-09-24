CREATE DATABASE bd_books;
USE bd_books;
-- Crear la tabla "libro"
CREATE TABLE libro (
    id_libro INT AUTO_INCREMENT PRIMARY KEY,
    titulo VARCHAR(45),
    autor VARCHAR(45),
    editorial VARCHAR(45),
    fecharegistro DATE,
    costo VARCHAR(45)
);
-- Insertar 9 libros 
INSERT INTO libro (titulo, autor, editorial, fecharegistro, costo)
VALUES
    ('El Código Da Vinci', 'Dan Brown', 'Editorial A', '2023-09-25', '19.99'),
    ('Cien años de soledad', 'Gabriel García Márquez', 'Editorial B', '2023-09-25', '15.50'),
    ('1984', 'George Orwell', 'Editorial C', '2023-09-25', '12.99'),
    ('Harry Potter y la piedra filosofal', 'J.K. Rowling', 'Editorial D', '2023-09-25', '18.75'),
    ('Don Quijote de la Mancha', 'Miguel de Cervantes', 'Editorial E', '2023-09-25', '14.25'),
    ('Los juegos del hambre', 'Suzanne Collins', 'Editorial F', '2023-09-25', '16.99'),
    ('Orgullo y prejuicio', 'Jane Austen', 'Editorial G', '2023-09-25', '11.50'),
    ('Matar un ruiseñor', 'Harper Lee', 'Editorial H', '2023-09-25', '13.75'),
    ('El Gran Gatsby', 'F. Scott Fitzgerald', 'Editorial I', '2023-09-25', '10.95');
