class XworkzRunner{
	
	public static void main(String []args){
		
		System.out.println("Main started");
		
		Institution course=new Institution();
		
		course.learn();
		course.getCoursefeeDetails();
		System.out.println("Main ended");
	}
}