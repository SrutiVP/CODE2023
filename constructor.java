class cons1
{
    
    int a,b,c,d,e,sum,pro;
    
    
    cons1() // default constructor
    {
        sum = 0;
        
    }
    
    cons1 (int x, int y)
    {
        a=x;
        b=y;
    }
    
    cons1 (int p, int q , int r)
    {
        c=p;
        d=q;
        e=r;
    }
    
    void cal1()
    {
        sum = a+b;
        System.out.println("sum is:"+sum);
    }
    
    void cal2()
    {
        pro = c*d*e ;
        System.out.println("product is:"+pro);
    }
    
    public static void main(String[]args)
    {
        cons1 obj1 = new cons1(10,5);
        
        cons1 obj2 = new cons1(3,4,5);
        
        obj1.cal1();
        obj2.cal2();
        
        
    }
    
}