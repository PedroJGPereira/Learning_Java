public class Switch {
    
    public static void main(String args[]) {

        int diaSemana = 1; // 0 corresponde a Domingo
        
        /*
        if (diaSemana == 0) 
        {
            System.out.println("Domingo");
        } else if (diaSemana == 1) {
            System.out.println("Segunda");   
        } else if (diaSemana == 2) {
            System.out.println("Terça");   
        }*/
        
        /*
        if (diaSemana == 0 || diaSemana == 6)
            System.out.println("Fim de semana");
        else if (diaSemana > 0 && diaSemana < 6 )
            System.out.println("Dia de semana");
        else 
            System.out.println("Erro");
    
    
        switch (diaSemana) 
        {
            case 0: 
            case 6:
                System.out.println("Fim de semana");
                break;

            case 1:
            case 2: 
            case 3:
            case 4:
            case 5:
                System.out.println("Dia de semana");
                break;
                
            default:
                System.out.println("Erro");

        }
        */
        
        String nomeDia = "segunda";
        
        switch (nomeDia)
        {
            case "segunda":
                System.out.println(1);
                break;
                
            default:
                System.out.println("Erro");

        }
        
    }
}