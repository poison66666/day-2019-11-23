public class JoinDemo3 {
    private static class MyThread extends Thread {
        @Override
        public void run() {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        /*for(Thread.State state : Thread.State.values()){
            System.out.println(state);
        }*/
        Thread thread = new MyThread();
        //System.out.println(thread.getState());  //NEW
        System.out.println("---------------");
        thread.start();
        while (thread.isAlive()){
            //System.out.println(thread.getState());  //TIMEWAITING / RUNNABLE 之间互相转换
        }
        System.out.println("--------------");
        System.out.println(thread.getState());  //TERMINATED
    }
}
