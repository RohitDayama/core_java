class str
{
public static void main(String[]args)
{
int num=9;
int sum=0;
int temp;
temp=num*num;
while(temp>0)
{
	int dig=temp%10;
sum=sum+dig;
temp=temp/10;
}
System.out.println("neon number " +sum);
}
}