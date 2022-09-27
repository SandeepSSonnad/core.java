class ColorsRunner{
	
	public static void main(String[] args)
	{
		System.out.println("Main Method execute Start");
		Colors.save("Yellow");
		Colors.save("Bluish");
		Colors.save("Redish");
		Colors.save("Green");
		Colors.save("Orange");
		Colors.save("White");
		Colors.save("Black");
		Colors.save("Grey");
		Colors.displayDetails();
		boolean ref=Colors.findColorName("Black");
		System.out.println("Color Found="+ref);
		System.out.println("Main Method execute Stop");
		
		
		
		
		
	}
}