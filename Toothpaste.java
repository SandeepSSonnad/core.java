class Toothpaste{
	
	static String brand;
	static int manufactureYear;
	static int expiryYear;
	static String colour;
	static char size;
	static String salt;
	static String type;	//neam,ashvagandaha	
	static int quantity;
	static boolean safetyForChildren;
	static int price;
	static String flavour;
	static String solvent; //soluble in water
	static boolean acid; //false
	static boolean base;//true
	static String chemical;//fluoride
	
	static void setBrand(String value)
	{
		brand=value;
	}
	static void setManufactureYear(int value)
	{
		manufactureYear=value;
	}
	static void setExpiryYear(int value)
	{
		expiryYear=value;
	}
	static void setColour(String value)
	{
		colour=value;
	}
	static void setSize(char value)
	{
		size=value;
	}
	static void setSalt(String value)
	{
		salt=value;
	}
	static void setType(String value)
	{
		type=value;
	}
	static void setQuantity(int value)
	{
		quantity=value;
	}
	static void setSafetyForChildren(boolean value)
	{
		safetyForChildren=value;
	}
	static void setPrice(int value)
	{
		price=value;
	}
	static void setFlavour(String value)
	{
		flavour=value;
	}
	static void setSolvent(String value)
	{
		solvent=value;
	}
	static void setAcid(boolean value)
	{
		acid=value;
	}
	static void setBase(boolean value)
	{
		base=value;
	}
	static void setChemical(String value)
	{
		chemical=value;
	}
	
	
	static String getBrand()
	{
		return brand;
	}
	static int getManufactureYear()
	{
		return manufactureYear;
	}
	static int getExpiryYear()
	{
		return expiryYear;
	}
	static String getColour()
	{
		return colour;
	}
	static char getSize()
	{
		return size;
	}
	static String getSalt()
	{
		return salt;
	}
	static String getType()
	{
		return type;
	}
	static int getQuantity()
	{
		return quantity;
	}
	static boolean isSafetyForChildren()
	{
		return safetyForChildren;
	}
	static int getPrice()
	{
		return price;
	}
	static String getFlavour()
	{
    return flavour;
    }
	static String getSolvent()
	{
		return solvent;
	}
	static boolean isAcid()
	{
		return acid;
	}
	static boolean isBase()
	{
		return base;
	}
	static String getChemical()
	{
		return chemical;
	}
	
	 static void properties(){
		System.out.println(brand);
		System.out.println(manufactureYear);
		System.out.println(expiryYear);
		System.out.println(colour);
		System.out.println(size);
		System.out.println(salt);
		System.out.println(type);
		System.out.println(quantity);
		System.out.println(safetyForChildren);
		System.out.println(price);
		System.out.println(flavour);
		System.out.println(solvent);
		System.out.println(acid);
		System.out.println(base);
		System.out.println(chemical);
	}
}