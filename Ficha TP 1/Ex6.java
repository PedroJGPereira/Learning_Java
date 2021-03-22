import java.util.Scanner;
public class Ex6
{
	public static void main( String[] args)
	{
		int x, h, m;
		Scanner ler=new Scanner(System.in);
		System.out.println("Escreva o numero de minutos decorridos desde o inicio do dia: ");
		x=ler.nextInt();
		h=(x/60);
		m=(x%60);
		System.out.println("Desde o inicio do dia passaram "+h+" horas e "+m+" minutos.");
	}
}