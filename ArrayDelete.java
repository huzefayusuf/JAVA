import java.util.*;
class ArrayDelete
{
public static void main(String args[])
{
int count=0,pos=0;
Scanner sc =new Scanner(System.in);
System.out.println("Enter array size:");
int size=sc.nextInt();
int[] a=new int[size];
System.out.println("Enter "+size+" No.s");
for(int i=0;i<size;i++)
{
a[i]=sc.nextInt();
}
System.out.println("Enter no. you want to delete:");
int numdl=sc.nextInt();
for(int i=0;i<size;i++)
{
if(a[i]==numdl)
{
count=1;
pos=i;
break;
}
else
{
count=0;
}
}
if(count==1)
{
for(int i=(pos+1);i<size;i++)
{
a[i-1]=a[i];
}}
System.out.println("Array after Deleting elements");
for(int i=0;i<=size-2;i++)
{
System.out.println(a[i]);
}
}
}

Output
=================
Enter array size:
8
Enter 8 No.s
8
4
3
5
1
9
7
2
Enter no. you want to delete:
5
Array after Deleting elements
8
4
3
1
9
7
2
=================

