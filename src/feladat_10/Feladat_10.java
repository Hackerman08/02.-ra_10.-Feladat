
package feladat_10;

import java.util.Scanner;


public class Feladat_10 {

    public static void main(String[] args) {
       int szam =0;
       int add = 0;
       int oddNumbers = 0;
       int evenNumbers = 0;
       int oszzes=0;
      
        Scanner input = new Scanner(System.in);
        
        
        System.out.println("Kérem adja meg a kezdö számot(0-100):");
       szam= input.nextInt();
        if(szam>100){
            System.out.println("Hiba tul nagy szám");
            
        }else{
           for (int i = szam;i <=100; ) {
            System.out.println("Kérem adja meg a következö számót: ");
            add= input.nextInt();
            i+=add;
            oszzes+=add;
            oszzes+=szam;
            
            if(add % 2 == 1){
            oddNumbers++;
            } else if(add % 2 == 0){
            evenNumbers++;
            }
           
            
                 
            }
        
        }
        
        
      
            System.out.println("Összes: "+oszzes);
            System.out.println("Páratlan: "+oddNumbers);
            System.out.println("Páros: "+evenNumbers);  
            
    }
    
}
