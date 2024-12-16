class Test{
static int i=10;
public static void main(String[] args)
{
System.out.println(i);
Test t=new Test();
System.out.println(t.i);
t.methodone();
}
public void methodone()
{
int i=9;
System.out.println(i);
}
}
