class calculator 
{
    int n1,n2;
    int add(int x,int y)
    {
    n1=x;
    n2=y;
    return n1+n2;
    }
     int sub(int x,int y)
    {
    n1=x;
    n2=y;
    return n1-n2;
    }
}

public class MyClass {
    public static void main(String args[])
    {
    calculator obj = new calculator();
    int result = obj.add(10,20);
    System.out.println("the sum of" + result);
    result =obj.add(10,40);
    System.out.println("the sub of" + result);
    }
}