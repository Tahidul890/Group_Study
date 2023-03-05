package inheritance;

public class Grand_Child_Class extends Child_Class{
	
	protected void haveBankAccount(String A) {
		
		System.out.println(A);
		
	}
	
	public static void main(String[] args) {
		
		Grand_Child_Class obj = new Grand_Child_Class();
		
		obj.haveBankAccount("Chase");
		obj.getCar();
	    System.out.println(obj.getCash());
	    System.out.println(obj.familyName());
	    obj.haveJob();
	    obj.haveHouse();
	    System.out.println(obj.salary());
	    obj.haveBankAccount("TD");
	    
		
		
	}

}