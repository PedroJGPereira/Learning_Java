import java.util.Scanner;
public class Ex5
{
	public static void main( String[] args)
	{
		double h, m, s, x;
		Scanner ler=new Scanner(System.in);
		System.out.print("Escreva as horas: ");
		h=ler.nextDouble();
		System.out.print("Escreva os minutos: ");
		m=ler.nextDouble();
		System.out.print("Escreva os segundos: ");
		s=ler.nextDouble();
		x=((h*3600)+(m*60)+s);
		System.out.println("Desde o inicio do dia decorreram "+x+" segundos.");
	}
}