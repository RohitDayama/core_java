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
while (start<=end)
{
	if(start%2!=0)
	{
	System.out.println(start);
	}
	start++;
}
}
}