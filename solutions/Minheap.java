package heap;

class Heap
{
int[] heap;
String type="min";
public Heap()
{
heap=new int[20];
}

public Heap(int n)
{
heap=new int[n];
}
public Heap(String type)
{
type=type;
}

public Heap(int n,String type)
{
heap=new int[n];
type=type;
}

public void insert(int a)
{

}

}