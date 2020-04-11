package grocery;

import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        Product prod = new Product();
        User user;
        user = new User(101,"sruthi","krithika");
        char choice;
      
        Scanner sc = new Scanner(System.in);
            do {
                System.out.println("1. Display all the items");
                System.out.println("2. Buy items");
                System.out.println("3. Exit");
               
                System.out.println("Choice:");
                choice = sc.nextLine().charAt(0);
                switch (choice) {
                    case '1':
                        prod.getProducts();
                        break;
                        
                    case '2':
                        
                        break;
                        
                    case '3':
                        System.out.println("Thank you!\n");
                        break;
                        
                  
                }
            } while (choice != '3');
        
    }

    
}