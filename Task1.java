package Task1;

// Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), и возвращает введенное
// значение. Ввод текста вместо числа не должно приводить к падению приложения, вместо этого, необходимо повторно
// запросить у пользователя ввод данных.

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите дробное число (типа Float): ");
            try {
                float userInput = scanner.nextFloat();
                System.out.println("Введено: " + userInput);
                break;
            } catch (InputMismatchException e) {
                System.out.println("Введено неправильное дробное число!");
            }
        }
    }
}
