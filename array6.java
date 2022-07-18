class array
{
public static void main(String[]rags)
{
int [] a ={10,12,11,13,17,20,19};
for(int i=0; i<a.length; i++)
{
int rev=0;
int num=a[i];
int temp;
	if(a[i]%2==0)
	{
	while(num>0)
	int dig=num%10;
	rev=rev*10;
	num=num/10;
	}
	else
	{
	temp=num*num;
	}
	System.out.println(+rev);
	System.out.println(+temp);
}
}
}