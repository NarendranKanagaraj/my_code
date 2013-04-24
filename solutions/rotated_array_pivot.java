class rotated_array_pivot
{
public static void main(String args[])
{
int[] a={4,5,6,7,8,9,1,2,3};
System.out.println(find_rotation_index(a,0,a.length-1));
}

public static int find_rotation_index(int[] a,int start,int end)
{
if(end<start)
return -1;
int mid=(start+end)/2;
if(mid<end&&a[mid]>a[mid+1])
return mid;
if(a[start]<a[mid])
return find_rotation_index(a,mid+1,end);
else
return find_rotation_index(a,start,mid);
}
}