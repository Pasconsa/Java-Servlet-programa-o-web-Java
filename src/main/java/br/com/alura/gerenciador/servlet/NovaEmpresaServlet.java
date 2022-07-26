package br.com.alura.gerenciador.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class NovaEmpresaServlet
 */
@WebServlet("/novaEmpresa")
public class NovaEmpresaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Cadastrando nova empresa");
		
		String nomeEmpresa = request.getParameter("nome");  //receber um parametro da requisição
		Empresa empresa = new Empresa();
		empresa.setNome(nomeEmpresa);
		  
		Banco banco = new Banco();   //simulando uma classe banco de dados
		banco.adiciona(empresa);     //banco dados adciona na empresa ; mas não tem metodo adiciona
		
		//CHAMAR O JSP
		
		RequestDispatcher rd = request.getRequestDispatcher("/novaEmpresaCriada.jsp"); //dESPACHAR UM REQUISITOR PARA JSP
		request.setAttribute("empresa", empresa.getNome()); //NA REQUISIÇÃO COLOCAR UM APELIDO E UM OBJETO
		rd.forward(request, response);   //LEVA A REQUISIÇÃO E A RESPOSTA

	}

}
