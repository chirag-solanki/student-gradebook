package ca.sheridancollege.controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import ca.sheridancollege.models.GradeBookModel;
import ca.sheridancollege.models.RetrieveGradeItemDAO;

/**
 * Servlet implementation class SaveGradesController
 */
@WebServlet("/SaveGradesController")
public class SaveGradesController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		GradeBookModel classGradeBook = new GradeBookModel();
		classGradeBook.setGradeBookName(request.getParameter("gradeBookName"));
		classGradeBook.setSemester(request.getParameter("semester"));
		
		request.setAttribute("gradeBook", classGradeBook);
		request.setAttribute("allUsers", new RetrieveGradeItemDAO().getAllGrades(request.getParameter("gradeBookName")));
		request.getRequestDispatcher("Saved.jsp").forward(request, response);
		
	}

}
