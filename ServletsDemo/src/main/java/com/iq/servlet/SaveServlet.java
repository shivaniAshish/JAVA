package com.iq.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.iq.student.Student;
import com.iq.student.dao.impl.StudentDaoImpl;  
public class SaveServlet extends HttpServlet{
	protected void doPost(HttpServletRequest request, HttpServletResponse response)   
	         throws ServletException, IOException {  
	        response.setContentType("text/html");  
	        PrintWriter out=response.getWriter();  
	        String id=request.getParameter("id");  
	        String name=request.getParameter("name");  
	        String course=request.getParameter("course");  
	        String fee=request.getParameter("fee");         
	        Student s=new Student(); 
	        s.setStd_id(id) ; 
	        s.setPassword(password);  
	        s.setEmail(email);  
	        s.setCountry(country);  
	          
	        Student status;
			status = StudentDaoImpl.save(s);
	        if(status>0){  
	            out.print("<p>Record saved successfully!</p>");  
	            request.getRequestDispatcher("index.html").include(request, response);  
	        }else{  
	            out.println("Sorry! unable to save record");  
	        }  
	          
	        out.close();  
	    }  

}
