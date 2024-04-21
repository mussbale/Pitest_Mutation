package mathOperations;

public class Calculator {
    private StringUtil stringUtil = new StringUtil();

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        return a / b;
    }

    public boolean isPalindrome(String str) {
        return stringUtil.isPalindrome(str);
    }

    public int sumOfNumbers(int[] numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum;
    }

    public int factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Factorial not defined for negative numbers");
        }
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}