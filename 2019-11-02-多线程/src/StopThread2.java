public class StopThread2 {
    private static class Worker extends Thread {
        Worker(){
            super("李四");
        }

        @Override
        public void run() {
            while (true){
                //重置
                //System.out.println(Thread.interrupted());
                //不变
                System.out.println(this.isInterrupted());
            }
        }
    }

    public static void main(String[] args) {
        Worker worker = new Worker();
        worker.start();
        worker.interrupt();
    }
}
