package MANG_JAVA_3.BAI_TAP;

import java.util.Scanner;

public class BT_1_Xoa_Phan_Tu_Khoi_Mang {
    public static void main(String[] args) {

        int n, i, c;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("nhập vào số phần tử của mảng");
            n = scanner.nextInt();
        } while (n <= 0);
        int arr[] = new int[n];
        System.out.println("nhập các phần tử cho mảng");
        for (int j = 0; j < n; j++) {
            System.out.println("nhập phần tử thứ " + j + " :");
            arr[j] = scanner.nextInt();
        }
        System.out.println("nhập số nguyên cần xóa : ");
        int k = scanner.nextInt();
        for (c = i = 0; i < n; i++) {
            if (arr[i] != k) {
                arr[c] = arr[i];
                c++;
            }

        }
        n = c;
        System.out.println("Mảng còn lại sau khi xóa phần tử  " + k + " là: ");
        for (i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }
}
