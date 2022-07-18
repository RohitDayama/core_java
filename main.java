class main
{
public static void main(String[]args)
{
int num=145;
int temp=num;
int sum=0;
int res=1;
while(num>0)
{
int dig=num%10;
int i=1;
while(i<=dig)
{
res=res*i;
i++;
}
sum=sum+res;
num=num/10;
}
if(sum==temp)
{
System.out.println("Strong no " +temp);
}
else

{
	System.out.println("not Strong no " +temp);
}
}
}