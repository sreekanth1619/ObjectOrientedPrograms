package stockmarket;

public class StockAccount {
 
public void StockAccountHolderName(String name){
System.out.println("the stockholder name:"+name);	
   }
   public int AvailableBalance(int a) {
	 System.out.println("the available balance is:"+a);
	return a;  
   } 
   public int withdraw(int b) {
	  System.out.println("withdraw the balance is:"+b); 
	  return b;
   }
	public void buy(Object string,String Symbol) {
	System.out.println("amount -"+string + "Symbol -" +Symbol);	
	}
	
	static void sell(int amount,String Symbol)	{
	System.out.println("amount - "+amount + "Symbol"+Symbol);
	}
	String save() {
	String StockAccount = null;
	return StockAccount;	
	}
	void voidprintreport(){
		
}
}

