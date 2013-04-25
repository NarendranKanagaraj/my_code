import tree.*;

class tree_from_in_pre
{
static int pre_index=0;
public static void main(String args[])
{
int[] in={1,2,3,6,7,8,9};
int[] pre={6,2,1,3,8,7,9};
Tree t1=new Tree();
t1.insert(6);
t1.insert(2);
t1.insert(8);
t1.insert(1);
t1.insert(3);
t1.insert(7);
t1.insert(9);
t1.display();
Tree t=new Tree();
t.root=construct_tree(in,pre,0,in.length-1);
t.display();
}

public static treenode construct_tree(int[] in,int[] pre,int in_start,int in_end)
{
if(in_start>in_end)
return null;
treenode node=new treenode();
node.data=pre[pre_index++];
if(in_start==in_end)
return node;
int in_index=find_index(in,pre[pre_index-1],in_start,in_end);
node.left=construct_tree(in,pre,in_start,in_index-1);
node.right=construct_tree(in,pre,in_index+1,in_end);
return node;
}

public static int find_index(int[] in,int n,int start,int end)
{
for(int i=start;i<=end;i++)
{
if(in[i]==n)
return i;
}
return -1;
}
}