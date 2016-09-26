package exercicio_1;

import javax.swing.JOptionPane;

public class Matriz {
	public void calculamatriz(int a[][], int b[][]) {
		
			
			int[][] resultado = new int[3][3];

			for (int i = 0; i < a.length; i++) {
				for (int j = 0; j < b[0].length; j++) {
					for (int k = 0; k < b.length; k++) {
						resultado[i][j] += a[i][k] * b[k][j];
					}

				}

			}
			String saida = "";
			for (int i = 0; i < resultado.length; i++) {
				saida+="| ";
				for (int j = 0; j < resultado[0].length; j++) {
					saida += resultado[i][j] + " ";
				}
				saida +="|\n";
			}
			System.out.print(saida);
			JOptionPane.showMessageDialog(null, saida);
		}
	

	

	public static void main(String[] args) {
		Matriz matriz = new Matriz();
		int[][] matrizA = new int[3][3];
		matrizA[0][0] = 3;
		matrizA[0][1] = 0;
		matrizA[0][2] = 2;
		//
		matrizA[1][0] = 9;
		matrizA[1][1] = 1;
		matrizA[1][2] = 7;
		//
		matrizA[2][0] = 1;
		matrizA[2][1] = 0;
		matrizA[2][2] = 1;
		
		//
		int[][] matrizB = new int[3][3];
		matrizB[0][0] = 1;
		matrizB[0][1] = 0;
		matrizB[0][2] = -2;
		//
		matrizB[1][0] = -2;
		matrizB[1][1] = 1;
		matrizB[1][2] = -3;
		//
		matrizB[2][0] = -1;
		matrizB[2][1] = 0;
		matrizB[2][2] = 3;
		
			
		
		int[][] a = matrizA;
		int[][] b = matrizB;
		matriz.calculamatriz(a, b);

	}

}
