import java.util.*;
class BigSmall
{
public static void main(String args[])
{
int small=0,large=0;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the numbers you want");
int[] a=new int[10];
for(int i=0;i<a.length;i++)
{
a[i]=sc.nextInt();
}
for(int i=0;i<a.length;i++)
{
System.out.println(a[i]);
small=a[i];
}

for(int i=2;i<a.length;i++)
{
if(a[i]>large)
{
large=a[i];
}
if(a[i]<small)
{
small=a[i];
}}
System.out.println("the largest=" + large);
System.out.println("the smallest=" + small);
}
}

Output
=====================
Enter the numbers you want
44
45
46
17
48
49
50
51
52
53
44
45
46
17
48
49
50
51
52
53
the largest=53
the smallest=17
=====================
