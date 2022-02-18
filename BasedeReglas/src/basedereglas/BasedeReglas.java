
package basedereglas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author norah
 */
public class BasedeReglas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner a = new Scanner (System.in);
        
        List <String> estimaMaria = new ArrayList<>();
        estimaMaria.add("pedro");
        estimaMaria.add("luis");
        estimaMaria.add("mateo");
        estimaMaria.add("juan");
        estimaMaria.add("ana");
        
        int mariaEstima = Integer.parseInt(a.nextLine());
        
        System.out.println("OPCION 1: ¿Quienes estima Maria? escriba número 1: ");
        System.out.println("OPCION 2: ¿Quienes no estima Maria porque no saben bailar? escriba número 2: ");
        
        switch(mariaEstima){
        
            
            case 1:
                System.out.println("Maria estima a los hombres que saben Bailar " + "\n"
                        + estimaMaria.get(0) + "\n" 
                        + estimaMaria.get(1));
                break;
                
            case 2:
                System.out.println("Maria no estima a las personas que no saben Bailar como: " + "\n"
                        + estimaMaria.get(2) + "\n" 
                        + estimaMaria.get(3) + "\n" 
                        + estimaMaria.get(4) + "\n");
                break;
                
        };
        
    }
    
}
