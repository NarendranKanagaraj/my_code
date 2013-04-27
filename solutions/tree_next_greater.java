import tree.*;
class tree_next_greater
{
public static treenode prev=null;
public static void main(String args[])
{
Tree t1=new Tree();
t1.insert(6);
t1.insert(2);
t1.insert(8);
t1.insert(1);
t1.insert(3);
t1.insert(7);
t1.insert(9);
t1.display();
System.out.println(find_next_greater(t1.root,7));
}

public static int find_next_greater(treenode node,int num)
{
if(node==null)
return prev.data;
if(prev==null&&node.data>num)
prev=node;
else if((node.data>num)&&(node.data<prev.data))
prev=node;
if(node.data>num)
return find_next_greater(node.left,num);
else
return find_next_greater(node.right,num);
} 
}