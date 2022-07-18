class dms4
{
public static void main(String[]args)
{
int num=-49;
if(num>0&& num%2==0)
{
System.out.println("+ve even no" + num);
}
else if (num>0 && num%2!=0)
{
System.out.println("+ve odd no" + num);
}
else if (num<0 && num%2==0)
{
System.out.println("-ve even no" + num);
}
else
{ 
System.out.println("-ve odd no" + num);
}
}
}