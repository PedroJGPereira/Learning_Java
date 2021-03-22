import java.util.Scanner;
public class Ex2
{
	public static void main( String[] args)
	{
		int ano, mes, dia;
		Scanner ler=new Scanner(System.in);
		
		System.out.println("Indique o dia em que se encontra.");
		dia=ler.nextInt();
		System.out.println("Indique o mês em que se encontra.");
		mes=ler.nextInt();
		System.out.println("Indique o ano em que se encontra.");
		ano=ler.nextInt();
		
		
			if(mes==1){
				0<dia<32;
			}
			if(mes==2){
				if(int (ano/4)){0<dia<30;}
				else {0<dia<29;}
			}
			if(mes==3){
				0<dia<32;
			}
			if(mes==4){
				0<dia<31;
			}
			if(mes==5){
				0<dia<32;
			}
			if(mes==6){
				0<dia<31;
			}
			if(mes==7){
				0<dia<32;
			}
			if(mes==8){
				0<dia<32;
			}
			if(mes==9){
				0<dia<31;
			}
			if(mes==10){
				0<dia<32;
			}
			if(mes==11){
				0<dia<31;
			}
			if(mes==12){
				0<dia<32;
			}
	}
}