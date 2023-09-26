CREATE DATABASE IF NOT EXISTS bd_personas;


USE bd_personas;


CREATE TABLE IF NOT EXISTS distrito (
  iddistrito INT AUTO_INCREMENT PRIMARY KEY,
  nombre VARCHAR(45)
);


CREATE TABLE IF NOT EXISTS personas (
  idpersona INT AUTO_INCREMENT PRIMARY KEY,
  apellidos VARCHAR(45),
  nombres VARCHAR(45),
  direccion VARCHAR(45),
  distrito INT,
  fechanacimiento DATETIME,
  FOREIGN KEY (distrito) REFERENCES distrito (iddistrito)
);


INSERT INTO distrito (nombre) VALUES
  ('Arequipa'),
  ('Cayma'),
  ('Yanahuara'),
  ('José Luis Bustamante y Rivero'),
  ('Miraflores'),
  ('Socabaya'),
  ('Cerro Colorado'),
  ('Tiabaya'),
  ('Hunter'),
  ('La Joya');


INSERT INTO personas (apellidos, nombres, direccion, distrito, fechanacimiento) VALUES
  ('García', 'Juan', 'Av. Principal 123', 1, '1990-05-15'),
  ('López', 'María', 'Calle Lima 456', 2, '1985-08-20'),
  ('Pérez', 'Carlos', 'Jr. Arequipa 789', 3, '1995-02-10'),
  ('Rodríguez', 'Ana', 'Calle Tacna 321', 4, '1980-11-28'),
  ('Martínez', 'Luis', 'Av. Progreso 567', 5, '1992-07-03');
