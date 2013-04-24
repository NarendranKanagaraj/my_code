import java.lang.Math.*;
class modified_kadane
{
public static void main(String args[])
{
int[] a={-3,-2,-1,-4,-3,-2};
int max_ending,max_so_far,begin_tmp,begin,end;
begin_tmp=begin=end=0;
max_ending=max_so_far=a[0];
for(int i=1;i<a.length;i++)
{
if(max_ending<0)
{
max_ending=a[i];
begin_tmp=i;
}
else
max_ending+=a[i];
if(max_so_far<max_ending)
{
begin=begin_tmp;
end=i;
max_so_far=max_ending;
}
}
System.out.println(max_so_far);
System.out.println(begin+" "+end);
}
}