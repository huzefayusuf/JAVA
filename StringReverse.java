import java.util.*;
class StringReverse
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter any String:");
String a=sc.next();
String rev="";
for(int i=a.length()-1;i>=0;i--)
{
rev=rev+a.charAt(i);
}
System.out.println("Reversed String is:"+rev);
}
}

Output
====================
Enter any String:
huzefa
Reversed String is:afezuh
====================