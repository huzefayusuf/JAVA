class ArrayDuplicate
{
public static void main(String[]args)
{
int count=0;
int[] a=new int[]{47,55,98,44,55,35,48,69,66,28,48};
System.out.println("Dupliate no.'s in the array are");
for(int i=0;i<a.length;i++)
{
for(int j=i+1;j<a.length;j++)
{
if(a[i]==a[j])
{
System.out.println(a[j]);
count++;
break;
}}
}
}
}

Output
===============
Dupliate no.'s in the array are
55
48
===============
