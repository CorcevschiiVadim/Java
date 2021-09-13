import java.util.Scanner;
public class Number16 {
  public static void main(String args[]){
      Scanner in = new Scanner(System.in);
      System.out.println("Введите первое число: ");
      int num1 = in.nextInt();
      System.out.println("Введите второе число: ");
      int num2 = in.nextInt();
      if (num1 > num2){
          System.out.println("Первое число больше второго");
      }
      else if (num2 > num1){
          System.out.println("Второе число больше первого");
      }
      else{
          System.out.println("Оба числа равны");
      }
      in.close();
  }
}
