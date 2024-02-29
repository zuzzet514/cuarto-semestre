package leapyearalgorithm;

public class LeapYear {
    public static void main(String[] args) {
        System.out.println(isALeapYear(2024) + "\n" + isALeapYear(1904) + "\n" + isALeapYear(1988) + "\n" + isALeapYear(2001));
    }
    public static boolean isALeapYear(int year) {
        return (year % 4 == 0) && (!(year % 100 ==0) || (year % 400 == 0));
    }
}

