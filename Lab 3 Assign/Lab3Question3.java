public class Lab3Question3
 {

    public static void main(String[] args) {
        displayTotalArguments(10, 20, 30, 40);

        int maxNumber = findMaximum(15, 8, 25, 4, 18);
        System.out.println("Maximum number: " + maxNumber);

        int sum = calculateSum(5, 10, 15, 20);
        System.out.println("Sum of elements: " + sum);

        checkDifferentTypes("Hello", 42, 3.14, true);
    }

    private static void displayTotalArguments(int... numbers) {
        System.out.println("Total number of arguments: " + numbers.length);
    }

    private static int findMaximum(int... numbers) {
        if (numbers.length == 0) {
            throw new IllegalArgumentException("No numbers provided");
        }

        int max = numbers[0];
        for (int num : numbers) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    private static int calculateSum(int... numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum;
    }

    private static void checkDifferentTypes(Object... args) {
        System.out.println("Number of arguments with different types: " + args.length);
        for (Object arg : args) {
            System.out.println("Type: " + arg.getClass().getSimpleName() + ", Value: " + arg);
        }
    }
}
