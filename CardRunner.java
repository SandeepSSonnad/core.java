class CardRunner{
	
	public static void main(String[] details){
		
		Card.displayDetails();
		
		Card.type="Debit Card";
		Card.heightInInch=2;
		Card.width=2.2d;
		Card.price=500;
		String[] colors={"Yellow","Blue","Red","Green"};
        
		Card.colors=colors;
		
		Card.displayDetails();
		
		
		
		
	}
	
	
}