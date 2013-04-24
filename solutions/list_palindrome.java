import list.*;
class list_palindrome
{
static int count;
static boolean check_rec=true;
static single_node head;
public static void main(String args[])
{
linked_list l1=new linked_list();
single_node head=l1.head;
l1.insert_end(1);


l1.display();
System.out.println(check_palindrome_iter(l1));
check_palindrome_rec(l1);
System.out.println(check_rec);
}
public static boolean check_palindrome_iter(linked_list l)
{
single_node middle=findMiddle(l);
System.out.println(middle.data);
System.out.println(count);
if(middle.next==null)
return true;
reverseList(null,middle.next.next,middle.next);
l.display();
boolean check;
if(count<2)
check=check(l.head,middle.next);
else
check=check(l.head,middle.next.next);
reverseList(null,middle.next.next,middle.next);
l.display();
return check;
}


public static single_node findMiddle(linked_list l)
{
count=0;
return findMiddle_helper(l);
}

public static single_node findMiddle_helper(linked_list l)
{
single_node temp,temp1,temp2;
temp=temp1=temp2=l.head;

if(temp==null)
return null;
count=1;
while(temp.next!=null&&temp.next.next!=null)
{
temp=temp.next.next;
temp2=temp1;
temp1=temp1.next;
count=count+2;
}
return temp2;
}



public static void reverseList(single_node node1,single_node node2,single_node middle)
{
if(node2==null)
{
return;
}
reverseList(node2,node2.next,middle);
if(node2.next==null)
middle.next=node2;
node2.next=node1;
}

public static boolean check(single_node node,single_node node1)
{
while(node1!=null)
{
if(node.data!=node1.data)
return false;
node=node.next;
node1=node1.next;
}
return true;

} 

public static void check_palindrome_rec(linked_list l)
{
count=0;
head=l.head;
check_palindrome_rec_helper(l.head,1);
}

public static void check_palindrome_rec_helper(single_node node,int temp_count)
{
if(node==null)
{
if(count%2==0)
count=(temp_count)/2+1;
else
count=(temp_count+1)/2+1;
System.out.println(count);
return;
}
check_palindrome_rec_helper(node.next,temp_count+1);
if(temp_count>=count)
{
System.out.println(node.data+" "+head.data);
if(node.data!=head.data)
{
check_rec=false;
count=temp_count+1;
}
head=head.next;
}

}
}