package ca.sheridancollege.controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ca.sheridancollege.models.GradeBookModel;
import ca.sheridancollege.models.SaveGradeBookDAO;


/**
 * Servlet implementation class InsertGradeBookController
 */
@WebServlet("/InsertGradeBookController")
public class InsertGradeBookController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//new SaveGradeBookDAO().insertData(request.getParameter("gradeBookName"), request.getParameter("semester"));
		//new SaveGradeBookDAO().insertData(request.getParameter("gradeBookName"), request.getParameter("semester"));
		GradeBookModel tempGradeBook = new GradeBookModel();
		tempGradeBook = new SaveGradeBookDAO().insertData(request.getParameter("gradeBookName"), request.getParameter("semester"));
		request.setAttribute("gradeBook", tempGradeBook);
		request.getRequestDispatcher("Success.jsp").forward(request, response);
		
	
	}

}
