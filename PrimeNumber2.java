import java.util.*;
class PrimeNumber2
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("The prime numbers between 2 and 100 are:");
int a=0;
for(int i=2;i<=100;i++)
{
int val=0;
for(a=i;a>=1;a--)
{
if(i%a==0)
{
val=val+1;
}
}
if(val==2)
{
System.out.println(i);
}
}
}
}

Output
==============
The prime numbers between 2 and 100 are:
2
3
5
7
11
13
17
19
23
29
31
37
41
43
47
53
59
61
67
71
73
79
83
89
97
===============