public class JoinDemo2 {
    private enum Week {
        MON,TUE,WED,THU,FRI,SAT,SUN
    }

    public static void main(String[] args) {
        for(Week week:Week.values()){
            System.out.println(week);
        }
    }
}
