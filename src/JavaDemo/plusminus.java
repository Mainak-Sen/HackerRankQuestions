package JavaDemo;

public class plusminus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = {-4,3,-9,0,4,1};
		int count0=0;
		int countnve=0;
		int countpve=0;
		
		for (int i = 0; i < a.length; i++) {
			if(a[i]==0)
			{
				count0++;
			}
			else
			{
				if(a[i]>0)
				{
					countpve++;
				}
				else
				{
					countnve++;
				}
			}
		}
		
		System.out.println(String.format("%.6f",(float)countpve/a.length));
		System.out.println(String.format("%.6f",(float)countnve/a.length));
		System.out.println(String.format("%.6f",(float)count0/a.length));
	}

}
