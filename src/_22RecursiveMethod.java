public class _22RecursiveMethod {
    public static void main(String[] args) {
        int number = 7;
        long result = factorial(number);
        System.out.println("Factorial of " + number + " is " + result);

        number = 5;
        long resultRecursive = factorialRecursive(number);
        System.out.println("Factorial of " + number + " is " + resultRecursive);
    }

    static int factorial (int value){
        var result = 1;
        for (int i = 1; i <= value; i++) {
            result *= i;
        }
        return result;
    }

    static int factorialRecursive(int value){
        if (value == 1){
            return 1;
        }else {
            return value*factorialRecursive(value-1);
        }
    }
}
