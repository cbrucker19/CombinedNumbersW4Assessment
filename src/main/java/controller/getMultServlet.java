package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.combinednumberspojo;
/**
 * @author ${user} - cbrucker19
 * CIS175 - Spring 2022
 * ${date}
 */
/**
 * Servlet implementation class getMultServlet
 */
@WebServlet("/getMultServlet")
public class getMultServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public getMultServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String firstNum = request.getParameter("firstNum");
		String secondNum = request.getParameter("secondNum");
		
		combinednumberspojo userAdd = new combinednumberspojo(Integer.parseInt(firstNum), Integer.parseInt(secondNum));
		
		request.setAttribute("userMultResult", userAdd); //may need .getAddTotal()
		
		getServletContext().getRequestDispatcher("/multResult.jsp").forward(request, response);
	}
}
