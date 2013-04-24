import tree.*;
import java.util.*;
class sum_two_k
{
static HashMap m;
public static void main(String args[])
{
m= new HashMap();
Tree t=new Tree();
t.insert(6);
t.insert(3);
t.insert(2);
t.insert(4);
t.insert(8);
t.insert(7);
t.insert(9);
t.display();
find_two_sum_k(t.root,6);
}

public static void find_two_sum_k(treenode node,int k)
{
if(node==null)
return;
if(node.data>k)
find_two_sum_k(node.left,k);
else
{
if(m.containsKey(k-node.data))
System.out.println(node.data+" "+(k-node.data));
else
m.put(node.data,1);
find_two_sum_k(node.left,k);
find_two_sum_k(node.right,k);
}
return;
}
}