import java.util.*;
class ArrayDuplicateRemove
{
public static void main(String[]args)
{
Scanner s=new Scanner(System.in);
System.out.println("Enter the size of array");
int size=s.nextInt();
int a[]=new int[100];
System.out.println("Enter the elements in the array");
for(int i=0;i<size;i++)
{
a[i]=s.nextInt();
}
for(int i=0;i<size;i++)
{
for(int j=i+1;j<size;)
{
if(a[i]==a[j])
{
for(int b=j;b<size;b++)
{
a[b]=a[b+1];
}
size--;
}
else
{
j++;
}
}
}
System.out.println("Array after removing duplicate numbers");
for(int i=0;i<size;i++)
{
System.out.println(a[i]);
}
}}

Output
=================
Enter the size of array
8
Enter the elements in the array
2
6
4
8
4
6
5
9
Array after removing duplicate numbers
2
6
4
8
5
9
==================