import java.util.*;
class BigSmallArrays
{
public static void main(String args[])
{
int large=0;
int small=0;
Scanner sc=new Scanner(System.in);
System.out.println("Enter array size");
int n=sc.nextInt();
int[] num=new int[n];
System.out.println("Enter "+n+" numbers");
for(int i=0;i<n;i++)
{
num[i]=sc.nextInt();
}
for(int i=0;i<n;i++)
{
if(num[i]>large)
{
large=num[i];
}
}
System.out.println("The largest no. is "+large);
for(int i=0;i<n;i++)
{
if(i==0&&num[i]>0)
{
small=num[i];
}
if(num[i]<small)
{
small=num[i];
}
}
System.out.println("The smallests no. is "+small);
}
}

Output
=============================
Enter array size
5
Enter 5 numbers
45
68
89
32
15
The largest no. is 89
The smallests no. is 15
==============================