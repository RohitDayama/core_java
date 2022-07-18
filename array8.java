import java.util.Scanner;
class array
{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter teh size of array");
		int size=sc.nextInt();
		
		int a[]=new int[size];
		for(int i=0;i<size;i++)
		{
			System.out.println("enter the value for " + i + "index");
			a[i]=sc.nextInt();
		}
		int sum=0;
		for(int i=0; i<size;i++)
		{
		if(a[i]%2==0)
		{
			sum=sum+a[i];
		}
		}
		System.out.println("sum of even number "+sum);
		int count=0;
		while(sum>0)
		{
			int dig=sum%10;
			sum=sum/10;
			count++;
		}
		System.out.println("count of dig " +count);
	}
}