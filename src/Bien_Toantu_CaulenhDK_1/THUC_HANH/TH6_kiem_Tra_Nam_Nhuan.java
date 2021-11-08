package Bien_Toantu_CaulenhDK_1.THUC_HANH;

import java.util.Scanner;

public class TH6_kiem_Tra_Nam_Nhuan {
    public static void main(String[] args) {
        Scanner namnhuan = new Scanner(System.in);
        int year;

        System.out.println("mời nhập năm");
        year = namnhuan.nextInt();

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.printf("%d là năm nhuận", year);
                } else {
                    System.out.printf("%d khôn phải là năm nhuận", year);
                }
            } else {
                System.out.printf("%d là năm nhuận", year);
            }
        } else {
            System.out.printf("%d khôn phải là năm nhuận", year);
        }
    }
}
