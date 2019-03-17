import java.util.*;
class ArrayLinearSearch
{
public static void main(String[]args)
{
Scanner s=new Scanner(System.in);
System.out.println("Enter the size of array");
int size=s.nextInt();
int a[]=new int[size];
System.out.println("Enter the elements in the array");
for(int i=0;i<size;i++)
{
a[i]=s.nextInt();
}
int key;
int pos;
System.out.println("Enter the element to be searched");
key=s.nextInt();
for(int i=0;i<size;i++)
{
if(a[i]==key)
{
pos=i;
System.out.println("the position of the value is:" + pos);
break;
}
}
}
}

Output
============
Enter the size of array
6
Enter the elements in the array
8
4
3
2
9
5
Enter the element to be searched
4
the position of the value is:1
===============