class perfect
{
public static void main(String[]args)
{
int num=28;
int i=1;
int sum=0;
while(num>i)
{
if(num%i==0)
{
sum=sum+i;
}
i++;
}
if(num==sum)
{
System.out.println("perfect number " +sum);
}
else
{
System.out.println("not perfect number " +sum);
}
}
}
