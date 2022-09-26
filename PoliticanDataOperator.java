class PoliticanDataOperator{
	
	
	static String[] PoliticanData={null,null,null,null,null};
	static int position=0;
	
	static void save(String name){
		System.out.println("Execution start aytu");
		
		PoliticanData[position]=name;
		
		System.out.println("Politican Name"+position+" "+PoliticanData[position]);
		position++;
		
		System.out.println("Execution mugitu");
	}
	
		static void displayDetails()
		{
			for(int i=0;i<PoliticanData.length;i++)
		    {
			System.out.println("Politican's Name="+PoliticanData[i]);
			
		    }
		}
		
			
		
		
		
		
	
	
	
	

}

