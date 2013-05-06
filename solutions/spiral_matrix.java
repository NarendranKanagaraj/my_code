class spiral_matrix
{
public static void main(String args[])
{
int[][] a={{1,2,3,4,5,12},{6,7,8,9,10,13},{11,12,13,14,15,14},{16,17,18,19,20,15},{21,22,23,24,25,16}};
print_spirally(a,5,6,30);
}

public static void print_spirally(int[][] mat,int m,int n,int count)
{
int i=0,j=0;
int m1=1,n1=0;
while(count>0)
{
while(j<n)
{
if(count--<=0)
break;
System.out.println(mat[i][j++]);
}
j--;
i++;
//System.out.println("j="+j+"count"+count);
while(i<m)
{
if(count--<=0)
break;
System.out.println(mat[i++][j]);
}i--;
j--;
//System.out.println("i="+i+"count"+count);
while(j>=n1)
{
if(count--<=0)
break;
System.out.println(mat[i][j--]);
}j++;
i--;
//System.out.println("j="+j+"count"+count);
while(i>=m1)
{
if(count--<=0)
break;
System.out.println(mat[i--][j]);
}
i++;
j++;
//System.out.println("i="+i+"count"+count);
m--;
n--;
n1++;m1++;
}
}
}