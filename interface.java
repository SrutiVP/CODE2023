import java.io.*;
interface Grandf
{
    int p=100;
	void print();
}
interface father
{
	int q=90;
	void show();
}
class Q12 implements Grandf,father
{
	public void print() 
	{
		System.out.println("property of grandf:"+p);
	}
	public void show()
	{
		System.out.println("property of father:"+q);
	}  
	public static void main(String []args)
	{
	Q12 obj = new Q12();  
	obj.print();  
	obj.show();  
	}  
}
