import java.util.*;
class NumPalindrome
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter any number");
int num=sc.nextInt();
int temp=num;
int num2;
int result=0;
while(num>0)
{
num2=num%10;
result=(result*10)+num2;
num=num/10;
}
if(result==temp)
{
System.out.println("Its a Number Palindrome");
}
else
{
System.out.println("Not a palindrome");
}
}
}

Output
=============

Enter any number
545
Its a Number Palindrome
==============