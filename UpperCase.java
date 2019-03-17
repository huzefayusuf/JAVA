import java.util.*;
class UpperCase
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter any String");
String a=sc.nextLine();
StringBuilder upper=new StringBuilder();
String b[]=a.split(" ");
for(int i=0;i<b.length;i++)
{
upper.append(Character.toUpperCase(b[i].charAt(0))).append(b[i].substring(1)).append(" ");
}
System.out.println(upper);
}
}

Output
================
Enter any String
my name is huzefa
My Name Is Huzefa
================