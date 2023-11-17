import java.util.HashMap;
import java.util.Scanner;
public class Deliver {
    static HashMap<String, String> admin = new HashMap<String,String>();
    static Scanner sc = new Scanner(System.in);
    static Purchasing pur = new Purchasing();
    static Deliver Del=new Deliver();
    


    public static void main(String[] args) {
        admin.put("RBSP", "2004");
    	
        boolean status = false;
        while (!status) {
            displayMenu();
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    login();
                    break;
                case 2:
                    purchasetheBook();
                    break;
                case 3:
                    canceltheBook();
                    break;
                case 4:
                	Bill();
                	break; 
                case 5:
                    logout(choice);
                    break;
                case 6:
                    status = true;
                    break;
                default:
                    System.out.println("Invalid choice");
                    System.out.println("-----------------Thank you for Visiting us----------------");

            }
        }
    }

             static void displayMenu() {
            	 System.out.println(" ");
            	 
        System.out.println("------------------Welcome to RBSP Book Store--------------- ");
        System.out.println("1. Log in");
        System.out.println("2. Purchase the Book");
        System.out.println("3. Cancel the Purchase");
        System.out.println("4. Bill Generator");
        System.out.println("5. Signed Out");
        System.out.println(" ");
        System.out.print("Enter your choice: ");
      
        
    }

           static void login() {
        	   System.out.print("Enter username: ");
               String username = sc.next();
               System.out.print("Enter password: ");
               int password=sc.nextInt();
               if (admin.containsKey(username)) {
                   admin.get(username);
               
        
        System.out.println("Login successful");
               }
        else {
        	System.out.println("Invalid username or password");
        }
     //   System.out.println("--------------Thank you for Visiting us-------------");

           }
   
        public static void purchasetheBook() {
        	  int loginUser=0;
              if (loginUser == 0) {
            	   System.out.print("Enter Book name: ");
                   String BookName = sc.next();
                   System.out.print("Enter Book price: ");
                   double BookPrice = sc.nextDouble();
                   pur. purchasetheBook(BookName,BookPrice);
             
              } 
              else {
                  System.out.println("You need to log in first");
              }
              System.out.println("--------------Thank you for Visiting us----------------");

          }

                static void canceltheBook() {
            int loginUser=0;
            if (loginUser == 0) {
                System.out.print("Enter Book name: ");
                String BookName = sc.next();
                pur.canceltheBook(BookName);
            } else {
                System.out.println("You need to log in first");
            }
            System.out.println("--------------Thank you for Visiting us----------------");

        }
                static void Bill() {
                	int loginUser=0;
                	if(loginUser==0) {
                    System.out.print("Enter Book name: ");
                    String BookName = sc.next();
                    System.out.println(" ");
                    System.out.print("Enter Book price: ");
                    double BookPrice = sc.nextDouble();
                	
                	pur.Bill(BookName,BookPrice);
                }
                	else {
                		 System.out.println(" Bill Cannot Be Generated ");
                       
                	}
                }
                
               static void logout(int password) {
                
            System.out.println("Logged out");
             
            System.out.println("--------------Thank you for Visiting us----------------");
         	  
        }
               
    }
