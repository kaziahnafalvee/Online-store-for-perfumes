/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Newconnection;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author pc
 */
public class Checkout extends HttpServlet {

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
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Checkout</title>");            
            out.println("</head>");
            out.println("<body>");
            String firstname = request.getParameter("firstname");
            String email = request.getParameter("email");
            String address = request.getParameter("address");
            String cardname = request.getParameter("cardname");
            String cardnumber = request.getParameter("cardnumber");
            Card regCard = new Card(firstname, email, address, cardname, cardnumber);
            CheckoutDatabase chkdb = new CheckoutDatabase(ConnectionPro.getConnection());
            chkdb.saveCard(regCard);
            
            ProductDatabase getProduct = new ProductDatabase(ConnectionPro.getConnection());
            List<Product> allProduct=getProduct.getAllProducts();
            float Total = 0;
            for(int i =0; i<allProduct.size(); i++ ){
                Product p = allProduct.get(i);
                float value = Float.parseFloat(p.pPrice);
                Total = Total+value;
            }
            request.setAttribute("product_list", allProduct);
            request.setAttribute("total", Total);
            CheckoutDatabase getCard = new CheckoutDatabase(ConnectionPro.getConnection());
            List<Card> acard = getCard.getCardDetails();
            Card card= acard.get(0);
            String fname= card.firstname;
            String em = card.email;
            String addr = card.address;
            String cnumber = card.cardnumber;
            String cname = card.cardname;
            request.setAttribute("firstname", fname);
            request.setAttribute("email",em);
            request.setAttribute("address", addr);
            request.setAttribute("cardnumber", cnumber);
            request.setAttribute("cardname", cname);
            
            RequestDispatcher requestDispatcher = request.getRequestDispatcher("checkout.jsp");
            requestDispatcher.forward(request, response);
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

