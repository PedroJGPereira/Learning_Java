/*

Ficha TP1 - Exe.3

*/

import java.util.Scanner;


public class FichaTP1_Exerc3 {

    public static void main(String[] args){
        
        Scanner ler = new Scanner(System.in);

        System.out.println("polegadas ?");
        float polegadas = ler.nextFloat();

        double centimetros = polegadas*2.54;

        System.out.println("Centimetros:" + centimetros);

    }
}