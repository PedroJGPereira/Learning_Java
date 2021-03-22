import java.util.Scanner;

public class Ex3 {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner (System.in);
        double soma = 0;
        int totalNumPositivos = 0;

        for (int i=0; i<10; i=i+1)
        {
            System.out.println("Introduza um numero");
            double num = scanner.nextDouble();
        
        if (num >0) {

            soma = soma + num;
            totalNumPositivos++;
        }
     
    }

    double media = soma / totalNumPositivos;
    System.out.println("Media:" +media);

}
}