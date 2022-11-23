// Реализовать простой калькулятор
package task_3;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите первое число");
        int firstNumber = Integer.parseInt(scan.nextLine());
        System.out.println("Введите второе число");
        int secondNumber = Integer.parseInt(scan.nextLine());
        System.out.println("Введите операцию");
        String operation = scan.nextLine();
        scan.close();

        if (operation.equals("+")) {
            System.out.print("Результат: ");
            System.out.println(firstNumber + secondNumber);
        } else if (operation.equals("-")) {
            System.out.print("Результат: ");
            System.out.println(firstNumber - secondNumber);
        } else if (operation.equals("*")) {
            System.out.print("Результат: ");
            System.out.println(firstNumber * secondNumber);
        } else if (operation.equals("/")) {
            System.out.print("Результат: ");
            System.out.println(firstNumber / secondNumber);
        }
    }
}
