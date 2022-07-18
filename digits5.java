class digits
{
public static void main(String [] args)
{
int num=194789;
int rev=0;
while (num>0) // 1>0........t
{
	int dig=num%10; //1%10.......1
rev=rev*10+dig; // 98749*10+1=987491
num=num/10; // 1/10......0

}
System.out.println("revrese no" + rev);
}
}