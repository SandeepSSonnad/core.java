class BillionairesDataRunner{

  public static void main(String[] args){
	  
	BillionairesData.save("Elon Musk");
	BillionairesData.save("Gautam Adani");
    BillionairesData.save("Jeff Bezos");
	BillionairesData.save("Bernard Arnault");
	BillionairesData.save("Bill Gates");
	BillionairesData.save("Warren Buffett");
	BillionairesData.save("Mukesh Ambani");
	BillionairesData.save("Ratan TATA");
    BillionairesData.save("Anand Mahindra");
	BillionairesData.save("Kumar Mangalam Birla");
	BillionairesData.save("Rakesh jhunjhunwala ");
	BillionairesData.displayDetails();
	BillionairesData.find("Ratan TATA");
	BillionairesData.update("Kumar Mangalam Birla","Aman Gupta");
	BillionairesData.displayDetails();
	BillionairesData.update(3,"Narayan Murthy");
	BillionairesData.displayDetails();
	BillionairesData.delete("Jeff Bezos");
	BillionairesData.displayDetails();
	BillionairesData.delete(0,"Elon Musk");
	BillionairesData.displayDetails();
	  
	  
  }








}