import tree.*;
import java.util.*;
class tree_path_sum
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
find_path_with_sum(t.root,9,new ArrayList());
}

public static void find_path_with_sum(treenode node,int sum,ArrayList l)
{
if(node==null)
return;
l.add(node.data);
int temp=sum;
for(int i=l.size()-1;i>=0;i--)
{
temp=temp-(Integer)l.get(i);
if(temp==0)
{
display(l,i);
}
}
find_path_with_sum(node.left,sum,l);
find_path_with_sum(node.right,sum,l);
}

public static void display(ArrayList l,int i)
{
System.out.print("[ ");
for(int j=i;j<l.size();j++)
{
System.out.print(l.get(j)+" ");
}
System.out.println("]");
}
}