package inheritance;

class Person{
	float height=5.5f;
	int weight=55;
	void walk() {
		System.out.println("Person can walk");
	}
	void run() {
		System.out.println("Person can run");
	}
	void sit() {
		System.out.println("Person can sit");
	}
}
public class Inheritance extends Person {
    void study() {
    	System.out.println("Student can study");
    }
	public static void main(String[] args) {
		Inheritance student=new Inheritance();
		System.out.println("Height is : " +student.height);
	    System.out.println("weight is : " +student.weight);
	    student.walk();
	    student.run();
	    student.sit();
	    student.study();
		  
		
		
	 

	}

}
