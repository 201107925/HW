/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sura.controller;

//<editor-fold defaultstate="collapsed" desc="imports">
//import sura.Repository.suraRepository;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import suras.entity.sura;
import javax.inject.Inject;
//</editor-fold>

@WebServlet("/login")

public class suraController extends HttpServlet {
    //@Inject
   // suraRepository suraRepository ;

    //<editor-fold defaultstate="collapsed" desc="doGet">
    @Override
    protected void doGet(HttpServletRequest request, 
            HttpServletResponse response)
            throws ServletException, IOException {

     

        //Forward to the jsp page for rendering
        request.getRequestDispatcher("login.jsp").forward(request, response);
    }

    //</editor-fold>
}

