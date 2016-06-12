package edu.tech.val.courses.jee;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SubirFormulario
 */
@WebServlet("/SubirFormulario")
public class SubirFormulario extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SubirFormulario() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		String edad = request.getParameter("edad");
		String nombre = request.getParameter("nombre");
		
		System.out.println("Hemos recibido Nombre =  "+ nombre +" y edad = "+ edad);
		
		int iedad = Integer.parseInt(edad);
		
		Persona p = new Persona(nombre, iedad);
		
		request.setAttribute("persona", p);
		request.getRequestDispatcher("salida.jsp").forward(request, response);
	}

}
