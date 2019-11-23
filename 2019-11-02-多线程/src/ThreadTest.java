class TfTest
{
    private int data;
    int result = 0;
    public void m()
    {
        result += 2;
        data += 2;
        System.out.print(result + " " + data);
        System.out.println();
    }
}
class ThreadExample extends Thread
{
    private TfTest mv;
    public ThreadExample(TfTest mv)
    {
        this.mv = mv;
    }
    public void run()
    {
        synchronized(mv)
        {
            mv.m();
        }
    }
}
public class ThreadTest
{
    public static void main(String args[])
    {
        TfTest mv = new TfTest();
        Thread t1 = new ThreadExample(mv);
        Thread t2 = new ThreadExample(mv);
        Thread t3 = new ThreadExample(mv);
        t1.start();
        t2.start();
        t3.start();
    }
}
