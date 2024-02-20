package aulas2024_01.fev16;

import javax.swing.JOptionPane;
public class CadastraNotas2 {
	public static void main(String[] args) {
		int tam = Integer.parseInt(JOptionPane.showInputDialog("Digite o "
			 + "tamanho do vetor: "));
		float notas[] = new float[tam];
		//laço de cadastro
		for (int i = 0; i < tam; i++) {
			notas[i] = Float.parseFloat(JOptionPane.showInputDialog(
					"Digite a " + (i+1)+ "ª Nota: "));
		}
		System.out.println("Notas digitadas:  ");
		//laço de impressão
		for (int i = 0; i < notas.length; i++) {
			System.out.print(notas[i] + " ");
		}
		
	}
}