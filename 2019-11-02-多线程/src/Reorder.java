public class Reorder {
    private static int a0 = 0;
    private static int a1 = 0;
    private static int a2 = 0;
    private static int a3 = 0;
    private static int a4 = 0;
    private static int a5 = 0;
    private static int a6 = 0;
    private static int a7 = 0;
    private static int a8 = 0;
    private static int a9 = 0;
    private static int a10 = 0;
    private static int a11 = 0;
    private static int a12 = 0;
    private static int a13 = 0;
    private static int a14 = 0;
    private static int a15 = 0;
    private static int a16 = 0;
    private static int a17 = 0;
    private static int a18 = 0;
    private static int a19 = 0;
    private static int a20 = 0;
    private static int a21 = 0;
    private static class Set extends Thread {
        @Override
        public void run() {
           a0 = 1;
           a1 = 2;
           a2 = 3;
           a3 = 4;
           a4 = 5;
           a5 = 6;
           a6 = 7;
           a7 = 8;
           a8 = 9;
           a9 = 10;
           a10 = 11;
           a11 = 12;
           a12 = 13;
           a13 = 14;
           a14 = 15;
           a15 = 16;
           a16 = 17;
           a17 = 18;
           a18 = 19;
           a19 = 20;
           a20 = 21;
           a21 = 22;
        }
    }
    private static class Print extends Thread {
        @Override
        public void run() {
           System.out.println(a0);
           System.out.println(a1);
           System.out.println(a2);
           System.out.println(a3);
           System.out.println(a4);
           System.out.println(a5);
           System.out.println(a6);
           System.out.println(a7);
           System.out.println(a8);
           System.out.println(a9);
           System.out.println(a10);
           System.out.println(a11);
           System.out.println(a12);
           System.out.println(a13);
           System.out.println(a14);
           System.out.println(a15);
           System.out.println(a16);
           System.out.println(a17);
           System.out.println(a18);
           System.out.println(a19);
           System.out.println(a20);
           System.out.println(a21);
        }
    }

    public static void main(String[] args) {
        Thread t1 = new Set();
        Thread t2 = new Print();
        t1.start();
        t2.start();
    }
}
