/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.tads.pi3b.exemplos.web;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author fernando.tsuda
 */
@WebServlet(name = "GodServlet", urlPatterns = { "/protegido/god" })
public class GodServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        request.setAttribute("titulo", "Página do GOD");
        request.setAttribute("msg", "Somente usuários com Papel GOD podem entrar nesta tela.");

        RequestDispatcher dispatcher
                = request.getRequestDispatcher("/WEB-INF/jsp/resultado.jsp");
        dispatcher.forward(request, response);
    }

}
