import java.util.Scanner;
public class Ex1
{
	public static void main( String[] args)
	{
		//Declaração das variáveis.
		double testetotal, nota, exame, notafinal;
		int teste1, teste2, teste3, projeto;
		Scanner ler=new Scanner(System.in);
		
		//Pedir as notas dos mini testes ao utilizador e respetivo cálculo da média.
		System.out.println("Indique a nota do seu primeiro mini teste.");
		teste1=ler.nextInt();
		System.out.println("Indique a nota do seu segundo mini teste.");
		teste2=ler.nextInt();
		System.out.println("Indique a nota do seu terceiro mini teste.");
		teste3=ler.nextInt();
		testetotal=(teste1+teste2+teste3)/3;
		
		//Pedir a nota do projeto ao utilizador.
		System.out.println("Indique a nota do seu projeto.");
		projeto=ler.nextInt();
		
		//Verificação se o utilizador tem de ir a exame.
		if((testetotal<8) && (projeto>=9.5)){
			System.out.println("Admitido. Exame.");
		}	
		if(projeto<9.5){
			System.out.println("Não admitido.");
		}
		
		//Cálculo da nota final.
		nota=(0.65*testetotal)+(0.35*projeto);
		if((testetotal>=8) && (projeto>=9.5)){
			if(nota>=9.5){
				System.out.println("Admitido.");
			}else{
				System.out.println("Exame.");		
			}
		}
		
		//Cálculo da nota depois do exame de recurso.
		if(nota<9.5){
			System.out.println("Indique a nota obtida no exame.");
			exame=ler.nextDouble();
			notafinal=(0.65*exame)+(0.35*projeto);
			if(notafinal>=9.5){
				System.out.println("Aprovado.");
			}else{
				System.out.println("Reprovado.");
			}
		}
	}	
}