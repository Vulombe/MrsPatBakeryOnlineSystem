package za.co.bakery.controllers;

import za.co.bakery.service.UserService;
import za.co.bakery.service.UserServiceImpl;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import za.co.bakery.service.UserRegistrationService;
import za.co.bakery.service.UserRegistrationServiceImpl;

public class PatCakeControl extends HttpServlet {

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
        String prs = request.getParameter("pro");
        if (prs != null) {
            if (prs.equals("login")) {
                UserService us = new UserServiceImpl();
                Boolean valid = us.isUserValid("flib@flob", "password");
                request.setAttribute("valid", valid);
                RequestDispatcher view = request.getRequestDispatcher("loginAnswer.jsp");
                view.forward(request, response);
            }
            if (prs.equals("register"))
            {
                UserRegistrationService userReg = new UserRegistrationServiceImpl();
            }
//        
//        response.setContentType("text/html;charset=UTF-8");
//        try (PrintWriter out = response.getWriter()) {
//            /* TODO output your page here. You may use following sample code. */
//            out.println("<!DOCTYPE html>");
//            out.println("<html>");
//            out.println("<head>");
//            out.println("<title>Servlet PatCakeControl</title>");
//            out.println("</head>");
//            out.println("<body>");
//            out.println("<h1>Servlet PatCakeControl at " + request.getContextPath() + "</h1>");
//            String prs = request.getParameter("pro");
//            if (prs != null) {
//                if (prs.equals("login")) {
//                    UserService us = new UserServiceImpl();
//                    out.println("<h1>UserValid?  " + us.isUserValid("flib@flob", "password") + "</h1>");
//                }
//            }
//            out.println("</body>");
//            out.println("</html>");
//            
        }
//        
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
            protected void doGet
            (HttpServletRequest request, HttpServletResponse response)
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
            protected void doPost
            (HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
                processRequest(request, response);
            }

            /**
             * Returns a short description of the servlet.
             *
             * @return a String containing servlet description
             */
            @Override
            public String getServletInfo
            
                () {
        return "Short description";
            }// </editor-fold>

        }
