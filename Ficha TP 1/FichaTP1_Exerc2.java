/*

Ficha TP1 - exe. 2

*/

import java.util.Scanner;

public class FichaTP1_Exerc2 {

	public static void main ( String[] args){
		
		Scanner ler = new Scanner ( System.in);
		
		System.out.println( "Largura ?");
		int largura = ler.nextInt();
		
		System.out.println( "Altura ?");
		int altura = ler.nextInt();

		float area = largura*altura;
		float perimetro = 2*largura + 2*altura;
		
		System.out.println("Area: "+area+" "perimetro: "+perimetro);




	}

}