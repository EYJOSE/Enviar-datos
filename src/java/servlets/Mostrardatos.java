/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 *
 * @author jose luis
 */
@WebServlet(name = "Mostrardatos", urlPatterns = {"/Mostrardatos"})
public class Mostrardatos extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {  
            
             String nombre = request.getParameter("nombre");
            String genero = request.getParameter("genero");
            String codArticulo = request.getParameter("cod_articulo");
            String idPedido = request.getParameter("id_pedido");
            String cantidad = request.getParameter("cantidad");
            String precio = request.getParameter("precio");

           // Generar la respuesta HTML
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Datos del Artículo</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Datos del Artículo Registrado</h1>");
            out.println("<p>Nombre del artículo: " + nombre + "</p>");
            out.println("<p>Artículo para: " + (genero.equals("H") ? "Hombre" : "Mujer") + "</p>");
            out.println("<p>Código de Artículo: " + codArticulo + "</p>");
            out.println("<p>ID de Pedido: " + idPedido + "</p>");
            out.println("<p>Cantidad: " + cantidad + "</p>");
            out.println("<p>Precio x unidad: $" + precio + "</p>");
            out.println("</body>");
            out.println("</html>");
    }
}
    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
