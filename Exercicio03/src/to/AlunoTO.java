package to;

/*Pacote de classes DAO + Classes de Negócio + 
 * ConnectionFactory baseado na aula 02b
 */


public class AlunoTO
{ 
   private String nome,endereco,dtnasc,email,telefone,rg,cpf;
   private int id;
   
   
    public AlunoTO()
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

   public AlunoTO(int id,String nome,String endereco,String telefone,String email,String rg,String cpf,String dtnasc)
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
   
   }  
   
   
   