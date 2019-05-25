package ca.sheridancollege.controllers;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ca.sheridancollege.models.GradeBookModel;
import ca.sheridancollege.models.RetrieveGradeBookDAO;

/**
 * Servlet implementation class RetrieveGradeBookController
 */
@WebServlet("/RetrieveGradeBookController")
public class RetrieveGradeBookController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("gradeBooks", new RetrieveGradeBookDAO().getAllGradeBooks());
		request.getRequestDispatcher("DisplayGradeBooks.jsp").forward(request, response);
	}

}
