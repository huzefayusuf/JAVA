import java.util.*;
class ArrayInsert
{
public static void main(String args[])
{
Scanner sc =new Scanner(System.in);
System.out.println("Enter array size:");
int size=sc.nextInt();
int[] a=new int[size+1];
System.out.println("Enter "+size+" No.s");
for(int i=0;i<size;i++)
{
a[i]=sc.nextInt();
}
System.out.println("Enter no. you want to insert:");
int numin=sc.nextInt();
System.out.println("Enter the Postion you wan to insert "+numin+" into");
int numpos=sc.nextInt();
for(int i=(size-1);i>=(numpos-1);i--)
{
a[i+1]=a[i];
}
a[numpos-1]=numin;
System.out.println("Array after Inserting new element");
for(int i=0;i<=size;i++)
{
System.out.println(a[i]);
}
}
}

Output
===================
Enter array size:
6
Enter 6 No.s
12
13
15
16
17
18
Enter no. you want to insert:
14
Enter the Postion you wan to insert 14 into
3
Array after Inserting new element
12
13
14
15
16
17
18
====================