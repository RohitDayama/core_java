import java.util.Scanner;
class countpali
{
public static void main(String []args)
{
Scanner sc=new Scanner (System.in);
System.out.println("enter starting number");
int start=sc.nextInt(); // 10
System.out.println("enter ending number");
int end=sc.nextInt(); // 30  
int count=0;
while(start<=end) // 10<=30.....t 
{
	int num=start;   
int temp=num;
int rev=0;
while(num>0)   // 11>0...t 
{
	int dig=num%10;  //11%10.....1.
rev=rev*10+dig; //  11
num=num/10; // 11/10....1
}
if(rev==temp)
{
	System.out.println(+rev);// 11
count++;  //1
}
start++; 
}
System.out.println("count of palindrome number " +count);
if (count%7==0)
{
	System.out.println("count of palindrome number divisble by 7 " +count);
}
else
	System.out.println("count of palindrome numberis not divisble by 7 " );
}
}