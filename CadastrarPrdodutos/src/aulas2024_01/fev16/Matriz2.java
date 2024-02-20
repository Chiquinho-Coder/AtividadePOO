package aulas2024_01.fev16;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Matriz2 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        //tamanho da matrix
        System.out.println("Digite o tamanho X da matriz");
        int x = ler.nextInt();
        
        System.out.println("Digite o tamanho Y da matriz");
        int y = ler.nextInt();
        
        //criaçao da matrix com o tamanho desejado
        int[][] m = new int[x][y];
        
        //preencher matrix
        for (int i = 0; i < x; i++) {
          for (int j = 0; j < y; j++) {
              System.out.println("Insira: ");
              m[i][j] = ler.nextInt();
        }
    }
        
    int plus = encontrarMaior(m);
    int minus = encontrarMenor(m);  
    
        System.out.println("Matriz:\n");  
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++){
                System.out.print(m [i][j] + " " );
            }
            System.out.println(" ");
        }
        
    
    System.out.println("\nMaior: "+plus+"\nMenor: "+minus);
        }
        
        //encontrar maior resultado
        public static int encontrarMaior(int[][] matriz) {
        int maior = matriz[0][0];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] > maior) {
                    maior = matriz[i][j];
                }
            }
        }

        return maior;
    }

        
        //encontrar menor
         public static int encontrarMenor(int[][] matriz) {
        int menor = matriz[0][0];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] < menor) {
                    menor = matriz[i][j];
                }
            }
        }

        return menor;
    }
}
