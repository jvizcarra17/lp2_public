package lp2.cibertec.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FuncionesAgregadoEscalar {

	public static void main(String[] args) {

		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("EjemploJPA");

		EntityManager entitymanager = emfactory.createEntityManager();

		// Funcion escalar
		Query query = entitymanager.createQuery("Select UPPER(e.ename) from Employee e");

		@SuppressWarnings("unchecked")
		List<String> list = query.getResultList();

		for (String e : list) {
			System.out.println("Nombre del empleado: " + e);
		}

		// Funcion de agregado
		Query query1 = entitymanager.createQuery("Select MAX(e.salary) from Employee e");
		Double result = (Double) query1.getSingleResult();
		System.out.println("Máximo Salario del Empleado: " + result);

	}

}
