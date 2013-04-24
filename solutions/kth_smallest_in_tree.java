import tree.*;
class kth_smallest_in_tree
{
// use order statistics tree
public static void main(String args[])
{
Tree t=new Tree("order");
t.insert(6);
t.insert(4);
t.insert(2);
t.insert(3);
t.insert(8);
t.insert(7);
t.insert(9);
t.display();
treenode node=find_kth_smallest(t.root,3);
System.out.println(node.data);
}
public static treenode find_kth_smallest(treenode node,int k)
{
if(node==null)
return null;
if(node.left_count==k-1)
return node;
else if(node.left_count>(k-1))
return find_kth_smallest(node.left,k);
else
return find_kth_smallest(node.left,k-node.left_count+1);
}
}