class palindrome
{
public static void main(String[]args)
{
int num=181;
int rev=0;
int temp=num;
while (num>0)
{
	int dig=num%10;
	rev=rev*10+dig;
	num=num/10;
}
if (rev==temp)
{
	System.out.println("palindrome" +rev);
}
else 
{
	System.out.println(" not Palindrome" +num);
}
}
}