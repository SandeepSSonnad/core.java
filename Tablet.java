class Tablet{
	
	static String shape;
	static double weight;
	static int manufactureYear;
	static String colour;
	static int dose;
	static int cost;
	static String intake; //Through water
	static String[] content;
	static String packaging; //plastic
	static String company;
	static int expiryYear;
	static boolean overDose;
	static boolean safetyForChildren;
	static String typeofMedicine;
	static char vitamins;
	static boolean chewable;
	static String toxic;
	
	static void properties(){
		System.out.println(shape);
		System.out.println(weight);
		System.out.println(manufactureYear);
		System.out.println(colour);
		System.out.println(dose);
		System.out.println(cost);
		System.out.println(intake);
		if(content!=null){
		 for(int i=0;i<content.length;i++){
			 System.out.println(content[i]);
		 }
		}else{
			System.out.println("Content Not Disclose");
		}
		System.out.println(packaging);
		System.out.println(company);
		System.out.println(expiryYear);
		System.out.println(overDose);
		System.out.println(safetyForChildren);
		System.out.println(typeofMedicine);
		System.out.println(vitamins);
		System.out.println(chewable);
		System.out.println(toxic);
	}
		
	
	
	
	
	
	
}