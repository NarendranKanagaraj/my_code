class merge_bits
{
public static void main(String args[])
{
int m=1000,n=23,i=2,j=7;
System.out.println("m="+Integer.toBinaryString(m));
System.out.println("n="+Integer.toBinaryString(n));
int x=0xffffffff;
x=x<<(j-i);
x=Integer.rotateLeft(x,i);
m=m&x;
m=m|(Integer.rotateLeft(n,i));
System.out.println("m="+Integer.toBinaryString(m));
}
}