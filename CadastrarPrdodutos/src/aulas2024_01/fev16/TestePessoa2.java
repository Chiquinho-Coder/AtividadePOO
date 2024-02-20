//
package aulas2024_01.fev16;
import java.util.Scanner;

public class TestePessoa2 {
   
    
    
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
    
        System.out.println("Digite o nome do cabloco: ");
        String nome = scanner.nextLine();
        
        System.out.println("Digite a idade: ");
        int idade = scanner.nextInt();
        scanner.nextLine();
        
        System.out.println("Digite o endereco: ");
        String endereco = scanner.nextLine();
        
        
        
        
        Pessoa p = new Pessoa(nome, idade, endereco );
        
        System.out.println("--------------------------------");
        System.out.println("\nNome: " + p.getNome());
        System.out.println("\nIdade:" + p.getIdade());
        System.out.println("\nEndereco: " + p.getEndereco());
    }
}

