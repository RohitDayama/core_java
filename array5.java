class array
{
public static void main(String[]rags)
{
int a[] ={10,12,11,13,17,20,19};

for(int i=0; i<a.length; i++)
{
	int rev=0;
	while(a[i]>0)
	{
	int dig=a[i]%10;
	rev=rev*10+dig;
	a[i]=a[i]/10;
	}
System.out.println(rev +" ");

}
}
}