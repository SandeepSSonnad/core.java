class Food{
	
	public static void main(String[] args){
		 
		 String item1="Rice";
		 String item2="Dal";
		 String item3="Wheat";
		 String item4="Jower";
		 String item5="Maize";
		 String item6="Ragi";
		 String item7="Egg";
		 String item8="Meat";
		 String item9="vegetables";
		 String item10="Fruits";
		 String item11="Dosa";
		 String item12="Juice";
		 String item13="Alcohol";
		 
		 String[] fooditems={item1,item2,item3,item4,item5,item6,item7,item8,
		 item9,item10,item11,item12,item13};
		 
		 
		 System.out.println("Total fooditems="+fooditems.length);
		 
		 fooditems[3]="Gobbi";
		 
		 fooditems[7]="Rooti";
		
		
		 
		 for(int item=0;item<fooditems.length;item++){
			 System.out.println(fooditems[item]);
		 }
		 
		 
	}
	
	
	
	
}