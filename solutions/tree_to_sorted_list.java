import tree.*;
class tree_to_sorted_list
{
static treenode prev=null,head;
public static void main(String args[])
{
Tree t=new Tree();

t.insert(6);
t.insert(4);
t.insert(5);
t.insert(3);
t.insert(8);
t.insert(7);
t.insert(9);
create_list(t.root);
display(head);
}

public static void create_list(treenode node)
{
if(node==null)
return;
create_list(node.left);
if(prev!=null)
{
prev.right=node;
}
else
{
head=node;
}
prev=node;
create_list(node.right);
} 

public static void display(treenode root)
{
treenode node=root;
System.out.print("[ ");
while(node!=null)
{
System.out.print(node.data+" ");
node=node.right;
}
System.out.println("]");
}
}