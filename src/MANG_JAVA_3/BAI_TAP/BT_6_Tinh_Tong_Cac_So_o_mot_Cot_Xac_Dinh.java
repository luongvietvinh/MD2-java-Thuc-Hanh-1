package MANG_JAVA_3.BAI_TAP;

import java.util.Scanner;

public class BT_6_Tinh_Tong_Cac_So_o_mot_Cot_Xac_Dinh {
    public static void main(String[] args) {

        int m;
        int n;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập vào số dòng của ma trận: ");
        m = scanner.nextInt();
        System.out.println("Nhập vào số cột của ma trận: ");
        n = scanner.nextInt();

        // khai báo ma trận A có m dòng, n cột
        int A[][] = new int[m][n];

        System.out.println("Nhập các phần tử cho ma trận: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("A[" + i + "]["+ j + "] = ");
                A[i][j] = scanner.nextInt();
            }
        }
    }
}
