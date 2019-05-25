package ca.sheridancollege.controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ca.sheridancollege.models.GradeBookModel;
import ca.sheridancollege.models.GradeItemModel;
import ca.sheridancollege.models.RetrieveGradeItemDAO;
import ca.sheridancollege.models.SaveGradeDAO;

/**
 * Servlet implementation class InsertStudentGradeController2
 */
@WebServlet("/InsertStudentGradeController2")
public class InsertStudentGradeController2 extends HttpServlet {
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
		
		GradeItemModel studentGradeInfo = new SaveGradeDAO().insertData(request.getParameter("studentName"), request.getParameter("grade"), request.getParameter("gradeBookName"));
		
		request.setAttribute("studentGrade", studentGradeInfo);
		request.setAttribute("allUsers", new RetrieveGradeItemDAO().getAllGrades(request.getParameter("gradeBookName")));
		request.setAttribute("gradeBook", classGradeBook);
		request.getRequestDispatcher("AddStudentGrade.jsp").forward(request, response);
	}

}
