import java.util.*;
class remove_dup_from_string
{
public static void main(String args[])
{
String a="malayalam";
System.out.println(remove_order_n2(a));
System.out.println(remove_order_n_arr(a));
System.out.println(remove_order_n_hash(a));
System.out.println(remove_order_n_bit(a));
}

public static String remove_order_n2(String a)
{
StringBuilder sb=new StringBuilder(a);
int pos=1,flag;
for(int i=1;i<sb.length();i++)
{
flag=0;
for(int j=i-1;j>=0;j--)
{
if(sb.charAt(j)==sb.charAt(i))
{
flag=1;
break;
}
}
if(flag==0)
{

sb.setCharAt(pos,sb.charAt(i));
pos++;
}
}
return sb.substring(0,pos);
}

//Array
public static String remove_order_n_arr(String a)
{
StringBuilder sb=new StringBuilder(a);
boolean[] arr=new boolean[256];
int pos=0;
for(int i=0;i<sb.length();i++)
{
if(arr[sb.charAt(i)]==false)
{
sb.setCharAt(pos,sb.charAt(i));
arr[sb.charAt(i)]=true;
pos++;
}
}
return sb.substring(0,pos);
}
//hashmap
public static String remove_order_n_hash(String a)
{
String s="";
LinkedHashMap h=new LinkedHashMap();
for(int i=0;i<a.length();i++)
{
h.put(a.charAt(i),1);
}
for(Object key:h.keySet())
s=s+((String)key.toString());
return s;
}

//Bit vector
public static String remove_order_n_bit(String a)
{
StringBuilder sb=new StringBuilder(a);
int n=0;
int pos=0;
for(int i=0;i<sb.length();i++)
{
if((n&(1<<(sb.charAt(i)-'a')))==0)
{
sb.setCharAt(pos,sb.charAt(i));
n=n|(1<<(sb.charAt(i)-'a'));
pos++;
}
}
return sb.substring(0,pos);
}

}