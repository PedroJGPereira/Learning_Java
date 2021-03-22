import java.util.Scanner;

public class Ex2 {
    
    public static void main(String[] args) {
        
        Scanner read = new Scanner (System.in);

        int c1, c2, h, sc;

        System.out.println("cateto 1:");
        c1 = read.nextInt();

        System.out.println("cateto 2:");
        c2 = read.nextInt();

        System.out.println("hipotenusa:");
        h = read.nextInt();
   
     if ((c1 + c2) < h) {

        System.out.println("Nao e um triangulo"); }

     else {

        if ((c1 * c1 + c2 * c2) == (h * h)) {

            System.out.println("E um triangulo retangulo");
        }
     else {

        System.out.println("Nao e um triangulo");
     }

    }
}

}
