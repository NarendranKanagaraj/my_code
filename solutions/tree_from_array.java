import tree.Tree;
class tree_from_array
{
public static void main(String args[])
{
int[] a={1,2,3,4,5,6,7,8,9};
Tree t=new Tree();
insertFromArray(t,a,0,a.length-1);
t.display();
t.breadth_first();
}
public static void insertFromArray(Tree t,int[] a,int start,int end)
{
if(a.length==0||start>end)
return;
t.insert(a[(start+end)/2]);
if(start==end)
return;
insertFromArray(t,a,start,(start+end)/2);
insertFromArray(t,a,(start+end)/2+1,end);
}
}