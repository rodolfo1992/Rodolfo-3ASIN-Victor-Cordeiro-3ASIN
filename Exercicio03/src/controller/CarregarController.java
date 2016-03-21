package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Aluno;

/**
 * Servlet implementation class CarregarController
 */
@WebServlet("/carregar_alunos.do")
public class CarregarController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CarregarController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Servlet#getServletConfig()
	 */
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int id = Integer.parseInt(request.getParameter("id"));
		Aluno aluno = new Aluno(id);
		
		if("acao".equals("Carregar"))
		{
			aluno.carregar();
		}
		PrintWriter out = response.getWriter();
		out.println("<html><head><title>Aluno Cadastrado</title></head><body>");
		out.println( "id: "+aluno.getId()+"<br>");
		out.println( "nome: "+aluno.getNome()+"<br>");
		out.println( "endereco: "+aluno.getEndereco()+"<br>");
		out.println( "data de nascimento: "+aluno.getdtNasc()+"<br>");
		out.println( "email: "+aluno.getEmail()+"<br>");
		out.println( "fone: "+aluno.getTelefone()+"<br>");
		out.println( "rg: "+aluno.getRG()+"<br>");
		out.println( "cpf: "+aluno.getCPF()+"<br>");
		out.println("</body></html>");		
	}

	/**
	 * @see HttpServlet#doDelete(HttpServletRequest, HttpServletResponse)
	 */
	protected void doDelete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
