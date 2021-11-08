package MANG_JAVA_3.BAI_TAP;

import java.util.Scanner;

public class BT_7_Mang_2_Chieu_Tinh_tong_cac_so_o_duong_cheo_chinh_cua_ma_tran {
    public static void main(String[] args) {
        int x,y;
        // bậc của ma trận vuông
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập vào số dong của ma trận: ");
        x = scanner.nextInt();
        System.out.println("Nhập vào số cột của ma trận: ");
        y = scanner.nextInt();

        int A[][] = new int[x][y];

        System.out.println("Nhập các phần tử cho ma trận: ");
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.print("A[" + i + "][" + j + "] = ");
                A[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Ma trận  vừa nhập la:");
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.print(A[i][j] + "\t");
            }
            System.out.println("\n");
        }
        int sum = 0;
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                if (i ==j){
                    sum += A[i][j];
                }
            }
        }
        System.out.println("tổng đường chéo chính của ma trận là: " + sum);

        //int max = A[0][0];
//        int min = A[0][0];

        // các phần tử nằm trên đường chéo chính
        // là các phần tử có chỉ số dòng = chỉ số cột
        // tìm số lớn nhất và nhỏ nhất ở đường chéo
//        for (int i = 0; i < n; i++) {
//            int sum = max + min;
//            for (int j = 0; j < n; j++) {
//                if (i == j && max < A[i][j]) {
//                    max = A[i][j];
//                }
//
//                if (i == j && min > A[i][j]) {
//                    min = A[i][j];
//                }
//
//            }
//
//        }
//
//        System.out.println("Phần tử lớn nhất nằm trên đường chéo chính = " + max);
//        System.out.println("Phần tử nhỏ nhất nằm trên đường chéo chính = " + min);

    }

}
