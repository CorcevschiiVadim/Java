import java.util.Scanner;
public class number15 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        try {
            System.out.println("Введите первое число:");
            int a = in.nextInt();
            System.out.println("Введите второе число");
            int b = in.nextInt();
            int sum = a + b;
            int raz = a - b;
            int proz = a * b;
            int chast = a / b;
            System.out.println("Сумма = "+sum);
            System.out.println(a - b);
            System.out.println(a * b);
            System.out.println(a / b);
        } catch (Exception e) {
            System.out.println("Неверные данные");
        }
    }
}


