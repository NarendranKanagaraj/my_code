import tree.*;
class create_ancestor_matrix
{
public static void main(String args[])
{
Tree t1=new Tree();
t1.insert(4);
t1.insert(2);
t1.insert(1);
t1.insert(3);
t1.insert(6);
t1.insert(5);
t1.insert(7);
t1.display();
int[][] a=new int[7][7];
int[] temp=new int[7];
create_matrix(t1.root,a,temp,0);
for(int i=0;i<7;i++)
{
for(int j=0;j<7;j++)
{
System.out.print(a[i][j]+" ");
}
System.out.println("");
}
}

public static void create_matrix(treenode node,int[][] a,int[] temp,int index)
{
if(node==null)
return;
for(int i=index-1;i>=0;i--)
a[node.data-1][temp[i]-1]=1;
temp[index]=node.data;
create_matrix(node.left,a,temp,index+1);
create_matrix(node.right,a,temp,index+1);
} 
}