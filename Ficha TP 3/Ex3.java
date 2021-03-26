import java.util.Scanner;

public class Ex3 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int i;
		int a[] = new int[30];
		double media = 0;
		int soma = 0;
		int aprov = 0;
		int merito = 0;
		double perc = 0;

		for (i = 0; i < 30; i++) {
			System.out.println("Indique a nota do aluno:");
			a[i] = ler.nextInt();
			soma = soma + a[i];
			if (a[i] > 10) {
				aprov = aprov + 1;
			}
			if (a[i] > 16 && a[i] < 21) {
				merito = merito + 1;
			}
			media = soma / 30;
			perc = (aprov * 100) / 30;
		}
		System.out.println("A media da turma foi de: " + media);
		System.out.println("A percentagem de aprovados foi de: " + perc + "%");
		System.out.println("O numero de alunos de merito foi de: " + merito);
	}
}