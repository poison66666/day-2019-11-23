public class ThreadFileds {
    private static class MyRunnable implements Runnable{

        @Override
        public void run() {
            Thread current = Thread.currentThread();
            System.out.println(current.getId());
            System.out.println(current.getName());
            System.out.println(current.getPriority());
            System.out.println(current.getState());
            System.out.println(current.isAlive());
            /*
            Runnable无isInterrupted()和isDaemon()方法
            System.out.println(this.isInterrupted());
            System.out.println(this.isDaemon());
             */
        }
    }

    private static class MyThread extends Thread {
        @Override
        public void run() {
            Thread current = Thread.currentThread();
            System.out.println(current.getId());
            System.out.println(current.getName());
            System.out.println(current.getPriority());
            System.out.println(current.getState());
            System.out.println(current.isAlive());
            //Thread中有以下两种方法
            System.out.println(this.isInterrupted());
            System.out.println(this.isDaemon());
        }
    }

    public static void main(String[] args) {
        new MyThread().start();
        Thread thread = new Thread(new MyRunnable());
        thread.start();
    }
}
