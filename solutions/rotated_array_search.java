class rotated_array_search
{
public static void main(String args[])
{
int[] a={4,5,6,7,8,9,1,2,3,4};
System.out.println(search(a,0,a.length-1,10));
}

public static boolean search(int[] a,int start,int end,int key)
{
if(end<start)
return false;
int mid=(start+end)/2;
if(a[mid]==key)
return true;
if(a[start]<a[mid])//means first part is sorted
{
if(a[start]<=key&&a[mid]>key)//key is in this set
return search(a,start,mid-1,key);
else
return search(a,mid+1,end,key);
}
else//means second part is sorted
{
if(a[mid]<key&&a[end]>=key)//key is in this set
return search(a,mid+1,end,key);
else
return search(a,start,mid-1,key);
}
}
}