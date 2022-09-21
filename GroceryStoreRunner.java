class GroceryStoreRunner{
	
  public static void main(String[] compounding){
	  
	  GroceryStore.displayDetails();
	   System.out.println("Init Values");
	  GroceryStore.setStoreName("DMart");
	  GroceryStore.setCompany("WalMart");
	  GroceryStore.setOwnerName("R K Damani");
	  GroceryStore.setShareValue(4300);
	  GroceryStore.setGoodBalanceSheet(true);
	  GroceryStore.setSales("Increses");
	  GroceryStore.setProfit(2000000000);
	  GroceryStore.setDebt("Decreses");
	  GroceryStore.setType("GroceryStore");
	  GroceryStore.setNoOfStores(5000);
	  GroceryStore.setYearReturn(0.35);
	  GroceryStore.setCompetitor("SmartBazaar");
	  GroceryStore.setRightToInvest(true);
	  GroceryStore.setInvestingPlatform("Zerodha");
	  
	  String ref1=GroceryStore.getStoreName();
	   System.out.println("Store Name="+ref1);
	   
	   String ref2=GroceryStore.getCompany();
	   System.out.println("Company Name="+ref2);
	   
	   String ref3=GroceryStore.getOwnerName();
	   System.out.println("Owner Name="+ref3);
	   
	   int ref4=GroceryStore.getShareValue();
	   System.out.println("Share value="+ref4);
	   
	   boolean ref5=GroceryStore.isGoodBalanceSheet();
	   System.out.println("Healthy Balance Sheet="+ref5);
	   
	   String ref6=GroceryStore.getSales();
	   System.out.println("Sales="+ref6);
	   
	   int ref7=GroceryStore.getProfit();
	   System.out.println("Net Profit="+ref7);
	   
	   String ref8=GroceryStore.getDebt();
	   System.out.println("DebtToEquity="+ref8);
	   
	   String ref9=GroceryStore.getType();
	   System.out.println("Type="+ref9);
	   
	   int ref10=GroceryStore.getNoOfStores();
	   System.out.println("Number of Stores="+ref10);
	   
	   double ref11=GroceryStore.getYearReturn();
	   System.out.println("YearReturn="+ref11);
	   
	   String ref12=GroceryStore.getCompetitor();
	   System.out.println("Competitor="+ref12);
	   
	   boolean ref13=GroceryStore.isRightToInvest();
	   System.out.println("RightToInvest="+ref13);
	   
	   String ref14=GroceryStore.getInvestingPlatform();
	   System.out.println("InvestingPlatform="+ref14);
	   
  }
}