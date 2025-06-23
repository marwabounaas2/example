/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author marwa
 */
@WebServlet(name = "ex_ser", urlPatterns = {"/ex_ser"})
public class ex_ser extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
         int n1=Integer.parseInt(request.getParameter("note1"));
      int n2=Integer.parseInt(request.getParameter("note2"));
      float m=(n1+n2)/2;
      request.setAttribute("M", m);
      request.getRequestDispatcher("calcul.jsp").forward(request, response);
      
        
        
        
        
        
        
    }}