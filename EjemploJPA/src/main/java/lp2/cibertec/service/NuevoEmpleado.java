package lp2.cibertec.service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import lp2.cibertec.entidades.Employee;

public class NuevoEmpleado {

	public static void main(String[] args) {
		EntityManagerFactory emfactory = 
				Persistence.createEntityManagerFactory("EjemploJPA");
		
		EntityManager entitymanager = emfactory.createEntityManager();
		entitymanager.getTransaction().begin();
		
		Employee employee = new Employee();
		employee.setEid(1201);
		employee.setEname("Perez");
		employee.setSalary(40000);
		employee.setDeg("Tecnico General");
		
		entitymanager.persist(employee);
		entitymanager.getTransaction().commit();
		
		entitymanager.close();
		emfactory.close();

	}

}
