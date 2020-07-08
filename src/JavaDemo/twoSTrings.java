package JavaDemo;

public class twoSTrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="Na";
		String str2="mob";
		boolean flag=false;
		/*for(int i=0;i<str1.length();i++)
		{
			for(int j=0;j<str2.length();j++)
			{
				if(str1.toUpperCase().charAt(i)==str2.toUpperCase().charAt(j))
				{
					flag=true;
					break;
				}
			}
		}
		
		if(flag==true)
		{
			System.out.println("YES");
		}
		else
		{
			System.out.println("NO");
		}*/
		
		for(char c: "abcdefghijklmnopqrstuvwxyz".toUpperCase().toCharArray())
		{
			if(str1.toUpperCase().indexOf(c)>-1 && str2.toUpperCase().indexOf(c)>-1)
			{
				flag=true;
				break;
			}
		}
		
		if(flag==true)
		{
			System.out.println("YES");
		}
		else
		{
			System.out.println("NO");
		}

	}

}
