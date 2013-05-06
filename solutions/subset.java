import java.lang.Math;
class subset
{
public static void main(String args[])
{
String a="abcd";
generate(a,a.length(),(1<<a.length()));
}

public static void generate(String a,int set,int pow_set)
{
System.out.println(set+" "+pow_set);
for(int i=0;i<pow_set;i++)
{
for(int j=0;j<set;j++)
{
if((i&(1<<j))!=0)
System.out.print(a.charAt(j));
}
System.out.println("");
}
}
}