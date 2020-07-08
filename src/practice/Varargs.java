package practice;

public class Varargs {
	
	public static void adder(int ... a)
	{
	   int sum=0;
	   String s="";
	   int count=0;
	   for(int i: a)
	   {   sum+=i;
		   if(count<a.length-1)
		   {
			   //s=s.concat(Integer.toString(i));
			   //s=s.concat("+");
			   s=s+Integer.toString(i)+"+";
		   }
		   else
		   {
			   //s=s.concat(Integer.toString(i));
			   //s=s.concat("=");
			   s=s+i+"=";
			   System.out.println(s+sum);
		   }
		   count++;
	   }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		adder(1);
		adder(1,2);
		adder(1,2,3);
		adder(1,2,3,4);
		adder(1,2,3,4,5);
		adder(1,2,3,4,5,6);
		
		

	}

}
