import java.util.*;
class Arrays1
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter amount of no.s");
int n=sc.nextInt();
int[] a=new int[n];
System.out.println("Enter numbers");
for(int i=0;i<n;i++)
{
a[i]=sc.nextInt();
}
System.out.println("The no.s you Entered are:");
for(int i=0;i<n;i++)
{
System.out.print(a[i]+" ");
}
}
}

Output
===============================
Enter amount of no.s
5
Enter numbers
10
55
63
45
78
The no.s you Entered are:
10 55 63 45 78
================================