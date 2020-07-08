package JavaDemo;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {5,4,6,7,8};
		int[] b = new int[a.length];
		for (int i = 0; i <=a.length-1 ; i++) {
			
			b[(a.length-1)-i]=a[i];
			
		}
		
		System.out.println(b);
		
		/*for (int i = 0; i < b.length; i++) {
			
			System.out.print(b[i]);
		}*/

	}

}
