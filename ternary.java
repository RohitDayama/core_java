class ternary
{
public static void main(String[]args)
{
int a=12,b=40,c=60,d=80,e=10, t1,t2,t3;
t1=(a>b? a:b);
t2=(c>d? c:d);
t3=(d>e?d:e);
int largest=t1>t2? (t1>t3? t1:t3):(t2>t3? t2:t3);
System.out.println("largest number is"+largest);
System.out.println(largest%2==0? "even":"odd");
}
}