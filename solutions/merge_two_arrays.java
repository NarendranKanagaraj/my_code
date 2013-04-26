class merge_two_arrays
{
public static void main(String args[])
{
int[] a={4,5,7,8,10,0,0,0,0,0,0};//Enough spaces for second array
int[] b={1,2,3,6,9,11};
a=merge(a,b);
for(int i=0;i<a.length;i++)
System.out.print(a[i]+" ");
}

public static int[] merge(int[] a,int[] b)
{
int i=a.length-b.length-1,j=b.length-1,k=a.length-1;
while(k>-1)
{
if((i>-1)&&((a[i]>b[j])||(i>-1&&j<0)))
a[k--]=a[i--];
else
a[k--]=b[j--];
}
return a;
}
}