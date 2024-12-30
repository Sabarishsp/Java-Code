package training;
import java.util.*;
public class Containduplicate {
	public static void main(String args[])
	{
		Scanner c=new Scanner(System.in);
		int s=c.nextInt();
		int arr[]=new int[s];
		for(int i=0;i<s;i++)
		{
			arr[i]=c.nextInt();
		}
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					count++;
				}
				
			}
		}
		if(count>=1)
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("False");
		}
	}

}
