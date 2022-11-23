// Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
package task_1;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        System.out.println("Введите n");
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        scan.close();

        int t;
        t = n/2*(n+1);

        System.out.println(t); 
    }
}
