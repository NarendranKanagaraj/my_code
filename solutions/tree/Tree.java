package tree;
import queue.Queue;
import stack.Stack;
public class Tree
{
public treenode root;
boolean order=false;
public Tree()
{
root=null;
}
public Tree(String a)
{
root=null;
order=true;
}

public void insert(int a)
{
treenode node=new treenode();
node.data=a;
node.left=node.right=null;
root = insertInTree(root,node);
}

public treenode insertInTree(treenode node,treenode new_node)
{
if(node==null)
{
node=new_node;
return node;
}
if(new_node.data>node.data)
node.right=insertInTree(node.right,new_node);
else if(new_node.data<node.data)
{
if(order==true)
node.left_count+=1;
node.left=insertInTree(node.left,new_node);
}
return node;
}

public void delete(int a)
{
root = deleteInTree(root,a);
}

treenode deleteInTree(treenode node,int a)
{
if(node==null)
return null;
if(a<node.data)
node.left=deleteInTree(node.left,a);
else if(a>node.data)
node.right=deleteInTree(node.right,a);
else
{
if(node.left==null&&node.right==null)
node= null;
else if(node.left!=null&&node.right==null)
node= node.left;
else if(node.left==null&&node.right!=null)
node= node.right;
else
{
treenode temp=findmin(node.right);
node.data=temp.data;
node.right=deleteInTree(node.right,temp.data);
}
}
return node;
}

treenode findmin(treenode node)
{
treenode temp=node;
while(temp.left!=null)
temp=temp.left;
return temp;
}
public void display()
{
System.out.println("preorder:");
preorder(root);
System.out.println("\n");
System.out.println("inorder:");
inorder(root);
System.out.println("\n");
System.out.println("postorder:");
postorder(root);
System.out.println("\n");
System.out.println("breadth first:");
breadth_first();
System.out.println("");
if(order==true)
{
System.out.println("order statistics:");
disp_order_stat();
System.out.println("");
}
}

public void preorder(treenode node)
{
if(node==null)
return;
System.out.print(node.data+" ");
preorder(node.left);
preorder(node.right);
}
public void inorder(treenode node)
{
if(node==null)
return;
inorder(node.left);
System.out.print(node.data+" ");
inorder(node.right);
}
public void postorder(treenode node)
{
if(node==null)
return;
postorder(node.left);
postorder(node.right);
System.out.print(node.data+" ");
}

public void breadth_first()
{
Queue q=new Queue();
q.enqueue(root);
q.enqueue(null);
treenode node;
while(!q.isEmpty())
{
node=q.dequeue();
if(node==null)
{
System.out.println("");
if(!q.isEmpty())
q.enqueue(null);
}
else
{
System.out.print(node.data+" ");
if(node.left!=null)
q.enqueue(node.left);
if(node.right!=null)
q.enqueue(node.right);
}
}
}

public void disp_order_stat()
{
Queue q=new Queue();
q.enqueue(root);
q.enqueue(null);
treenode node;
while(!q.isEmpty())
{
node=q.dequeue();
if(node==null)
{
System.out.println("");
if(!q.isEmpty())
q.enqueue(null);
}
else
{
System.out.print(node.left_count+" ");
if(node.left!=null)
q.enqueue(node.left);
if(node.right!=null)
q.enqueue(node.right);
}
}
}

public void preorder_iter()
{
treenode current=root;
Stack s=new Stack();
boolean flag=true;
System.out.println("Preorder Iterative:");
while(flag)
{
if(current!=null)
{
s.push(current);
System.out.print(current.data+" ");
current=current.left;
}
else
{
if(s.isEmpty())
flag=false;
else
{
current=s.pop();
current=current.right;
}
}
}
System.out.println("");
}

public void inorder_iter()
{
treenode current=root;
Stack s=new Stack();
boolean flag=true;
System.out.println("Inorder Iterative:");
while(flag)
{
if(current!=null)
{
s.push(current);
current=current.left;
}
else
{
if(s.isEmpty())
flag=false;
else
{
current=s.pop();
System.out.print(current.data+" ");
current=current.right;
}
}
}
System.out.println("");
}

public void postorder_iter()
{
// use prev, curr and a stack. Also check if we are traversing up or down the tree
System.out.println("Postorder Iterative:");
treenode curr,prev=null;
Stack s=new Stack();
s.push(root);
while(!s.isEmpty())
{
curr=s.peek();
if(prev==null||prev.left==curr||prev.right==curr)
{
if(curr.left!=null)
s.push(curr.left);
else if(curr.right!=null)
s.push(curr.right);
else
{
System.out.print(curr.data+" ");
s.pop();
}
}
else if(curr.left==prev)
{
if(curr.right!=null)
s.push(curr.right);
else
{
System.out.print(curr.data+" ");
s.pop();
}
}
else if(curr.right==prev)
{
System.out.print(curr.data+" ");
s.pop();
}
prev=curr;
}
System.out.println("");
}

public void height()
{
System.out.println("Height:");
System.out.println(find_height(root));
}

public void isBalanced()
{
if(isBalancedTree(root))
System.out.println("Balanced");
else
System.out.println("Not Balanced");
}

int find_height(treenode node)
{
if(node==null)
return 0;
if(node.left==null&&node.right==null)
return 1;
return 1+Math.max(find_height(node.left),find_height(node.right));
}
boolean isBalancedTree(treenode node)
{
return (maxdepth(root)-mindepth(root)<=1);
}

int maxdepth(treenode node)
{
if(node==null)
return 0;
if(node.left==null&&node.right==null)
return 1;
return 1+Math.max(maxdepth(node.left),maxdepth(node.right));
}
int mindepth(treenode node)
{
if(node==null)
return 0;
if(node.left==null&&node.right==null)
return 1;
return 1+Math.min(mindepth(node.left),mindepth(node.right));
}


}