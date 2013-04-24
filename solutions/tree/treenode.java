package tree;

public class treenode
{
public int data;
public treenode left;
public treenode right;
//For order statistics
public int left_count=0;
//For pointer which points to right node in the same level
public treenode nextRight;
}