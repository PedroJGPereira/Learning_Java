import java.util.Scanner;
public class Ex5
{
	public static void main(String[] args)
	{
		Scanner ler=new Scanner(System.in);
		int n;
		int i;
		double fatorial=1;
		
		System.out.println("Escreva um numero para que seja calculado o seu fatorial.");
		n=ler.nextInt();
		
		if(n==0){
			fatorial=0;
		}
		if(n==1){
			fatorial=1;
		}
		while(n>=1){
			fatorial=fatorial*n;
			n--;
		}
		System.out.println("O fatorial e: "+fatorial);
	}
}