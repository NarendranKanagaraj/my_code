package queue;
import tree.treenode;
public class Queue
{
treenode[] queue;
int front=0,rear=0;
int n;
int size=0;

public Queue()
{
n=20;
queue=new treenode[n];
}

public Queue(int j)
{
n=j;
queue=new treenode[n];
}

public void enqueue(treenode no)
{
if(size==n)
System.out.println("queue full");
else
{
queue[(rear++)%n]=no;
size++;
}
}

public treenode dequeue()
{
if(size==0)
return null;
else
{
size--;
return (queue[(front++)%n]);
}
}

public void display()
{
System.out.print("[ ");
for(int i=0;i<n;i++)
System.out.print(queue[i]+" ");
System.out.println("]");
}
public boolean isEmpty()
{
return (size==0);
}
}