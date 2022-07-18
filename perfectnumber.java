class per
{
public static void main(String [] args)
{
int num=28;
int i=1;
int sum=0;
while(num>i) //28>1.....t
{
	if (num%i==0)  // 28%1==0..t
	{
		sum=sum+i; // 0+1
	}
	i++;
}
if (num==sum)
{
	System.out.println("perfectnumber " +num);
}
else
{
	System.out.println(" not perfectnumber " +num);
}
}
}