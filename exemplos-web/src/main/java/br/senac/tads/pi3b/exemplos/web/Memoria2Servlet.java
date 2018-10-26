/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.tads.pi3b.exemplos.web;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author fernando.tsuda
 */
@WebServlet(name = "Memoria2Servlet", urlPatterns = {"/memoria2"})
public class Memoria2Servlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String idSelecionado = request.getParameter("id");

        if (idSelecionado != null) {
            // Cria ou recupera sessao do usuario
            HttpSession sessao = request.getSession();
            
            List<String> listaIds;
            Object objIds = sessao.getAttribute("lista");
            if (objIds != null) {
                listaIds = (List<String>) objIds;
            } else {
                listaIds = new ArrayList<>();
            }
            listaIds.add(idSelecionado);
            sessao.setAttribute("lista", listaIds);
        }

        RequestDispatcher dispatcher
                = request.getRequestDispatcher("/WEB-INF/jsp/memoria2.jsp");
        dispatcher.forward(request, response);
    }

}
