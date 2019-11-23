public class StartOrRun {
    private static class MyThread extends Thread {
        @Override
        public void run() {
            while (true){
                System.out.println("MyThread");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread t = new MyThread();
        t.start();
        //t.run();不要调用run
        while (true){
            System.out.println("main");
            Thread.sleep(1000);
        }
    }
}
