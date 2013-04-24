import java.io.*;
class string_unique
{
public static void main(String args[]) throws Exception
{
String unique;
int flag=1;
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
unique=br.readLine();
for (int i=0;i<unique.length()-1;i++)
{
for (int j=i+1;j<unique.length();j++)
{
if(unique.charAt(i)==unique.charAt(j))
{
flag=0;
break;
}
}
if(flag==0)
break;
}
if(flag==0)
System.out.println("Not unique");
else
System.out.println("unique");

 
if(isUnique1(unique))
System.out.println("unique");
else
System.out.println("Not unique"); 

 
if(isUnique2(unique))
System.out.println("unique");
else
System.out.println("Not unique"); 
}
//Book Implementations
//boolean array
public static boolean isUnique1(String s)
{
boolean[] n=new boolean[256];
for(int i=0;i<s.length();i++)
{
int y=s.charAt(i);
if(n[y])
return false;
n[y]=true;
}
return true;
}
//bit vector
public static boolean isUnique2(String s)
{
int a=0;
for(int i=0;i<s.length();i++)
{
int p = s.charAt(i) - 'a';
int y=a&(1<<p);
if(y==0)
return false;
a=a|(1<<p);
}
return true;
}
}