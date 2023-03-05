package inheritance;

public class Child_Class extends Parent_Class{
	
	protected void haveJob() {
		
		System.out.println("QA Automation Engineer");
	}
	
	protected void haveHouse() {
		
		System.out.println("The Cyber Mantion");
	}
	
	double salary() {
		
		return 200000.99;
		
		
		
		
	}
	
	public static void main(String[] args) {
		
		Child_Class obj = new Child_Class();
		
		obj.getCar();
	    System.out.println(obj.getCash());
	    System.out.println(obj.familyName());
	    obj.haveJob();
	    obj.haveHouse();
	    System.out.println(obj.salary());
	    
	}

}
