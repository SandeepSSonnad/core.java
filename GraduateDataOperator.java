class GraduateDataOperator{
	
	static String[] GraduateDataOperator={null,null,null,null,null};
	static int position=0;
	
	static void save(String name){
		System.out.println("Execution start aytu");
		
		GraduateDataOperator[position]=name;
		
		System.out.println("Graduate's Data="+position+" "+GraduateDataOperator[position]);
		position++;
		
		System.out.println("Execution mugitu");
	}
	
		static void displayDetails()
		{
			for(int i=0;i<GraduateDataOperator.length;i++)
		    {
			System.out.println("Graduate's Data="+GraduateDataOperator[i]);
			
		    }
		}
		
			
}