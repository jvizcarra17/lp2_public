package com.cibertec.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.cibertec.entity.Vehiculo;

public interface IVehiculoRepository extends JpaRepository<Vehiculo, Long> {

}
