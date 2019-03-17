import java.util.*;
class StringWordSearch
{
public static void main(String args[])
{
int count=1; String rev="";
Scanner sc=new Scanner(System.in);
System.out.println("Enter any String");
String a=sc.nextLine();
int length=a.split(" ").length;
System.out.println("The no. of words in the given String is: "+length);
}
}

Output
================
Enter any String
my name is huzefa
The no. of words in the given String is: 4
================