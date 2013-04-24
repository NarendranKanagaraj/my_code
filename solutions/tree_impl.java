import tree.*; 
class tree_impl
{
public static void main(String args[])
{
Tree t=new Tree();
t.insert(6);
t.insert(2);
t.insert(8);
t.insert(1);
t.insert(3);
t.insert(7);
t.insert(9);
t.breadth_first();
t.delete(9);
t.breadth_first();
t.delete(8);
t.breadth_first();
t.delete(6);
t.breadth_first();
t.preorder_iter();
t.inorder_iter();
t.postorder_iter();
t.breadth_first();
t.height();
t.isBalanced();
}
}