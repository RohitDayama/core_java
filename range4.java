import java.util.Scanner;
class range
{
public static void main(String [] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the starting value");
int start= sc.nextInt ();
System.out.println("enter the ending value");
int end= sc.nextInt ();
int sum=0;
while (start<=end)
{
	
	if(start%3==0)
	{
		sum=sum+1;
	}
	start++;
}
	System.out.println("count of no" +sum);
	if (sum%2==0)
	{
		System.out.println("count of no divisible by 3 is even");
	}
	else
		{
			System.out.println("count of no divisible by 3 is odd");
		}
}

}