class digits
{
public static void main(String [] args)
{
int num=1998847;
while (num>0)
{
	int dig=num%10;
if(dig%2==0)
{
	System.out.println("even no"+ dig);
}
else
{
	System.out.println("odd no" + dig);
}
num=num/10;
}
}
}