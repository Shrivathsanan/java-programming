import java.util.*;
class Phone{
	void calculator(){
		System.out.println("hello");
	}
	void call() {
		System.out.println("hey");
	}
}
class Overriding extends Phone{
	void calculator(){
		System.out.println("how");
	}
	void add() {
		System.out.println("hi");
	}
	public static void main(String []args) {
		Overriding obj=new Overriding();
		obj.calculator();
		obj.call();
		obj.add();
		Phone obj1 = new Phone();
		obj1.calculator();
	}
}