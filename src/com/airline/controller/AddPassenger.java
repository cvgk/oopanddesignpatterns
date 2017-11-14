package com.airline.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AddPassenger
 */
@WebServlet("/AddPassenger")
public class AddPassenger extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddPassenger() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	   RequestDispatcher view = request.getRequestDispatcher
			   ("WEB-INF/views/addpassenger.jsp");
	   view.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String firstname = request.getParameter("firstname");
		System.out.println("first name "+firstname);
		if(firstname.length()==0)
		{
			System.out.println("empty first name error.");
			request.setAttribute("errors", true);
			request.setAttribute("firstname error", true);
		}
		String lastname= request.getParameter("lastname");
		System.out.println("last name "+lastname);
		String dob = request.getParameter("dob");
		String[] dobAraay = dob.split("\\/");
		String day= dobAraay[0];
		String month =dobAraay[1];
		String year = dobAraay[2];
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.YEAR, Integer.parseInt(year));
		cal.set(Calendar.MONTH, Integer.parseInt(month));
		cal.set(Calendar.DAY_OF_MONTH,Integer.parseInt(day));
		
		Date d = cal.getTime();
		
		String gender = request.getParameter("gender");
		System.out.println("gender "+gender);
	}

}
