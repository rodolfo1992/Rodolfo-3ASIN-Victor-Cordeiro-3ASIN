package controller;

import java.io.IOException;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Aluno;
import to.AlunoTO;

//import to.AlunoTO;



/**
 * Servlet implementation class AlunoController
 */
@WebServlet("/manter_alunos.do")
public class AlunoController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public AlunoController() {
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
		String nome = request.getParameter("nome");
		String endereco = request.getParameter("endereco");
		String dtnasc = request.getParameter("data de nascimento");
		String email = request.getParameter("email");
		String telefone = request.getParameter("telefone");
		String rg = request.getParameter("rg");
		String cpf = request.getParameter("cpf");
		
		
		Aluno aluno = new Aluno(id,nome,endereco,dtnasc,email,telefone,rg,cpf);
		aluno.criar();
		//aluno.carregar();
		//AlunoDAO dao = new AlunoDAO();
				if("acao".equals("Inserir"))
				{
				aluno.criar();
				aluno.carregar();
				}
				
				else{ 
					if("acao".equals("Atualizar"))
					{
						aluno.atualizar();
						aluno.carregar();
					}		
					
					else{ 
						if("acao".equals("Excluir"))
						{
							aluno.excluir();
							aluno.carregar();
						}	
						
						else{ 
							if("acao".equals("Carregar"))
							{
								aluno.carregar();
	
							}	
							
						}
						
						AlunoTO to = new AlunoTO();
						to.setId(aluno.getId());
						to.setNome(aluno.getNome());
						to.setTelefone(aluno.getTelefone());
						request.setAttribute("aluno", to);
						RequestDispatcher view = 
								request.getRequestDispatcher("AlunoForm.jsp");
					view.forward(request, response);	
				
	}
				}
	}
	/**
	 * @see HttpServlet#doDelete(HttpServletRequest, HttpServletResponse)
	 */
	protected void doDelete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
