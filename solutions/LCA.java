import tree.*;
class LCA
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
treenode node=find_LCA(t.root,1,2);
System.out.println(node.data);
}

public static treenode find_LCA(treenode node,int p,int q)
{
if(node==null)
return null;
if(node.data==p||node.data==q)
return node;
treenode left=find_LCA(node.left,p,q);
treenode right=find_LCA(node.right,p,q);
if(left!=null&&right!=null)
return node;
return left==null?right:left;
}
}