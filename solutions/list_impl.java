import list.linked_list;
class list_impl
{
public static void main(String args[])
{
linked_list l=new linked_list();
l.insert_end(1);
l.insert_end(2);
l.insert_end(3);
l.insert_end(4);
l.insert_end(5);
l.display();
System.out.println(l.find(4));
l.delete(4);
l.display();
System.out.println(l.find(4));
l.delete(1);
l.display();
l.delete(5);
l.display();
}
}