public class Lab3Question5 {

    public static void main(String[] args) {
        int[] numbers = { 23, 56, 12, 78, 41 };

        int sum = calculateSum(numbers);

        displaySumInReverse(sum);
    }

    private static int calculateSum(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }

    private static void displaySumInReverse(int number) {
        System.out.print("Sum in reverse order: ");
        String reversedSum = new StringBuilder(String.valueOf(number)).reverse().toString();
        int reversedNumber = Integer.parseInt(reversedSum);
        System.out.println(reversedNumber);
    }
}
