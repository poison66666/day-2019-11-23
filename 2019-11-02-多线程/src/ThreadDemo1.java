public class ThreadDemo1 {
    private static class MyThread extends Thread {
        @Override
        public void run() {
            while (true){
                System.out.println("我在method2中打印");
                try {
                    //进程会暂停运行1秒
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    private static void method2() {
        Thread thread = new MyThread();
        thread.start();
    }

    public static void main(String[] args) throws InterruptedException {
        //两个死循环可以同时开始执行，没有一个卡住另一个的情况
        method2();
        //只能执行method1中循环
        method1();
        while(true){
            System.out.println("我在main中打印");
            Thread.sleep(1000);
        }
    }

    private static void method1() throws InterruptedException {
        while (true){
            System.out.println("我在method1中打印");
            Thread.sleep(1000);
        }
    }
}
