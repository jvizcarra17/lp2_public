package com.cibertec.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import com.cibertec.modelo.Libro;

public interface ILibroRepositorio extends JpaRepository<Libro, Integer> {

}
