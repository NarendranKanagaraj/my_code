import list.*;
class zig_zag
{
public static void main(String args[])
{
linked_list l1=new linked_list();
linked_list l2=new linked_list();
linked_list l3=new linked_list();
l1.insert_end(1);
l1.insert_end(3);
l1.insert_end(5);
l1.insert_end(7);
l2.insert_end(2);
l2.insert_end(4);
l2.insert_end(6);
l2.insert_end(8);
l1.display();
l2.display();
merge(l1.head,l2.head,l3,0);
l3.display();
merge1(l1.head,l2.head);
l1.display();
}
//create new merged list
public static void merge(single_node node1,single_node node2,linked_list list3,int flag)
{
if(node1==null&&node2==null)
return;
if(node1==null&&node2!=null)
{
list3.insert_end(node2.data);
merge(node1,node2.next,list3,flag);
}
else if(node1!=null&&node2==null)
{
list3.insert_end(node1.data);
merge(node1.next,node2,list3,flag);
}
else
{
if(flag==0)
{
list3.insert_end(node1.data);
merge(node1.next,node2,list3,1);
}
else
{
list3.insert_end(node2.data);
merge(node1,node2.next,list3,0);
}
}
}
//modify list 1
public static void merge1(single_node node1,single_node node2)
{
if(node2==null)
return;
if(node1==null&&node2!=null)
{
merge1(node1,node2.next);
node1=node2;
node2.next=null;
}
else
{
merge1(node1.next,node2.next);
single_node temp=node1.next;
node1.next=node2;
node2.next=temp;
}
}
}