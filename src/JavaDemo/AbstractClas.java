package JavaDemo;

import java.util.LinkedList;
import java.util.Queue;

public abstract class AbstractClas {
	
	public void myMethod() {
		System.out.println("Abstract class method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractClas a= new AbstractClas() 
		{};
		a.myMethod();
		Queue q=new LinkedList<Integer>();
		

	}

}
