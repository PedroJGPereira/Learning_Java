import java.util.Scanner;

public class Ex4 {
    
    public static void main(String[] args) {
        
        System.out.println("\n Ex3 PL2\n");
    
        Scanner teclado = new Scanner (System.in);
        
        int i = 0;
        int pos = 0;
        double num = 0;

        do {

            System.out.println("Insira um numero inteiro:");
            num= teclado.nextInt();
            i++;

            if (num > 0)
                pos = pos + 1;
            
            if (num == 0)
                i--;
            
        } while (num !=0);

    float perPos = (pos* 100)/i;

System.out.println("Percentagem de pos:" + perPos + "%");
    

    }

}

