/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet(name = "EjemploServlet", urlPatterns = {"/EjemploServlet"})
public class EjemploServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException { PrintWriter out = response.getWriter();
                
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Ejemplo</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Respuesta desde un Servlet </h1>");
            out.println("</body>");
            out.println("</html>");
            out.close();
        }
    }

