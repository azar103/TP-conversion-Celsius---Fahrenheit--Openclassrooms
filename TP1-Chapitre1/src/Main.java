import java.util.Scanner;


public class Main {

    /**
     * @param args
     */
    public static void main( String[] args ) {
        double faren = 0,cels = 0;
        int mode=0;
        char reponse = ' ';
        Scanner sc = new Scanner( System.in );
        System.out.println("CONVERTISSEUR degr�s CELSIUS et degr�s FAHRENHEIT");
        System.out.println("--------------------------------------------------");
        do
        {//tant que reponse = O on refait la  boucle//boucle principale
            
        do
        {//tant que le mode n'est pas 1 ou 2 on refait la boucle
         System.out.println("Chosisissez le mode de conversion :");   
         System.out.println("1 - Convertisseur Celsius - Fahrenheit");
         System.out.println("2 - Convertisseur Fahrenheit - Celsius");
     
         mode = sc.nextInt();
         
           switch(mode)
           {
             case 1://convertir la temperature de celcius � fahrenheit
                 System.out.println("Temp�rature � convertir ");
                 cels = sc.nextDouble();
                 faren = (1.8 * cels) + 32;
                 System.out.println(cels+" �C correspond � "+arrondi(faren,2)+" �F");
                 break;
             case 2://convertir la temperature de fahrenheit � celcius
                 System.out.println("Temp�rature � convertir ");
                 faren = sc.nextDouble();
                 cels = ((faren - 32) * 5) / 9;
                 System.out.println(faren+" �F correspond � "+arrondi(cels,2)+" �C");
                 break;
              
                 
           }
           if(mode != 1 && mode!= 2)
               System.out.println("mode inconnu");
        }while(mode!=1 && mode!=2);
           sc.nextLine();
           do
           {
              System.out.println("Souhaitez-vous convertir une autre temp�rature ?(O/N)");
              reponse = sc.nextLine().charAt( 0 );
           }while(reponse != 'O' && reponse !='N');
           
  
        
    }while(reponse == 'O');
        System.out.println("Au revoir..."); 
    }
    public static double arrondi(double A, int B){
        return (double)((int)(A * Math.pow(10, B)+ .5))/Math.pow(10, B);
    }

}
