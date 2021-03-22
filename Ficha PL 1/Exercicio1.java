import java.util.Scanner;

public class Exercicio1
{ 

public static void main ( String[] args )
	{
		double nota1, nota2, nota3, mediaex, mediaaprov;
		Scanner ler=new Scanner(System.in);
		 System.out.print("Digite a primeira nota:");
		 nota1=ler.nextDouble();
		 System.out.print("Digite a segunda nota:");
		 nota2=ler.nextDouble();
		 System.out.print("Digite a terceira nota:");
		 nota3=ler.nextDouble();
		 System.out.print("Digite a média de exercícios");
		 mediaex=ler.nextDouble();
		 
		mediaaprov = (nota1 + nota2*2 + nota3*3 + mediaex) /7.0;
		System.out.print("Media de Aproveitamento:" +mediaaprov);
	}
}
