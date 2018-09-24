package primer.controller;
import primer.model.Persona;
import java.util.*;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class PersonaController
 */
@WebServlet(name = "persona", urlPatterns = { "/persona" })
public class PersonaController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	
	private List<Persona> personas = new ArrayList <Persona>();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PersonaController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(personas.toString()).append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("::: Entro al metodo doPost ::::");
		
		String nombre = request.getParameter("nombre");
		String apellidos  = request.getParameter("apellidos");
		int edad = Integer.parseInt(request.getParameter("edad"));
		float estatura  = Float.parseFloat(request.getParameter("estatura"));
		
		System.out.println(":::: Registro de una nueva persona ::::");
		
		Persona nuevaPersona = new Persona(nombre, apellidos, edad, estatura);
		
		personas.add(nuevaPersona);
		System.out.println(personas);
		}

}
