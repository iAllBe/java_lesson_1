// Вывести все простые числа от 1 до 1000
package task_2;

public class task2 {
    public static void main(String[] args) {
        int count = 0;

        for (int i = 2; i <= 1000; i++) {
            if (i == 2) {
                System.out.println(2);
                continue;
            }
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count == 0) {
                System.out.println(i);
            }
            count = 0;
        }
    }
}
