
package aulas2024_01.fev16;
import java.util.Scanner;
import java.util.Calendar;
public class DiasVividos {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Calendar c = Calendar.getInstance();
        
        System.out.println("Digite o dia de nascimento: \n");
        int dia = ler.nextInt();
        System.out.println("Digite o mes de nascimento: \n");
        int mes = ler.nextInt();
        System.out.println("Digite o ano de nascimento: \n");
        int ano = ler.nextInt();
        
        dataN data = new dataN(dia,mes,ano);
        
        c.set(Calendar.YEAR,data.ano);
        c.set (Calendar.MONTH, data.mes);
        c.set (Calendar.DAY_OF_MONTH, data.dia);
        
        
        int idade = 2024 - data.ano;
        if(2 < data.mes){
        idade --;}
        System.out.println("Voce tem "+idade+" anos");
        
        int dias = idade * 365;
        System.out.println("\nE voce viveu "+dias+" dias de vida :D");
    }
    
  
   



}