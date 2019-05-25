package ca.sheridancollege.controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import ca.sheridancollege.models.RetrieveGradeItemDAO;

/**
 * Servlet implementation class RetrieveGradeController
 */
@WebServlet("/RetrieveGradeController")
public class RetrieveGradeController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setAttribute("allGrades", new RetrieveGradeItemDAO().getAllGrades(request.getParameter("gradeBook")));
		request.getRequestDispatcher("DisplayStudentGradesByGradeBook.jsp").forward(request, response);
	}

}
