package lang.print.gaps.task5;

public class TimeConvertor {
    public static void convert(float minutes) {
        System.out.println(minutes + " minutes = " + (minutes*60) + " seconds");
    }
    public static void main(String[] args) {
        convert(12);
    }
}
