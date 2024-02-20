package aulas2024_01.fev16;

import javax.swing.JOptionPane;

public class matriz {
    public static void main(String[] args) {
        int[][] m;
        m = new int[4][4];
        int[][] matrix = {
                {10, 52, 45, 63},
                {25, 35, 31, 98},
                {50, 60, 28, 34},
                {65, 30, 90, 27}
        };

        // Exibe os valores das posições [0;0], [1;1], [2;2] e [3;3] usando JOptionPane
        JOptionPane.showMessageDialog(null,
                "Posição [0;0]: " + matrix[0][0] + "\n" +
                        "Posição [1;1]: " + matrix[1][1] + "\n" +
                        "Posição [2;2]: " + matrix[2][2] + "\n" +
                        "Posição [3;3]: " + matrix[3][3] + "\n",  // Adicionada a vírgula aqui
                "Valores das Posições", JOptionPane.INFORMATION_MESSAGE);
    }
}
