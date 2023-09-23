-- Tabla de clientes en la base de datos
CREATE TABLE Clientes (
    ClienteID INT PRIMARY KEY,
    Nombre VARCHAR(50),
    Email VARCHAR(100)
);

-- Fuente externa de datos (clientes nuevos)
CREATE TABLE Clientes_Nuevos (
    ClienteID INT PRIMARY KEY,
    Nombre VARCHAR(50),
    Email VARCHAR(100)
);

MERGE INTO Clientes AS target
USING Clientes_Nuevos AS source
ON target.ClienteID = source.ClienteID
WHEN MATCHED THEN
    UPDATE SET
        target.Nombre = source.Nombre,
        target.Email = source.Email
WHEN NOT MATCHED THEN
    INSERT (ClienteID, Nombre, Email)
    VALUES (source.ClienteID, source.Nombre, source.Email);
