
import java.util.Scanner;
	public class Exercicio3 
{
	public static void main ( String[] args )
	{
		double tempo, dinheiro;
		
	Scanner ler=new Scanner(System.in);
	
	System.out.println ("Digite o seu tempo:");
		tempo= ler.nextDouble();
		dinheiro= 0.02*tempo;
	
	if (tempo <=60)
	
		System.out.println ("O valor total a pagar e:" +dinheiro);
	else 
		System.out.println ("O valor total a pagar e:" +(dinheiro-0.2) +"euros");
	}
}