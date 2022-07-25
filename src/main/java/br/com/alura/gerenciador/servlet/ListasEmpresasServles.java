//Objetivo Gerar Html para as empresas

package br.com.alura.gerenciador.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ListasEmpresasServles
 */
@WebServlet("/listasEmpresas")
public class ListasEmpresasServles extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		Banco banco = new Banco();                 //Criamos um banco de dados para pegar as empresas
        List<Empresa> lista = banco.getEmpresas();

        PrintWriter out = response.getWriter();  //PrintWriter escreve html para o navegador
        out.println("<html><body>");
       
        //aadicionando lista de empresa
        
        out.println("<ul>");                  

        for (Empresa empresa : lista) {  //laco para cada empresa uma lista , imprimir item da lista no caso nome
            out.println("<li> " + empresa.getNome() + "</li>");
        }

        out.println("</ul>");
        
        out.println("</body></html>");
	
	
	}

}
