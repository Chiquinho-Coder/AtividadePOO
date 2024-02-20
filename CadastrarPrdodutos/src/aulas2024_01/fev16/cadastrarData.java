//
package aulas2024_01.fev16;
import java.util.Scanner;

public class cadastrarData {
   
    
    
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
    
        System.out.println("Digite o ano: ");
        int ano = scanner.nextInt();
        scanner.nextLine();
        
        System.out.println("Digite o mes: ");
        byte mes = scanner.nextByte();
        scanner.nextLine();
        
        System.out.println("Digite o dia: ");
        byte dia = scanner.nextByte();
        
     
        
        
        Data data = new Data(ano, mes, dia);
        
        boolean isBissexto = data.isAnoBissexto();
        
        System.out.println("Data: "+data.getDia()+"/"+data.getMes()+"/"+data.getAno());
        if (isBissexto == true){
        System.out.println("O ano de "+data.getAno()+ " e bissexto");
        }
        else
        System.out.println("O ano de "+data.getAno()+ " nao e bissexto");
    }
    
}

