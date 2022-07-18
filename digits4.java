class digits
{
public static void main(String [] args)
{
int num=19447788;
int sum=0;
int prod=1;
while (num>0)
{
	int dig=num%10;
	if (dig%2==0)
	{
		sum=sum+dig;
	}
	else 
	{
		prod=prod*dig;
	}
num=num/10;
}
System.out.println("sum of given even no" + sum);
System.out.println("prod of given odd no" + prod);
}
}	