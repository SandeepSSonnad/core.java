class BillionairesData{
	
	static String[] billionaires={null,null,null,null,null,null,null,null,null,null};
	static int position=0;
	
	static void save(String name)
	{
		if(name!=null && name.length()>3)
		{
			if(position>=10)
			{
				System.out.println("Array Length is Exceded");
				return;
			}
			billionaires[position]=name;
	System.out.println("Billionaires Names As Follow="+position+" "+billionaires[position]);
	      position++;
		}
		else
		{
			System.out.println("Billionaires Name is not valid");
		}
	}
	  static void displayDetails()
	  {
	  
	  for(int i=0;i<billionaires.length;i++)
	     {
		  System.out.println("Displaying Names:"+billionaires[i]);
	     }
	  }
	 
	static boolean find(String billionaire)
	{
		for(int i=0;i<billionaires.length;i++)
		{
			String ref=billionaires[i];
			if(ref==billionaire)
			{
			  System.out.println("Billionaires Name Is Found:"+billionaire);
              return true;			  
			}
		}
		return false;
	}
	static String update(String oldBillionaire, String newBillionaire)
	{
		System.out.println("Update Start Aytu");
		if(oldBillionaire!=null && newBillionaire!=null)
		{
			if(oldBillionaire.length()>3 && newBillionaire.length()>3)
			{
				System.out.println("Name is Valid for Update");
				for(int index=0;index<billionaires.length;index++)
				{
					String data=billionaires[index];
					if(oldBillionaire==data)
					{
						System.out.println("Name Updated:"+data+":with :"+newBillionaire);
						billionaires[index]=newBillionaire;
					}
				}
			}
		}else
		     {
			System.out.println("Name is not valid It cannot update");
		     }
			 return newBillionaire;
	}
	static String update(int index,String newBillionaire) 
	{
		
		if(newBillionaire!=null)
		{
		 System.out.println("Updating Names Through Index");
		     if(index<10)
		     {
				 String data=billionaires[index];
			   System.out.println("New Billionaire Name at Index:"+index+" is "+newBillionaire);
			   billionaires[index]=newBillionaire;
		     }else
			 {
				 System.out.println("Not a Valid Index");
			 }
		}
		return newBillionaire;	
	}
	static boolean delete(String billionaire)
	{
		if(billionaire!=null && billionaire.length()>3)
		{
			System.out.println("Deleting The Name Of Billionaire");
			for(int data=0;data<billionaires.length;data++)
			{
				String ref=billionaires[data];
			if(billionaire==ref)
			 {
				System.out.println("Net Worth is Decreses That why i'm Deleting:"+ref+"At index "+data);
				billionaires[data]=null;
				return true;
			 }
			}
			
		}
		else
		       {
				System.out.println("Not Valid Data");
				return false;
			   }
			   return true;
	}
	static boolean delete(int index,String billionaire)
	{
		if(billionaire!=null)
		{
		  System.out.println("Condition is True for Erasing");
		  String ref=billionaires[index];
		 if(index<10 && ref==billionaire)
		   {
			
			System.out.println("Deleting Name:"+ref+" Through Index is:"+index);
			billionaires[index]=null;
			return true;
		   }else
		      {
			   System.out.println("Name is not in Billionaire List");
			   return false;
		      }
		}else
		{
			System.out.println("It is As Null Element");
		}
		return false;
	}
	
}