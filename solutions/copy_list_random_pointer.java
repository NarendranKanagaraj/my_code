import tree.*;
import java.util.*;
class copy_list_random_pointer
{
public static void main(String args[])
{
// use tree as linked list with next and random pointer. left is random pointer and right is next pointer
Tree t=new Tree();
t.root=create_list(t);
display_list(t.root);
treenode copy=copy_list(t.root);
display_list(copy);
}

public static treenode copy_list(treenode root)
{
HashMap m=new HashMap();
treenode link=null,copy_root=null;
treenode temp=root;
while(temp!=null)
{
treenode copy_node=new treenode();
copy_node.data=temp.data;
if(copy_root==null)
copy_root=copy_node;
else
link.right=copy_node;
m.put(temp,copy_node);
link=copy_node;
temp=temp.right;
}
temp=root;
while(temp!=null)
{
treenode node1=(treenode)m.get(temp);
treenode node2=(treenode)m.get(temp.left);
node1.left=node2;
temp=temp.right;
}
return copy_root;
}

public static treenode create_list(Tree t)
{
t.insert(1);
t.insert(2);
t.insert(3);
t.insert(4);
t.insert(5);
t.insert(6);
t.insert(7);

treenode link=t.root;
int[] a={3,1,4,6,2,7,5};
for(int i=0;i<7;i++)
{
treenode temp=t.root;
for(int j=1;j<a[i];j++)
temp=temp.right;
link.left=temp;
link=link.right;
}
return t.root;
} 

public static void display_list(treenode node)
{
treenode temp=node;
System.out.println("Next data|Random data");
while(temp!=null)
{
System.out.println(temp.data+" "+temp.left.data);
temp=temp.right;
}
}
}
