package br.com.alura.gerenciador.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//oi                 
@WebServlet(urlPatterns="/oi")            //Não basta estender a classe HttpServlet, 
										//também devemos configurar a URL através da anotação @WebServlet.
public class OlaMundoServlet extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		
		PrintWriter out = resp.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("Ola, escrevi o primeiro sevlets");
		out.println("</body>");
		out.println("</html>");
		
	}
}
