package fi.softala.jee.demo.d07.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fi.softala.jee.demo.d07.bean.Person;
import fi.softala.jee.demo.d07.dao.PersonDAO;


/**
 * Servlet implementation class HenkiloServlet
 */
@WebServlet("/persons")
public class PersonServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PersonServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String firstName = request.getParameter("Firstname");
		//tietokannasta henkilöt
		PersonDAO hDao = new PersonDAO();
		List<Person> persons = hDao.getPersonByName(firstName);
		
		//requestiin talteen
		request.setAttribute("persons", persons);
		
		//jsp hoitaa muotoilun
		request.getRequestDispatcher("persons.jsp").forward(request, response);
		
	}

}
