import tree.*;
class check_if_bst
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
t.root.left.left.data=10;
t.display();
System.out.println(check(t.root,Integer.MIN_VALUE,Integer.MAX_VALUE));
}

public static boolean check(treenode node,int min,int max)
{
if(node==null)
return true;
if(node.data>min&&node.data<max)
{
return check(node.left,min,node.data)&&check(node.right,node.data,max);
}
else
return false;
}
}