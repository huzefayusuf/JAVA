import java.util.*;
class StringPalindrome
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter any string:");
String a=sc.next();
String arev="";
for(int i=a.length()-1;i>=0;i--)
{
arev=arev+a.charAt(i);
}
if(arev.equals(a))
{
System.out.println("String is a Palindrome");
}
else
{
System.out.println("not a palindrome");
}
}
} 

Output
==================
Enter any string:
dad
String is a Palindrome
=======================