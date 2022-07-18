class digits
{
public static void main(String [] args)
{
	int num=123456;
	String ev= " ";
	String od=" ";
	while(num>0) // 0>0.....f
	{
		int dig=num%10; //%10.....1
		if (dig%2==0) //1%2==0.....f
		{
			ev=dig+ev; //2+"46"="246"
		}
		else 
		{
			od=dig+od; // 1+"35"="135"
		}
num=num/10;  // 1/10...0..
	}
System.out.println("even no" + ev);
System.out.println("odd no" + od);
}
}	