class compress_string
{
public static void main(String args[])
{
String s="AADDBBBBCEEEAAAAA";
StringBuilder b=new StringBuilder(s);
int i,j,k=0;
for(i=0;i<b.length();)
{
for(j=i;j<b.length()&&b.charAt(i)==b.charAt(j);j++);
b.setCharAt(k,b.charAt(i));
k++;
if((j-i)>1)
{
b.setCharAt(k,Character.forDigit(j-i, 10));
k++;
}
i=j;
}
System.out.println(b.substring(0,k));
}
}