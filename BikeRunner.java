class BikeRunner{
	public static void main(String[] args){
		
		String brand1="Hero";
		String brand2="Tvs";
		String brand3="Yamaha";
		String brand4="Tata";
		String brand5="Mahindra";
		
		String[] famousbrands={brand1,brand2,brand3,brand4,brand5};
		int Totalbrand=famousbrands.length;
		System.out.println("count="+Totalbrand);
		
		        //updating brand3=passionpro
		famousbrands[2]="passionpro";
		
		
		for(int pride=0;pride<famousbrands.length;pride++)
		{
			System.out.println(famousbrands[pride]);
			
			
			
		}
		
		
	}
	
	
}