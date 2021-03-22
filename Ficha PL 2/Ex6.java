import java.util.Scanner;
public class Ex6
{
	public static void main( String[] args)
	{
		int numero, check, i;
		Scanner ler=new Scanner(System.in);
	
		System.out.println("Escreva um número.");
		numero=ler.nextInt();
		
	    check=numero/2;
		
		if(numero==0 && numero==1){
			System.out.println("Não se trata de um número primo.");
		
			for(i=2; i<=check; i++){
			if(numero%i==0){
				System.out.println("Não se trata de um número primo.");
			}
		}
		}else{
			System.out.println("Trata-se de um número primo.");
		}
	}
}