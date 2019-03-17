import java.util.*;
class StringOccurence
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter String : ");
String a=sc.nextLine();		
int[] count=new int[255];
int length=a.length();
for(int i=0;i<length;i++)
{
count[a.charAt(i)]++;
}
char[] ch = new char[a.length()];
for(int i=0;i<length;i++)
{
ch[i]=a.charAt(i);
int lcount =0;
for(int j=0;j<=i;j++)
{
if(a.charAt(i)==ch[j])
lcount++;
}
if(lcount==1)
{
System.out.println("Number of Occurrence of " + a.charAt(i) + " letter is:" + count[a.charAt(i)]);
}
}
}
}

Output
=====================
Enter String :
my name is huzefa
Number of Occurrence of m letter is:2
Number of Occurrence of y letter is:1
Number of Occurrence of   letter is:3
Number of Occurrence of n letter is:1
Number of Occurrence of a letter is:2
Number of Occurrence of e letter is:2
Number of Occurrence of i letter is:1
Number of Occurrence of s letter is:1
Number of Occurrence of h letter is:1
Number of Occurrence of u letter is:1
Number of Occurrence of z letter is:1
Number of Occurrence of f letter is:1
==========================