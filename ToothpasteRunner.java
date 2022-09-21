class ToothpasteRunner{
	
	public static void main(String[] brush){
		
	    Toothpaste.properties();
		// init values
		  System.out.println("Init The Values");
		Toothpaste.setBrand("DantaKanti");
		Toothpaste.setManufactureYear(2022);
		Toothpaste.setExpiryYear(2023);
		Toothpaste.setColour("Brown");
		Toothpaste.setSize('M');
		Toothpaste.setSalt("Black Salt");
		Toothpaste.setType("Neam With Salt");
		Toothpaste.setQuantity(250);
		Toothpaste.setSafetyForChildren(true);
		Toothpaste.setPrice(230);
		Toothpaste.setFlavour("Strawberry");
		Toothpaste.setSolvent("Soluble In Water");
		Toothpaste.setAcid(false);
		Toothpaste.setBase(true);
		Toothpaste.setChemical("Fluoride");
		
		String ref1=Toothpaste.getBrand();
		 System.out.println("Brand="+ref1);
		
		 int ref2=Toothpaste.getManufactureYear();
		 System.out.println("Manufacturing Year="+ref2);
		 
		 int ref3=Toothpaste.getExpiryYear();
		 System.out.println("Expiry Year="+ref3);
		 
		 String ref4=Toothpaste.getColour();
		 System.out.println("Colour="+ref4);
		 
		 char ref5=Toothpaste.getSize();
		 System.out.println("Size of Paste="+ref5);
		 
		 String ref6=Toothpaste.getSalt();
		 System.out.println("Nim ToothPaste Alli ero Salt="+ref6);
		 
		 String ref7=Toothpaste.getType();
		 System.out.println("Type of Paste="+ref7);
		 
		 int ref8=Toothpaste.getQuantity();
		 System.out.println("Quantity="+ref8);
		 
		 boolean ref9=Toothpaste.isSafetyForChildren();
		 System.out.println("SafetyForChildren="+ref9);
		 
		 int ref10=Toothpaste.getPrice();
		 System.out.println("Price="+ref10);
		 
		 String ref11=Toothpaste.getFlavour();
		 System.out.println("Flavour="+ref11);
		 
		 String ref12=Toothpaste.getSolvent();
		 System.out.println("Solvent="+ref12);
		 
		 boolean ref13=Toothpaste.isAcid();
		 System.out.println("Acid="+ref13);
		 
		 boolean ref14=Toothpaste.isBase();
		 System.out.println("Base="+ref14);
		 
		 String ref15=Toothpaste.getChemical();
		 System.out.println("Chemical="+ref15);
		 
		
		
		
	}
}