class ProductRunner{
	
	public static void main(String []args){
		
		Products cosmetics=new Products();
		cosmetics.checkExpiry();
		cosmetics.applyProduct();
		
		System.out.println("------------------------------");
		Products product=new Cosmetics();
		product.checkExpiry();
		product.applyProduct();
		
}
}