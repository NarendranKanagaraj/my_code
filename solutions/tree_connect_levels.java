import tree.*;
import queue.*;
class tree_connect_levels
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
t.display();
t.root=connect_levels(t.root);
display(t.root);
}
public static treenode connect_levels(treenode root)
{
Queue q=new Queue();
q.enqueue(root);
q.enqueue(null);
treenode prev=null,curr;
while(!q.isEmpty())
{
treenode node=q.dequeue();
curr=node;
if(prev!=null)
prev.nextRight=curr;
if(node==null)
{
if(!q.isEmpty())
q.enqueue(null);
}
else
{
if(node.left!=null)
q.enqueue(node.left);
if(node.right!=null)
q.enqueue(node.right);
}
prev=curr;
}
return root;
}

public static void display(treenode root)
{
if(root==null)
return;
display(root.left);
System.out.println(root.data+" "+(root.nextRight==null?"null":root.nextRight.data));
display(root.right);
}
}