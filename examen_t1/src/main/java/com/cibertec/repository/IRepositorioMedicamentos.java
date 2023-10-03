package com.cibertec.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cibertec.model.Medicamento;

public interface IRepositorioMedicamentos extends JpaRepository<Medicamento, Long> {

}
