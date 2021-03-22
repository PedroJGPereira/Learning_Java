import java.util.Scanner;
public class FichaTP1_Exerc4
{
	public static void main( String[] args)
	{
		int x, y;
		double z, w;
		Scanner ler=new Scanner(System.in);
		System.out.print("Escreva o preço do produto: ");
		x=ler.nextInt();
		y=x;
		z=x*0.23;
		w=y+z;
		System.out.println("O custo do produto é:"+y);
		System.out.println("O valor do imposto associado é:"+z);
		System.out.println("O valor total a pagar é:"+w);
	}
}


   

        
    
        
 

        
    