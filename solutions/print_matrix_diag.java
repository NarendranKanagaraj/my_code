class print_matrix_diag
{
public static void main(String args[])
{
int[][] a={{1,2,3},{5,6,7},{9,10,11}};
for(int i=a.length-1;i>0;i--)
{
for(int j=i,k=0;j<a.length;j++,k++)
{
System.out.println(a[j][k]);
}
}
for(int i=0;i<a[0].length;i++)
{
for(int j=i,k=0;j<a.length;j++,k++)
{
System.out.println(a[k][j]);
}
}
}
}