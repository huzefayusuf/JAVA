import java.util.*;
class Factorial
{
public static void main(String args[])
{
int res=1;
Scanner sc=new Scanner(System.in);
System.out.println("Enter your given range");
int a=sc.nextInt();
int b=sc.nextInt();
for(int i=a;i<=b;a++)
{
for( i=1;i<=a;i++)
{
res=res*i;
}
System.out.println("The factorial for numbers in the given range are:"+res);
res=1;
}
}
}

Output
==============
Enter your given range
6
9
The factorial for numbers in the given range are:720
The factorial for numbers in the given range are:5040
The factorial for numbers in the given range are:40320
The factorial for numbers in the given range are:362880
==================