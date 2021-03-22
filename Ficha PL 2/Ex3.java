import java.util.Scanner;

public class Ex3 {
  
   public static void main(String[] args) {
       
        Scanner ler=new Scanner (System.in);
        int x, max=0, min=0;

        for (int i=1; i<=10; i=i+1)
        {
            System.out.println("Indique um valor inteiro");
            x=ler.nextInt();
        
        if (i==1)
        {
            max=x;
            min=x;
        }
        else
        if (x> max)
            max=x;
        else if (x<min)
                min=x;
    
    }
    System.out.println("Maximo:"+max);
    System.out.println("Minimo:"+min);

   }
        












}




