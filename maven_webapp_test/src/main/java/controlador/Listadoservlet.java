package controlador;

import java.io.IOException;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entidades.Persona;

public class Listadoservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Listadoservlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("maven_webapp_test");
		EntityManager em = emf.createEntityManager();

		Query query = em.createQuery("SELECT p FROM Persona p");

		@SuppressWarnings("unchecked")
		List<Persona> personas = query.getResultList();
		
		//List<Persona> personas = em.createQuery("SELECT p FROM Persona p", Persona.class).getResultList();

		em.close();
		emf.close();

		request.setAttribute("personas", personas);
		request.getRequestDispatcher("resultados.jsp").forward(request, response);
	}
}
