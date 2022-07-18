class array
{
public static void main(String[]rags)
{
int  a [] ={10,12,11,13,17,20,19};
String ev="";
String od="";
for(int i=0; i<a.length; i++)
{
	if (a[i]%2==0)
	{
		ev=ev+a[i];
	}
     else
{
od=od+a[i];	
}
}
System.out.println("string number " +ev);
System.out.println("string number " +od);
}
}