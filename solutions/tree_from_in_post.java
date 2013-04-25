import tree.*;

class tree_from_in_post
{
static int post_index;
public static void main(String args[])
{
int[] in={1,2,3,6,7,8,9};
int[] post={1,3,2,7,9,8,6};
post_index=post.length-1;
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
t.root=construct_tree(in,post,0,in.length-1);
t.display();
}

public static treenode construct_tree(int[] in,int[] post,int in_start,int in_end)
{
if(in_start>in_end)
return null;
treenode node=new treenode();
node.data=post[post_index--];
if(in_start==in_end)
return node;
int in_index=find_index(in,post[post_index+1],in_start,in_end);
node.right=construct_tree(in,post,in_index+1,in_end);
node.left=construct_tree(in,post,in_start,in_index-1);
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