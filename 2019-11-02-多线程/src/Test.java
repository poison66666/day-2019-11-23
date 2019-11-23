public class Test {
    private static class MyThread extends Thread{
        private int count = 100_0000;
        @Override
        public void run() {
            long sum = 0;
            for(int i = 1;i<=count;i++) {
                sum += i;
            }
            System.out.println("MyThread:"+sum);
        }
    }
    private static class MyThread1 extends Thread{
        private int count = 100_0001;
        @Override
        public void run() {
            long sum = 0;
            for(int i = 1;i<=count;i+=2){
                sum+=i;
            }
            System.out.println("MyThread1:"+sum);
        }
    }
    private static class MyThread2 extends Thread{
        private int count =10_0000;
        @Override
        public void run() {
            long sum = 0;
            for(int i = 1;i<=count;i++){
                sum+=(i*i);
            }
            System.out.println("MyThread2:"+sum);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        long begin = System.currentTimeMillis();
        Thread thread1 = new MyThread();
        Thread thread2 = new MyThread1();
        Thread thread3 = new MyThread2();
        thread1.start();
        thread2.start();
        thread3.start();
        thread1.join();
        thread2.join();
        thread3.join();
        long end = System.currentTimeMillis();
        System.out.println((end - begin)*1.0/1000);
    }
}
