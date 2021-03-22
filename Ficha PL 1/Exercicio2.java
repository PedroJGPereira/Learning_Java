
import java.util.Scanner;
	public class Exercicio2 
{
	public static void main ( String[] args )
	{
		double catA, catB, hipo, perimetro, area;
	
	Scanner ler=new Scanner(System.in);
	
	System.out.print("Digite a medida A:");
		catA=ler.nextDouble();
	
	System.out.print("Digite a medida B:");
		catB=ler.nextDouble();
		hipo=Math.sqrt((catA*catA) + (catB*catB)); 
	
	System.out.println("O valor da hipotenusa e:" +hipo);
		perimetro= catA + catB + hipo;
	
	System.out.println("O valor do perimetro e:" +perimetro);
		area= (catA*catB)/2.0;
	
	System.out.println("O valor da area e:" +area);
	}
}
