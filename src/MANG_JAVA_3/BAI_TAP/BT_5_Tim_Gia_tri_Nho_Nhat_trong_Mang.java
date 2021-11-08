package MANG_JAVA_3.BAI_TAP;

import java.util.Scanner;

public class BT_5_Tim_Gia_tri_Nho_Nhat_trong_Mang {
    public static void main(String[] args) {
        int size = 0;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("nhập so phần tử trong mảng");
            size = scanner.nextInt();
            if (size > 20)
                System.out.println("Size does not exceed 20");
        } while (size > 20);
        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.print("phần tử thứ: " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
            i++;
        }
        System.out.println("phần tử trong mảng :");
        for (int j = 0; j < array.length; j++) {
            System.out.println(array[j]);
        }

        int min = array[0];
        for (int j = 0; j < array.length; j++) {
            if (min > array[j]){
                min = array[j];
            }
        }
        System.out.println("số nhỏ nhất trong mảng là : " + min);
    }

}
