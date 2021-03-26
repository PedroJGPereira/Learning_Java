import java.util.Scanner;

public class Ex4 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int a[][] = new int[4][4];
		int linha;
		int coluna;
		for (linha = 1; linha < 4; linha++) {
			for (coluna = 0; coluna < 3; coluna++) {
				a[linha][coluna] = linha + coluna;
			}
		}
		System.out.println("Matriz: ");
		for (linha = 1; linha < 4; linha++) {
			for (coluna = 0; coluna < 3; coluna++) {
				System.out.print(a[linha][coluna] + " ");
			}
			System.out.println();
		}
	}
}
