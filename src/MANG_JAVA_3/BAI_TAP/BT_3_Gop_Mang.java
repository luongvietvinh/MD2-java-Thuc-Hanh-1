package MANG_JAVA_3.BAI_TAP;

import java.util.Scanner;

public class BT_3_Gop_Mang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arr1[] = new int[5];
        int arr2[] = new int[4];
        int i = 0;
        int j = 0;

        while (i < arr1.length) {
            System.out.println("nhập phần tử " + (i +1)+ " " );
            arr1[i] = scanner.nextInt();
            i++;
        }
        System.out.println("mảng 1 la : ");
        for (i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + "\t");
        }
        System.out.println();
        while (j < arr2.length) {
            System.out.println("nhập phần tử mảng 2 " + (j + 1) + " ");
            arr2[j] = scanner.nextInt();
            j++;
        }
        System.out.print("mảng 2 là : ");
        for (j = 0; j < arr2.length; j++) {
            System.out.print(arr2[j] + "\t");
        }
        System.out.println();
        int c = 0;
        int arr3[] = new int[9];
        for (int k = 0; k < arr1.length; k++) {
            arr3[c] = arr1[k];
            c++;
        }
        for (int k = 0; k < arr2.length; k++) {
            arr3[c] = arr2[k];
            c++;
        }
        System.out.println("mảng 3 là :");
        for (int k = 0; k < arr3.length; k++) {
            System.out.print(arr3[k] + "\t");
        }
    }
}