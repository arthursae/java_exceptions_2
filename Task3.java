package Task3;

// Дан следующий код, исправьте его там, где требуется
// (задание 3 https://docs.google.com/document/d/17EaA1lDxzD5YigQ5OAal60fOFKVoCbEJqooB9XfhT7w/edit)

import java.util.InputMismatchException;

public class Task3 {
    public static void main(String[] args) {
        int a = 90;
        int b = 3;
        int[] abc = new int[]{1, 2};
        try {
            System.out.println(a / b);
            printSum(23, 234);
            abc[3] = 9;
        } catch (ArithmeticException ex) {
            System.out.println("Деление на ноль!");
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        } catch (Throwable ex) {
            System.out.println("Что-то пошло не так...");
        }
    }

    private static void printSum(int a, int b) {
        System.out.println(a + b);
    }
}
