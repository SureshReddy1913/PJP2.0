package com.sapient.cal;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/GetResult")
public class GetResult extends HttpServlet {
	private static final long serialVersionUID = 1L;
	static String choice,input1,input2;
    public GetResult() {
        super();
        
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		SessionClass session=new SessionClass();
		choice=request.getParameter("choice");
		input1=request.getParameter("input1");
		input2=request.getParameter("input2");
		session.setInput(input2);
		Operation operation=GetclassFromChoice.getClassFromChoice(Integer.parseInt(choice),request.getParameter("flag"));
		operation.operation(StringDateConverions.stringToDate(input1),session);
		request.setAttribute("ans", session.output);
		request.getRequestDispatcher("resultpage.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
