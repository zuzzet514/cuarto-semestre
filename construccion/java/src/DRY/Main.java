package DRY;

public class Main {
    public static void main(String[] args) {
        MyDate myDate1 = new MyDate();

        myDate1.setYear(2004);
        myDate1.setMonth(6);
        myDate1.setDay(14);
        myDate1.setEra("A.D");
        myDate1.setDayOfTheWeek(3);

        System.out.println(myDate1);
    }
}
