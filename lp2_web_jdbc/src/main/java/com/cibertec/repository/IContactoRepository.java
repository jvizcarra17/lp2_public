package com.cibertec.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.cibertec.entity.Contacto;


public interface IContactoRepository extends JpaRepository<Contacto, Integer> {
	

}
