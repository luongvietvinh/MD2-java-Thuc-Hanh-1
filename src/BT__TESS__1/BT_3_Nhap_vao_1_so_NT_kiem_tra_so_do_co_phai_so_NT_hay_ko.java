package BT__TESS__1;

import java.util.Scanner;

public class BT_3_Nhap_vao_1_so_NT_kiem_tra_so_do_co_phai_so_NT_hay_ko {
    public static void main(String[] args) {
        Scanner myscan = new Scanner(System.in);

        System.out.println("mời nhập số cần kiêm tra");
        int num = myscan.nextInt();

        if (num < 2) {
            System.out.println("không phải số nguyên tố");

        } else {
            boolean check = true;
            for (int i = 2; i <= num / 2; i++) {
                if (num % 2 == 0) {
                    check = false;
                    System.out.println("không phải số nguyên tố");
                }
            }
            if (check) {
                System.out.println("là số nguyên tố  ");
            }
        }
    }
}
