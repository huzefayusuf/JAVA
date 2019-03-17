import java.util.*;
class PrimeNumber
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter any number:");
int num=sc.nextInt();
int a=num/2;
int val=0;
if(num==0 || num==1)
{
System.out.println("Not a prime number");
}
for(int i=2;i<=a;i++)
{
if(num%i==0)
{
System.out.println("Not a prime number");
val=1;
break;
}
}
if(val==0)
{
System.out.println("It is a Prime Number");
}
}
}

Output
==============
Enter any number:
11
It is a Prime Number
===============