package fizzbuzz;

public class ConsoleBasedFizzBuzz implements FizzBuzz {
    @Override
    public void print(int from, int to) {

        while (from <= to) {

            if (from % 3 == 0 && from % 5 == 0) {

                System.out.println("FizzBuzz");

            } else if (from%3==0) {

                System.out.println("Fizz");

            } else if (from%5==0) {

                System.out.println("Buzz");

            } else {

                System.out.println(from);

            }

            from++;
        }
    }

    public void print2(int from, int to) {
        int[] numbers = {15,5,3};

        while (from <= to) {
            if (esMultiplo(from, numbers[0])) {
                System.out.println("FizzBuzz");
            } else if (esMultiplo(from, numbers[1])) {
                System.out.println("Buzz");
            } else if (esMultiplo(from, numbers[2])) {
                System.out.println("Fizz");
            } else {
                System.out.println(from);
            }
            from++;
        }
    }

    private boolean esMultiplo(int num, int multiplo) {
        return num%multiplo==0;
    }
}
