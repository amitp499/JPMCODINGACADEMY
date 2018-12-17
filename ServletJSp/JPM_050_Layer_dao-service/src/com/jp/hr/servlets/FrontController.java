package com.jp.hr.servlets;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jp.hr.entities.Employee;
import com.jp.hr.exceptions.HrException;
import com.jp.hr.services.ServiceEmployee;
import com.jp.hr.services.ServiceEmployeeImpl;

@WebServlet("*.do")  //a generic URL
public class FrontController extends HttpServlet {
	
	private ServiceEmployee services;
	
	@Override
	public void init() throws ServletException {
		
		services = new ServiceEmployeeImpl();
		
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String command = getCommand(request.getRequestURI());
		
		RequestDispatcher dispatch=null;
		String jspName=null;
		String preFix = "/WEB-INF/jsps/";
		String postFix = ".jsp";
		
		try {
		
		switch (command){
		
		case "*": 
			
		case "mainMenu":{
			
				jspName="mainMenu";
				break;
		}
		
		case "empList": {
			
				ArrayList<Employee> empList;
								
					empList = services.getEmpList();
					
					System.out.println(empList);
					
					request.setAttribute("empList", empList);
					
					jspName = "EmpList";
					
				
				break;
			}
		
			case "empDetails": {
				
					String idStr = request.getParameter("id");  //empDetails.do?id=x
					
					int empId = Integer.parseInt(idStr);
								
					Employee emp = services.getEmpDetails(empId);
					
					//System.out.println(empList);
					
					request.setAttribute("empDetails", emp);
					
					//RequestDispatcher dispatch = request.getRequestDispatcher("/WEB-INF/jsps/EmpList.jsp");
					jspName = "empDetails";
					
				//dispatch.forward(request, response);
					break;
				
			}
			
			case "newJoining": {
				
				
				jspName = "newJoining";
						
				break;
			
			}
			
			
			case "submitJoinee": {
				
				String empIdStr = request.getParameter("empId");
				String firstNameStr = request.getParameter("firstName");
				String lastNameStr = request.getParameter("lastName");
				int empIdc = Integer.parseInt(empIdStr);
				
				Employee emp = new Employee(empIdc,firstNameStr, lastNameStr );
				
				boolean isSuccessFull = services.addNewEmp(emp);
				
				String msg=isSuccessFull?"Employee Added":"Insertion Failed";
				
				request.setAttribute("message", msg);								
				jspName = "newJoining";
				break;
			
				}
		
		} 
		
			}catch (HrException e) {
				
				e.printStackTrace();
			}
		
		 dispatch = request.getRequestDispatcher(preFix+jspName+postFix);
		 dispatch.forward(request, response);
		}
		

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doGet(request, response);
	}
	
	private String getCommand(String uri){
		
		int leftPosi = uri.lastIndexOf("/");
		int rtPosi = uri.lastIndexOf(".");
		
		if(rtPosi<=leftPosi){
			
			return "mainMenu";
			
		}else{
			
			return uri.substring(leftPosi+1, rtPosi);
		}
		
		
	}

}
