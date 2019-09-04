package com.zomato.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.zomato.entity.ZomatoEmployee;
import com.zomato.service.ZomatoService;
import com.zomato.service.ZomatoServiceInterface;

/**
 * Servlet implementation class Zomato
 */
public class Zomato extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void service(HttpServletRequest rqs, HttpServletResponse rsp) throws ServletException, IOException 
	{
		rsp.setContentType("text/html");
		PrintWriter out=rsp.getWriter();
		out.println("<html><body>");
		String option=rqs.getParameter("ac");
		if (option.equals("Register"))
		{
			String name=rqs.getParameter("name");
			String pass=rqs.getParameter("pass");
			String email=rqs.getParameter("email");
			String address=rqs.getParameter("address");
			ZomatoEmployee ze=new ZomatoEmployee();
			ze.setName(name);
			ze.setPass(pass);
			ze.setEmail(email);
			ze.setAddress(address);
			ZomatoServiceInterface zs=ZomatoService.createServiceObject();
			int i=zs.createProfile(ze);
			System.out.println(i);
			if(i>0) {
			out.println("profile is created");
			
		}
		else {
			out.println("profile is not created");
		}
		}
	
	
	
	if(option.equals("login"))
	{
		
	}
	if(option.equals("timeline")) {
		
	}
	out.println("</body></html>");
		}
	}
			
			
			



	

			
			
			
		
				
		
		
		
		
	


