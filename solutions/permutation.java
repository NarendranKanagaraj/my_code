class permutation
{
public static void main(String args[])
{
String a="abcd";
boolean[] used=new boolean[4];
StringBuilder b=new StringBuilder();
for(int i=0;i<4;i++)
b.append(0);
permute(a,used,b,0,0);
}
public static void permute(String a,boolean[] used,StringBuilder curr,int pos,int length)
{
if(a==null)
return;
if(length==a.length())
{
System.out.println(curr);
return;
}
for(int i=0;i<a.length();i++)
{
if(used[i]==false)
{
curr.setCharAt(pos,a.charAt(i));
used[i]=true;
permute(a,used,curr,pos+1,length+1);
used[i]=false;
}
}
}
}