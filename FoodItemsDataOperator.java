class FoodItemsDataOperator{
	
	static String[] FoodItemsDataOperator={null,null,null,null,null};
	static int position=0;
	
	static void save(String name){
		System.out.println("Execution start aytu");
		
		FoodItemsDataOperator[position]=name;
		
		System.out.println("Food Items No="+position+" "+FoodItemsDataOperator[position]);
		position++;
		
		System.out.println("Execution mugitu");
	}
	
		static void displayDetails()
		{
			for(int i=0;i<FoodItemsDataOperator.length;i++)
		    {
			System.out.println("Food Items as="+FoodItemsDataOperator[i]);
			
		    }
		}
		
			
		
	
	
}