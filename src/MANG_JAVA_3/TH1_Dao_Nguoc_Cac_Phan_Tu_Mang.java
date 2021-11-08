package MANG_JAVA_3;

import java.util.Scanner;

public class TH1_Dao_Nguoc_Cac_Phan_Tu_Mang {

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
        System.out.println("các phần tử trong mảng : ");
        for (int j = 0; j < array.length; j++) {
            System.out.println(array[j]);
        }
        for (int j = 0; j < array.length / 2; j++) {
            int temp = array[j];
            array[j] = array[size - 1 - j];
            array[size - 1 - j] = temp;
        }
        System.out.println("dảo mảng thành: " );
        for (int j = 0; j < array.length; j++) {
            System.out.println(array[j]);
        }
    }
}
