package lp2.cibertec.service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import lp2.cibertec.entidades.Employee;

public class EliminarEmpleado {
	
	public static void main(String[] args) {
		EntityManagerFactory emfactory = 
				Persistence.createEntityManagerFactory("EjemploJPA");
		
		EntityManager entitymanager = emfactory.createEntityManager();
		entitymanager.getTransaction().begin();
		
		Employee employee = entitymanager.find(Employee.class, 1201);
		
		entitymanager.remove(employee);
		entitymanager.getTransaction().commit();
		
		entitymanager.close();
		emfactory.close();
	}

}
