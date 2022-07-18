import java.util.Scanner;
public class powmeth 
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number ");
		int num=sc.nextInt();
		System.out.println("enter power");
		int pow=sc.nextInt();
		power(num);
		pow--;
	}
public static void power(int num)
{
	int res=1;
	while(pow>0)
	{
		res=res*num;
		
	}
	System.out.println("result = " +res);
}
}