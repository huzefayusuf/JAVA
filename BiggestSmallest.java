import java.util.*;
class BiggestSmallest
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter Three Numbers:");
int a=sc.nextInt();
int b=sc.nextInt();
int c=sc.nextInt();
if(a>b && a>c)
{
System.out.println("a is Biggest");
}
else if(b>c)
{
System.out.println("b is Biggest");
}
else
{
System.out.println("c is Biggest");
}
if(a<b && a<c)
{
System.out.println("a is Smallest");
}
else if(b<c)
{
System.out.println("b is Smallest");
}
else
{
System.out.println("c is Smallest");
}
}
}

Output
=============
Enter Three Numbers:
48
56
98
c is Biggest
a is Smallest
==============
