import java.util.HashMap;

public class Purchasing {
// Using the HashMap is two  Different datatypes  stores and access in a Single varaible
    public HashMap<String, Double> purchase = new HashMap<String, Double>();
   

    public void purchasetheBook(String BookName, double BookPrice ) {
        purchase.put(BookName, BookPrice);
      
        System.out.println("Product bought: " + BookName);
    }

    public void canceltheBook(String BookName) {
    	
        if (purchase.containsKey(BookName)) {
 //HashMap <containsKey> is used to check the argument(prodeuctName)is in the Map or Not
            purchase.remove(BookName);
 //HashMap<remove> Remove the key from the Map            
            System.out.println("Book canceled: " + BookName);
        } else {
            System.out.println("Book not found");
        }
        
    }
    public void Bill(String BookName,double BookPrice) {
    	if(purchase.containsKey(BookName)){
    		System.out.println("Book Name : "+BookName);
    		
    	}
    	else {
    		System.out.println("Invalid error");
    	}
     	if(purchase.containsValue(BookPrice)) {
    		System.out.println("BookPrice : "+BookPrice);
    	}
    	else {
    		System.out.println("errror in priceList");
    	}
    	
    	if(BookPrice>0) {
    		double Gst=13.637;
    		double TotalAmount=BookPrice+Gst;
    		System.out.println("Total Amount : "+TotalAmount + " Gst is Included");    		
    		
    	}
    	else {
    		System.out.println("Invalid Purchase");
    	}
    	if(BookPrice>500) {
    		System.out.println("You Got Special Redemed code -- RBSP102004 and use this redeemed code to get 15 to 20 percentage discount for next Purchase");
    	}
    	else {
    		 System.out.println("--------------Thank you for Visiting us-------------");
    		
    	}
    	 System.out.println("--------------Thank you for Visiting us-------------");
    }
    

	
	}

	

	

    
