import java.util.*;
class ArmStrong
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter any 3 digit Number");
int anum=sc.nextInt();
int a=anum%10;
int b=anum/10;
int c=b%10;
int d=b/10;
int result=(a*a*a)+(c*c*c)+(d*d*d);
if(result==anum)
{
System.out.println("Its a Amrmstrong number");
}
else
{
System.out.println("Its not a Armstrong number");
}
}
}

Output
============
Enter any 3 digit Number
371
Its a Amrmstrong number
=========================