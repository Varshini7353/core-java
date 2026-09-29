class CosmeticRunner{
	
	public static void main(String []args){
		
		System.out.println("Main started");
		
		Product product=new Product();
		
		product.apply();
		product.getProductPrice();
		System.out.println("Main ended");
	}
}
