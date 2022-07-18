class palindrome scanner
{
public static void main(String [] args)
{
	Scanner sc=new Scanner(System.in);
System.out.println("enter the number");
int num=sc.next Int();
int temp=num;
int rev=0;
while (num>0)
{
int dig=num%10;
rev=(rev*10)+dig;
num=num/10;
}
if (rev==tem)
{
System.out.println("Palindrome" +rev);
}
else
{
System.out.println("not Palindrome" +num);
}
}
}	