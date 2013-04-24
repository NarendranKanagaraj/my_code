package stack;
import tree.treenode;
public class Stack
{
int top=-1,n;
treenode[] stack;
public Stack()
{
n=20;
stack=new treenode[n];
}
public Stack(int j)
{
n=j;
stack=new treenode[n];
}
public void push(treenode no)
{
      if(top==n-1)
	  System.out.println("Stack full");
	  else
	  stack[++top]=no;
}
public treenode pop()
{
      if(top<0)
	  return null;
	  else
	  return stack[top--];
}
public treenode peek()
{
      if(top<0)
	  return null;
	  else
	  return(stack[top]);
}
public void display() 
{
	  System.out.print("[ ");
	  for(int i=top;i>=0;i--)
	  System.out.print(stack[i].data+" ");
	  System.out.print("]\n");
}
public boolean isEmpty()
{
return(top==-1);
}
public boolean isFull()
{
return(top==n-1);
}
}