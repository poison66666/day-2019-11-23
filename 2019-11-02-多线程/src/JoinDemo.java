public class JoinDemo {
    private static class PrinterA implements Runnable {
        @Override
        public void run() {
            while(true){
                System.out.println("A");
                Thread.yield();
            }
        }
    }
    private static class PrinterB implements Runnable{
        @Override
        public void run() {
            while (true){
                System.out.println("B");
            }
        }
    }
    public static void main(String[] args) {
        Thread A = new Thread(new PrinterA());
        Thread B = new Thread(new PrinterB());
        A.start();
        B.start();
    }
}
