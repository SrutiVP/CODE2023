class thread implements Runnable {

    
    public static void main(String[] args) {
        try
        {
            thread tt=new thread();
        Thread t2=new Thread(tt);
        Thread t=new Thread(tt);
      
        t.setName("INDIA");
       t2.setName("ENGLAND");
        t.start();
        t2.start();
      
        //t.setPriority(2);
        //t2.setPriority(9);
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getName());
        }
        catch(Exception e)
        {
            
        }
            
        
        // TODO code application logic here
        
    }
    public void run()
    {
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getName());
    }
}
// we can create threads in two ways
// 1) by extending Thread class
// 2)by implementing runnable interface
