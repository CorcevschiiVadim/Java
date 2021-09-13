import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;
public class number32 {
    public static void main(String[] args) {
        Random random = new Random();
        int lengthArray = random.nextInt(5) + 1;
        int[] a = new int[lengthArray];

        for (int i = 0; i < a.length; i++) a[i] = random.nextInt(21) - 5;
        System.out.println("Наш массив: " + Arrays.toString(a));

        int count = 0;
        for (int i = 0; i < a.length; i++){
            if (a[i] < 0) count++;
        }
        System.out.print("Ответ: Наш массив имеет " + count + " Отрицательные числа(-ел);");

        int[] array = {1, 0, 1, 0, 1};
        int count1 = 0;
        for (int e : array) {
            if (e == 0) count1++;
        }
        System.out.println(count1);

        int[] arr = {4, -8, 5, 7, -10};
        System.out.println(getCountPosElemArray(arr));
    }

    private static int getCountPosElemArray(int [] arr) {
        long curSum = 0;
        long lastSum = 0;
        int counter = 0;
        for (int elemArray : arr) {
           curSum += elemArray;
           if (curSum > lastSum)
               counter++;
           lastSum = curSum;
        }
        return counter;
    }
}


