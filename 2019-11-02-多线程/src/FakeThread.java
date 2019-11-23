public class FakeThread {
    private boolean interruptStatus = false;

    public void interrupt(){
        if(/*对象的关联线程正在sleep*/true){
            interruptStatus = false;
        }
        interruptStatus = true;
    }

    public boolean isInterrupted(){
        return interruptStatus;
    }

    public static boolean interrupted(){
        return false;
    }
}
