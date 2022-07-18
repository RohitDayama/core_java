import java.util.Scanner;
class pali
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter start ");
		int start=sc.nextInt();
		System.out.println("enter end ");
         int end=sc.nextInt();
         while(start<=end)
{
          prime(start);
       start++;
	}
}	
	public static void prime(int num)
	{
		int i=2;
		while(num>i)
		{
			if (num%i==0)
			{
				break;
			}
			i++;
		}
			if(num==i)
			{
				System.out.println("prime number " +num);
			}
		}
	}