/*Pacote de classes DAO + Classes de Negócio + 
 * ConnectionFactory baseado na aula 02b
 */



public class Aluno
{ 
   private String nome,endereco,dtnasc,email,telefone,rg,cpf;
   private int id;
   
   
    public Aluno()
   { 
      setNome(nome);
      setEndereco(endereco);
      setdtNasc(dtnasc);
      setEmail(email);
      setTelefone(telefone);
      setRG(rg);
      setCPF(cpf);
      setId(id);
    }

   public Aluno(int id,String nome,String endereco,String telefone,String email,String rg,String cpf,String dtnasc)
   { 
      setNome(nome);
      setEndereco(endereco);
      setdtNasc(dtnasc);
      setEmail(email);
      setTelefone(telefone);
      setRG(rg);
      setCPF(cpf);
      setId(id);
    }
    
    public void setId(int id)
    { 
      this.id = id;
    }
    public void setNome(String nome)
    {
    this.nome = nome;
    }
   
    public void setEndereco(String endereco)
    {
     this.endereco = endereco;
    }
    
   public void setdtNasc(String dtnasc)
   {
   this.dtnasc = dtnasc;
   }
   
   public void setEmail(String email)
   { 
      this.email = email;
   } 
   
   public void setTelefone(String telefone)
   { 
      this.telefone = telefone;
   }
   
   public void setRG(String rg)
   {
      this.rg = rg;
   }
   
   public void setCPF(String cpf)
   {
      this.cpf = cpf;
   }
   
   public String getNome()
   {
    return nome  ;
   }
   
   public String getCPF()
   {
   return cpf   ;
   }
   
   public String getRG()
   {
    return rg  ;
   }
   
      
      public String getEndereco()
   {
    return endereco ;
   }  
   
   
      public String getEmail()
   {
    return endereco ;
   }    
   
   
   public String getdtNasc()
   {
    return dtnasc  ;
   }
   
   
      public String getTelefone()
   {
    return telefone  ;
   }
   
   public int getId()
   { 
      return id;
   }
   
	public void criar() {
		AlunoDAO dao = new AlunoDAO();
		AlunoTO to = new AlunoTO();
		to.setId(id);
		to.setNome(nome);
		to.setEndereco(endereco);
		to.setdtNasc(dtnasc);
		to.setEmail(email);
		to.setTelefone(telefone);
		to.setRG(rg);
		to.setCPF(cpf);
		dao.incluir(to);
	}

	public void atualizar() {
		AlunoDAO dao = new AlunoDAO();
		AlunoTO to = new AlunoTO();
		to.setId(id);
		to.setNome(nome);
		to.setEndereco(endereco);
		to.setdtNasc(dtnasc);
		to.setEmail(email);
		to.setTelefone(telefone);
		to.setRG(rg);
		to.setCPF(cpf);
		dao.alterar(to);
	}

	public void excluir() {
		AlunoDAO dao = new AlunoDAO();
		AlunoTO to = new AlunoTO();
		to.setId(id);
		dao.excluir(id);
	}

	public void carregar() {
		AlunoDAO dao = new AlunoDAO();
		AlunoTO to = dao.procurar(id);
		nome = to.getNome();
		endereco = getEndereco();
		dtnasc = getdtNasc();
		email = getEmail();
		telefone = getTelefone();
		rg = getRG();
		cpf = getCPF();
	}

   
   
   
   }  
   
   
   