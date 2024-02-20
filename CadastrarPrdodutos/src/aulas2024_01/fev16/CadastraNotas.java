package aulas2024_01.fev16;

import javax.swing.JOptionPane;


public class CadastraNotas {

	public static void main(String[] args) {
		double notas[] = new double[5];
		//laço de cadastro
		for (int i = 0; i < notas.length; i++) {
			notas[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite a "
			 + (i+1)+ "ª Nota: "));
		}
		System.out.println("Notas digitadas:  ");
		//laço de impressão
		for (int i = 0; i < notas.length; i++) {
			System.out.print(notas[i] + "  ");
		}
	}
}


