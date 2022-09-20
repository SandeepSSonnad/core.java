class Card{
	
	static String type;
	static int heightInInch;
	static double width;
	static int price;
	static String colors[];
	
	static void displayDetails(){
	
	  System.out.println(type);
	  System.out.println(heightInInch);
	  System.out.println(width);
	  System.out.println(price);
	  if(colors!=null){
		  for(int i=0;i<colors.length;i++){
			  String ref=colors[i];
			 System.out.println(ref); 
		    } 
	    }
		  else
		  {
			  System.out.println("No Colours");
		    }
		  
	    
	}
	
	
	
	
	
	
	
}