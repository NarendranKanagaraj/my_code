import list.*;
import java.io.*;
class kth_from_last
{
static int count;
public static void main(String args[]) throws Exception
{
linked_list l=new linked_list();
l.insert_end(1);
l.insert_end(2);
l.insert_end(3);
l.insert_end(4);
l.insert_end(5);
l.insert_end(6);
System.out.println("Enter k:");
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int k=Integer.parseInt(br.readLine());
single_node node=find_kth(l.head,k,0);
System.out.println(node.data);
}

public static single_node find_kth(single_node node,int k,int node_count)
{
if(node==null)
{
count=node_count-k;
return null;
}
single_node ans=find_kth(node.next,k,node_count+1);
if(count==node_count)
{
return node;
}
return single_node;
}
}