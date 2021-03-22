import java.util.Scanner;

public class Ex2
{
	public static void main(String[] args)
	{
		Scanner ler = new Scanner(System.in);
		int media;
		int i;
		int soma=0;
		int[] array = {23, 6, 47, 35, 2, 14};
		for(i=0; i<array.length; i++){
			soma=soma+array[i];
		}
		media=(soma/array.length);
		System.out.println("A media dos valores inseridos e: "+media);
	}
}