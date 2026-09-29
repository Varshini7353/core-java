class Cosmetics extends Products{
	
	@Override
	public String applyProduct(){
		System.out.println("Cosmetic product applied ");
		return "eyeliner";
	}
}