class robo
{
public static void main(String args[])
{
int m=5,n=5;
System.out.println(count_ways_formula(m,n));
System.out.println(count_ways_rec(0,0,m,n));
}
public static int count_ways_formula(int m,int n)
{
//formula is (m+n-2)Cn-1. if m=n then (2n-2)C(n-1). we are travelling a distance of (m+n-2)or 2n-2 at max. 
//we choose either right or down. so we select n-1(or m-1) from m+n-2. Thus the formula 
return factorial(m+n-2)/(factorial(n-1)*factorial(m-1));
}
public static int count_ways_rec(int i,int j,int m,int n)
{
if(i>m-1||j>n-1)
return 0;
if(i==m-1&&j==n-1)
return 1;
return count_ways_rec(i+1,j,m,n)+count_ways_rec(i,j+1,m,n);
}

public static int factorial(int n)
{
int fact=1;
for(int i=1;i<=n;i++)
fact=fact*i;
return fact;
}
}