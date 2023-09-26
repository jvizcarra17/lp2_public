package lp2.cibertec.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import lp2.cibertec.entidades.Employee;

public class ConsultaNombre {

	public static void main(String[] args) {
		EntityManagerFactory emfactory = 
				Persistence.createEntityManagerFactory("EjemploJPA");

		EntityManager entitymanager = emfactory.createEntityManager();

		Query query = entitymanager.createNamedQuery("Find employee by id");
		query.setParameter("id", 1204);
		
		List<Employee> list = query.getResultList();
		
		for (Employee e : list) {
			System.out.println("ID Empleado " + e.getEid());
			System.out.println("\t Nombre Empleado: " + e.getEname());
		}

	}

}
