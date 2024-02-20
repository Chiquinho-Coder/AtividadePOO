
package aulas2024_01.fev16;



public class TestePessoa {
    
    public static void main(String[] args) {
        String nome = "Robervaldo";
        int idade = 69; 
        String endereco = "Rua dos loucos 33";
        //String cpf = "1723913";
        
        Pessoa Robervaldo = new Pessoa(nome, idade, endereco);
        
        System.out.println("Cabloco 1\n---------");
        System.out.println(Robervaldo.getNome());
        System.out.println(Robervaldo.getIdade());
        System.out.println(Robervaldo.getEndereco());
        //System.out.println(Robervaldo.cpf);
        
                
        
        /*
         Pessoa Juau = new Pessoa();
         Juau.nome = "Juau";
         Juau.idade = 23;
         Juau.endereco = "Rua do tigrinho 420";
        
         System.out.println("\nCabloco 2\n---------");
        System.out.println(Juau.nome);
        System.out.println(Juau.idade);
        System.out.println(Juau.endereco);    */ 
    }
    
}
