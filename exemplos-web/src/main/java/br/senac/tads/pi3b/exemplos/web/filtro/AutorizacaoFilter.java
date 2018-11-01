/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.tads.pi3b.exemplos.web.filtro;

import br.senac.tads.pi3b.exemplos.web.entidade.UsuarioSistema;
import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author fernando.tsuda
 */
@WebFilter(filterName = "AutorizacaoFilter",
        servletNames = {"HomeServlet"},
        urlPatterns = {"/protegido/*"})
public class AutorizacaoFilter implements Filter {

    private boolean verificarAcesso(UsuarioSistema usuario,
            HttpServletRequest request,
            HttpServletResponse response) {
        String pagina = request.getRequestURI();
        if (pagina.endsWith("/protegido/peao") && usuario.verificarPapel("PEAO")) {
            return true;
        } else if (pagina.endsWith("/protegido/fodon") && usuario.verificarPapel("FODON")) {
            return true;
        } else if (pagina.endsWith("/protegido/god") && usuario.verificarPapel("GOD")) {
            return true;
        } else if (pagina.endsWith("/home")) {
            return true;
        }
        return false;
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response,
            FilterChain chain) throws IOException, ServletException {
        HttpServletRequest httpRequest = (HttpServletRequest) request;
        HttpServletResponse httpResponse = (HttpServletResponse) response;

        // Verificar se usuário já está logado
        HttpSession sessao = httpRequest.getSession();
        if (sessao.getAttribute("usuario") == null) {
            // Usuario nao logado -> redireciona para /login
            httpResponse.sendRedirect(httpRequest.getContextPath() + "/login");
            return;
        }
        UsuarioSistema usuario = (UsuarioSistema) sessao.getAttribute("usuario");

        // Verificar se usuario tem permissao de acesso a pagina
        if (verificarAcesso(usuario, httpRequest, httpResponse)) {
            // Requisicao sera processada normalmente.
            chain.doFilter(request, response);
        } else {
            // Mostrar mensagem de nao autorizado
            httpResponse.sendRedirect(httpRequest.getContextPath() + "/erro-nao-autorizado.jsp");
        }
    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void destroy() {

    }

}
