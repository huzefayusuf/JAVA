import java.util.*;
class ArrayBinarySearch
{
public static void main(String[]args)
{
int key;
Scanner s=new Scanner(System.in);
System.out.println("Enter the length of array");
int size=s.nextInt();
int a[]=new int[size];
System.out.println("Enter the elements in the array");
for(int i=0;i<size;i++)
{
a[i]=s.nextInt();
}
System.out.println("Enter the element to be searched");
key=s.nextInt();
int low=0;
int high=size-1;
int mid=0;
while(low<=high)
{
mid=(low+high)/2;
if(a[mid]==key)
{
System.out.println("Postion is:" + mid);
break;
}
else if(a[mid]>key)
{ 
high=mid-1;
}
else if(a[mid]<key)
{
low=mid+1;
}
}
if(low>high)
{
System.out.println("elements not found");
}
}
}

Output
==============
Enter the length of array
6
Enter the elements in the array
1
2
3
4
5
6
Enter the element to be searched
3
Postion is:2
================