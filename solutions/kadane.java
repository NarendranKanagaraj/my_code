import java.lang.Math.*;
class kadane
{
public static void main(String args[])
{
int[] a={3,-2,1,4,-3,2};
int max_ending,max_so_far;
max_ending=max_so_far=0;
for(int i=0;i<a.length;i++)
{
max_ending=Math.max(max_ending+a[i],0);
if(max_so_far<max_ending)
max_so_far=max_ending;
}
System.out.println(max_so_far);
}
}