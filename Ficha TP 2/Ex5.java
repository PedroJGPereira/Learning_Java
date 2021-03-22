import java.util.Scanner;

public class Ex5 {
   
    public static void main(String[] args) {
        


    Scanner.out.print("Insira o seu salário bruto:");

    int sal = ler.nextInt();
    double irs = 0;
    double salliq = 0;

    if (sal<500) {

        irs = sal - (sal * 0.10);
        salliq = sal - irs; }
    
    else if (sal >= 500 && sal< 1001){

         irs = sal - (sal * 0.20);
        salliq = sal - irs; }
    
    else if (sal >= 1001 && sal< 3001){

        irs = sal - (sal * 0.30);
        salliq = sal - irs; }
    
    else if (sal >= 3001 && sal< 5001){

          irs = sal - (sal * 0.40);
          salliq = sal - irs; }
    
    else if (sal 5001){

         irs = sal - (sal * 0.50);
         salliq = sal - irs; }
    
    System.out.println("O vencimento bruto é de:" + sal);
    System.out.println("A retencao de irs:" + irs);
    System.out.println("O vencimento liquido é de:" + salliq);
    x++;


    }

}
