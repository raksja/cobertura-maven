package com.techastute.blog.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.techastute.blog.SimpleDBService;

public class SimpleServlet extends HttpServlet {
   
	public void doGet(HttpServletRequest request,
                      HttpServletResponse response)
        throws ServletException, IOException {

    	 String name = request.getParameter("name" );
         SimpleDBService service = new SimpleDBService();
         PrintWriter out = response.getWriter();
         try {
             out.println( service.simpleWelcomMessage( name ) );
         } catch( Exception e ) {
             out.println( "Error Retrieving Name: " + e.getMessage() );
         }
         out.flush();
         out.close();
    }
	
}