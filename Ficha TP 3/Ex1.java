
import java.util.Scanner;

public class Ex1 
{
	public static void main(String[] args)
	{
		Scanner ler=new Scanner(System.in);
		int i;
		int p;
		int a[]=new int[20];
		
		for(i=0; i<20; i++){
			System.out.println("Introduza a classificaçao do aluno: ");
			a[i]=ler.nextInt();
		}
		
		for(i=0; i<20; i++){
			if(a[i]<0){
				System.out.println("ERRO");
			}
			if(a[i]<10){
				System.out.println("F");
			}
			if(a[i]>=10 && a[i]<=11){
				System.out.println("E");
			}
			if(a[i]>=12 && a[i]<=13){
				System.out.println("D");
			}
			if(a[i]>=14 && a[i]<=15){
				System.out.println("C");
			}
			if(a[i]>=16 && a[i]<=17){
				System.out.println("B");
			}
			if(a[i]>=18 && a[i]<=20){
				System.out.println("A");
			}
			if(a[i]>20){
				System.out.println("ERRO");
			}
		}
	}
}