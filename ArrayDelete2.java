import java.util.*;
class ArrayDelete2
{
public static void main(String args[])
{
int count=0,pos=0;
Scanner sc =new Scanner(System.in);
System.out.println("Enter array size:");
int size=sc.nextInt();
int[] a=new int[size];
int[] b=new int[size-1];
System.out.println("Enter "+size+" No.s");
for(int i=0;i<size;i++)
{
a[i]=sc.nextInt();
}
System.out.println("Enter Index no. you want to delete:");
int index=sc.nextInt();
for(int i=0,j=0;i<size;i++)
{
if(i==index)
{
continue;
}
else
{
b[j++]=a[i];
}
}
System.out.println("Array after deleting index is:");
for(int i=0;i<size-1;i++)
{
System.out.println(b[i]);
}
}
}

Output
==================
Enter array size:
8
Enter 8 No.s
1
2
3
4
5
6
7
8
Enter Index no. you want to delete:
5
Array after deleting index is:
1
2
3
4
5
7
8
======================
