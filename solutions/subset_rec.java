import java.util.*;
class subset_rec
{
public static void main(String args[])
{
String a="abcd";
StringBuilder b=new StringBuilder(a);
ArrayList res=generate(b,a.length());
System.out.println(res);
}

public static ArrayList generate(StringBuilder a,int len)
{
if(len==0)
{
ArrayList l=new ArrayList();
l.add("");
return l;
}
char c=a.charAt(0);
a.deleteCharAt(0);
ArrayList sets=generate(a,len-1);
sets.addAll(merge((ArrayList)sets.clone(),c));
return sets;
}
public static ArrayList merge(ArrayList sets,char c)
{
for(int i=0;i<sets.size();i++)
{
sets.set(i,(String)sets.get(i)+c);
}
return sets;
}
}