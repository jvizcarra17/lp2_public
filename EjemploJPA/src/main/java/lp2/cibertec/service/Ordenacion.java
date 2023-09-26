package lp2.cibertec.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import lp2.cibertec.entidades.Employee;

public class Ordenacion {

	public static void main(String[] args) {
		EntityManagerFactory emfactory = 
				Persistence.createEntityManagerFactory("EjemploJPA");

		EntityManager entitymanager = emfactory.createEntityManager();

		Query query = entitymanager
				.createQuery("Select e " + 
		"from Employee e ORDER BY e.ename ASC");
		
		List<Employee> list = (List<Employee>)query.getResultList();
		
		for (Employee e : list) {
			System.out.println("Employee ID: " + e.getEid());
			System.out.println("\t Nombre de Empleado: " + e.getEname());
		}

	}

}
