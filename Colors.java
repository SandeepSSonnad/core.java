class Colors{
	
	static String[] colorNames={null,null,null,null,null,null,null};
	static int position=0;
	
	static void save(String names)
	{
		
		if(names!=null && names.length()>3)
		{
			if(position>=7)
	    {
		System.err.println("Array length is Exceed");
		return;
	    }
		colorNames[position]=names;
		System.out.println("Color Name:"+position+"is"+colorNames[position]);
		position++;
		} else{
			System.err.println("It is not a Valid Color Name");
		}
	}
	static void displayDetails()
	{
		for(int i=0;i<colorNames.length;i++)
		{
			System.out.println("Color Names Are:"+colorNames[i]);
		}
	}
	static boolean findColorName(String find)
	{
		for(int index=0;index<colorNames.length;index++)
	  {
		if(colorNames[index]==find)
		{
			System.out.println("Color Name is Found="+find);
			return true;
		}
	  }
	  return false;
	}
	 
	
	
}