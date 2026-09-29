class ParentRunner{
	
	public static void main(String []args){
		
		Parent parent=new Parent();
		parent.service();
		parent.doBusiness();
		System.out.println("------------------------------");
		
		Parent parent1=new Child();
		parent1.service();
		parent1.doBusiness();
	}
}
