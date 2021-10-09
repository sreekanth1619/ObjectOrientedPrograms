package stockmarket;
import java.util.Scanner;

public class StockAccountMain {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    String[] ListOfHoldings=  {"tata"};
    String[] ListOfHoldings1= {"reliance"};
    String[] ListOfHoldings2= {"wipro"};
	
	System.out.println("enter the StockName");
    String name=sc.nextLine();
	
	System.out.println("enter the number of stocks");
	int num=sc.nextInt();
	System.out.println("enter the share price");
	int price=sc.nextInt();
	
	StockAccount stockobj=new StockAccount();
	stockobj.StockAccountHolderName("Sreekanth");
	stockobj.AvailableBalance(1000);	
	stockobj.withdraw(200);
	int ans=stockobj.AvailableBalance(1000)-stockobj.withdraw(200);
	
    int a=stockobj.AvailableBalance(1000);
    int b=stockobj.withdraw(200);
			
	int Totalvalue= num * price;
	
	if (a<b) {
    	System.out.println("limit exceeds");
    }else {
    	System.out.println(ans);	
    }
	if(name.contentEquals(ListOfHoldings[0])) {
		
	    System.out.println(name+ ":"+ " the total value of the Stock is:" +Totalvalue);		
	}else if(name.contentEquals(ListOfHoldings1[0])) {
		
		System.out.println(name+ " the total value of the Stock is:" +Totalvalue);
	
	}else if(name.contentEquals(ListOfHoldings2[0])) {
		
	    System.out.println(name+" the total value of the Stock is:" +Totalvalue);
	}else {
		System.out.println("invalid stock");
	}
	sc.close();
}

}


