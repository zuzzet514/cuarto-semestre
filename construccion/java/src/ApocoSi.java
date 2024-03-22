public class ApocoSi {
    public static void main(String[] args) {
        sorting(2,3,1);

    }

    public static void sorting(int a, int b, int c) {
        int[] numbers = {a, b, c};
        int temp;

        for (int j = 0; j < numbers.length; j++) {
            for (int i = 0; i < numbers.length -1; i++) {
                if (numbers[i] > numbers[i + 1]) {
                    temp = numbers[i + 1];
                    numbers[i + 1] = numbers[i];
                    numbers[i] = temp;
                }
            }
        }

        for (int i : numbers) {
            System.out.println(i);
        }
    }
}
