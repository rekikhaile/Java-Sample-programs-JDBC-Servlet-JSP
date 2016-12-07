package accessDateTime.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
//import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import accessDateTime.bean.Access;


/**
 * Servlet implementation class AccessTimeServlet
 */
@WebServlet("/AccessTimeServlet")
public class AccessTimeServletTable extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	static List<Access> accesses = new ArrayList<Access>();
	
	int count = 0;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AccessTimeServletTable() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		count = count + 1;
	
		Date today = new Date();
		Date now = new Date();
		DateFormat df = new SimpleDateFormat("dd.MM.yyyy");
		DateFormat df2 = new SimpleDateFormat("HH:mm:ss");		 
		String date = df.format(today);
		String time = df2.format(now);
		
	    Access access = new Access(count,date,time);
		accesses.add(access);
		request.setAttribute("accesses", accesses);
		request.getRequestDispatcher("/WEB-INF/index.jsp").forward(request, response);
		
		//System.out.println("Hello "+access.getDate()+"Hi "+access.getTime()+"then "+access.getCounter());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	/*protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}*/

}
