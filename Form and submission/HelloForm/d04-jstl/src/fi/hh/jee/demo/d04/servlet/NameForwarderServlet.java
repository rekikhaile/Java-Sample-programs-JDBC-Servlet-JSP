package fi.hh.jee.demo.d04.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fi.hh.jee.demo.d04.bean.Person;

/**
 * Servlet implementation class NimiForwarderServlet
 */
@WebServlet("/show_entered_name")
public class NameForwarderServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public NameForwarderServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Package request parameters to object
		String fnimi = request.getParameter("firstname");
		String lnimi = request.getParameter("lastname");
		String gender = request.getParameter("gender");
		String age = request.getParameter("age");
		float ageNum = Float.parseFloat(age); 
		Person pers = new Person(fnimi, lnimi, gender, ageNum);
		
		//save object to request attribute 
		request.setAttribute("person", pers);
		
		//forward request to jsp-page, which then will printed out
		request.getRequestDispatcher("show_person.jsp").forward(request, response);
	}

}
