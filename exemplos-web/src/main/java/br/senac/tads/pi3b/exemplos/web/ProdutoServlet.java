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

/**
 *
 * @author fernando.tsuda
 */
@WebServlet(name = "ProdutoServlet", urlPatterns = {"/produtos"})
public class ProdutoServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String nome = request.getParameter("nome");
        String idade = request.getParameter("idade");
        
        List<Produto> lista = new ArrayList<>();
        Produto p1 = new Produto();
        p1.setId(1L);
        p1.setNome("Produto 1");
        p1.setPreco(100);
        lista.add(p1);
        
        Produto p2 = new Produto();
        p2.setId(2L);
        p2.setNome("Produto 2");
        p2.setPreco(110);
        lista.add(p2);
        
        Produto p3 = new Produto();
        p3.setId(3L);
        p3.setNome("Produto 3");
        p3.setPreco(90);
        lista.add(p3);
        request.setAttribute("resultado", lista);
        request.setAttribute("nome", nome);
        request.setAttribute("idade", idade);
        
        RequestDispatcher dispatcher = 
                request.getRequestDispatcher("produto2.jsp");
        dispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

}
