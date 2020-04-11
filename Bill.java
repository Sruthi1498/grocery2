
package grocery;

import java.util.*;

public class Buy {
    double total = 0.00;
        double pri=0;
    
             Scanner s = new Scanner(System.in);
             
      System.out.println("ënter the no of item u want to buy");
      int length = s.nextInt();
      int [] myArray = new int[length];
      System.out.println("Enter the elements of the array:");

      for(int i=0; i<length; i++ ) {
         myArray[i] = s.nextInt();
      }

      for (int i=0; i<length ; i++) {
    
       
        
       
        System.out.println("*************** GROCERY BILL ***************");

        System.out.println("***** ITEM NAME ***** ITEM PRICE ***** QUANTITY ***** ");

        for (Item item : items) {
            pri=item.quan*item.price;
            System.out.printf("        %s              %.2f              %.2f        \n", item.Name, item.price,pri);
             
            total += pri;
        }

        System.out.println("****************************************************");
        System.out.println("Total :" + total);
    }
}

    
    
}
