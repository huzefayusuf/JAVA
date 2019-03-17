import java.util.*;
class ArrayOccurence
{
public static void main(String args[])
{
int temp=0;
Scanner sc=new Scanner(System.in);
System.out.println("Enter array size : ");
int size=sc.nextInt();	
int[] a=new int[size];
int[] count=new int[100];	
System.out.println("Enter "+size+" Numbers");
for(int i=0;i<size;i++)
{
a[i]=sc.nextInt();
}
for(int i=0;i<size;i++)
{
temp=a[i];
count[temp]++;
}
for(int i=1;i<count.length;i++)
{
if(count[i]>0 && count[i]==1)
{
System.out.println(i+" Occurs "+count[i]+" times ");
}
else if(count[i]>=2)
{
System.out.println(i+" Occurs "+count[i]+" times ");
}
}
}}

Output
====================
Enter array size :
10
Enter 10 Numbers
5
6
5
4
9
4
9
5
6
1
1 Occurs 1 times
4 Occurs 2 times
5 Occurs 3 times
6 Occurs 2 times
9 Occurs 2 times
============================