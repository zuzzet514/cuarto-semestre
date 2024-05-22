public class Ejercicio1 {
    public static void print1To100() {

        for (int i = 1; i <= 100; i++) {

            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i%3==0) {
                System.out.println("Fizz");
            } else if (i%5==0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args) {

        //print1To100();
        int number = 1;
        int max = 100;

        while (number <= max){

            FizzBuzz(number);
            number++;

        }

    }
    public static void FizzBuzz(int number){

        if (number % 3 == 0 && number % 5 == 0) {
            System.out.println("FizzBuzz");
            return;
        }
        if (number%3==0) {
            System.out.println("Fizz");
            return;
        }
        if (number%5==0) {
            System.out.println("Buzz");
            return;
        }
        System.out.println(number);

    }
}
