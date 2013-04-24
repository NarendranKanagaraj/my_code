import tree.*;
import java.util.*;
class vertical_sum
{
static HashMap h;
public static void main(String args[])
{
Tree t=new Tree();

t.insert(6);
t.insert(4);
t.insert(3);
t.insert(5);
t.insert(8);
t.insert(7);
t.insert(9);
h=new HashMap();
find_vertical_sum(t.root,0);
System.out.println(h);
}

public static void find_vertical_sum(treenode node,int dist)
{
if(node==null)
return;
find_vertical_sum(node.left,dist-1);
int sum=node.data;
if(h.containsKey(dist))
sum+=(Integer)h.get(dist);
h.put(dist,sum);
find_vertical_sum(node.right,dist+1);
} 
}