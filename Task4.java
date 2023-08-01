package Task4;

// Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку. Пользователю должно
// показаться сообщение, что пустые строки вводить нельзя.

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите строку: ");
            String userInput = scanner.nextLine().trim();
            if (userInput.isEmpty()) {
                System.out.println("Введена пустая строка");
            } else {
                System.out.println("Введено: " + userInput);
                break;
            }
        }
    }
}
