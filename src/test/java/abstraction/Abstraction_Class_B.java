package abstraction;

public class Abstraction_Class_B extends Abstraction_Class_A{

	@Override
	void employeeInfo() {
		System.out.println("Muntasir");
		
	}

	@Override
	void salary() {
		System.out.println(120000);
	
	}
	
public static void main(String[] args) {
		
		Abstraction_Class_B obj = new Abstraction_Class_B();
		
		obj.employeeInfo();
		obj.salary();
		obj.region();
		System.out.println(obj.getCash()); 
	}
	
		
	}

	
	
