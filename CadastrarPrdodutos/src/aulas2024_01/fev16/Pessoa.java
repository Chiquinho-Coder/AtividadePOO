
package aulas2024_01.fev16;


 class Pessoa{
      
     private String nome = null;
     private int idade = 0;
     private String endereco = null;
    // public String cpf = null;
     
     public void setNome(String nome){
     this.nome = nome;
     }
     
     public void setIdade(int idade){
     this.idade = idade;
     }
     
     public void setEndereco(String endereco){
     this.endereco = endereco;
     }
     
     public String getNome(){
     return nome;
     }
     
     public int getIdade(){
     return idade;
     }
     
     public String getEndereco(){ 
     return endereco;
     }
     
     
 
     public Pessoa(String n, int i, String e){
     setNome(n);
     setIdade(i);
     setEndereco(e);
     }
     
     
      public Pessoa(){ //construtor padrao
      }
      

      /*public Pessoa (String n, int i, String e){
        nome = n;
        idade = i;
        endereco = e;
        //cpf = x;
      }*/
    }
