class digits
{
public static void main(String [] args)
{
int num=1947;
while (num>0)
{
int dig =num%10;
System.out.println("dig"+ dig);
num=num/10;
}
}
}