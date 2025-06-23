/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

/**
 *
 * @author marwa
 */
public class ex_serTest {
    
    
    @Test
    public void testDoPost() throws Exception {
        System.out.println("doPost");
        HttpServletRequest request =mock(HttpServletRequest.class);
        HttpServletResponse response =mock(HttpServletResponse.class);
        RequestDispatcher Dispatcher =mock(RequestDispatcher.class);
        when(Integer.parseInt(request.getParameter("note1"))).thenReturn(5);
        when(Integer.parseInt(request.getParameter("note2"))).thenReturn(7);
        when(request.getRequestDispatcher("calcul.jsp")).thenReturn(Dispatcher);
        ex_ser instance = new ex_ser();
        instance.doPost(request, response);
        verify(Dispatcher).forward(request,response);
       
    }
    
}

