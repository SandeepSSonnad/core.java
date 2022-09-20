class TabletRunner{
	
	public static void main(String[] tab){
		
		Tablet.properties();
          System.out.println("The Properties Of Dolo650 Tablet");
      	Tablet.shape="Round";
        Tablet.weight=10.5d;
        Tablet.manufactureYear=2022;
		Tablet.colour="White";
		Tablet.dose=650;
		Tablet.cost=200;
		Tablet.intake="Through Water";
		String[] content={"paracetamol","aceclofenac","Serratiopeptidase","Antipyretic",
		"Vitamins","Minarals","Analgesic","Spondylitis", "Osteoarthritis","Fibre"};
		Tablet.content=content;
		Tablet.packaging="Plastic";
		Tablet.company="Dolo";
		Tablet.expiryYear=2023;
		Tablet.overDose=false;
		Tablet.safetyForChildren=true;
		Tablet.typeofMedicine="English";
		Tablet.vitamins='c';
		Tablet.chewable=true;
		Tablet.toxic="Non-Toxic";
		
		Tablet.properties();
		
		
	}
}