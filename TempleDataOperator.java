class TempleDataOperator{
	
	static String[] temple={null,null,null,null,null};
	static int position=0;
	
	
	static void save(String name){
		
		System.out.println("Save Start agide");
		temple[position]=name;	
		
		System.out.println("Temples No "+position+ temple[position]);
		position++;
		
		System.out.println("Save agodu mugitu");
	}
		static void displayDetails(){
		 
		 System.out.println("Display Details");
       for(int index=0;index<temple.length;index++)
	       {
		   System.out.println("Updated Data is="+temple[index]);   
	       }
	    }  
	
	
	
	
}