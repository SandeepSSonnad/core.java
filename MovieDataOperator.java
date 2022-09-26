class MovieDataOperator{
	
	static String[] movieData={null,null,null,null,null};
	static int position=0;
	
	static void save(String name){
		System.out.println("Execution start aytu");
		
		movieData[position]=name;
		
		System.out.println("Movie Name"+position+" "+movieData[position]);
		position++;
		
		System.out.println("Execution mugitu");
	}
	
		static void displayDetails()
		{
			for(int i=0;i<movieData.length;i++)
		    {
			System.out.println("Movies Names as="+movieData[i]);
			
		    }
		}
		
			
		
		
		
		
	
	
	
	
}