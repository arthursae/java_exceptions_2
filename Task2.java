package Task2;

// Если необходимо, исправьте данный код (задание 2 https://docs.google.com/document/d/17EaA1lDxzD5YigQ5OAal60fOFKVoCbEJqooB9XfhT7w/edit)

public class Task2 {
    public static void main(String[] args) {
        Integer[] intArray = new Integer[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int d = 0;
        double result = (double) intArray[8] / d;
        if (Double.isInfinite(result)) {
            System.out.println("Division by zero not allowed");
        } else {
            System.out.println("Result = " + result);
        }
    }
}
