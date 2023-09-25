package com.cibertec.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import com.cibertec.modelo.Categoria;

public interface ICategoriaRepositorio extends JpaRepository<Categoria, Long> {

}
