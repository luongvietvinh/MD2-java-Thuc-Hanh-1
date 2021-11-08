package BT__TESS__1;

import java.util.Scanner;

public class BT_5_Giai_Phuong_trinh_bac_2_nhap_a_b_c_tra_ve_ket_qua {
    public static void main(String[] args) {
        Scanner myscanner = new Scanner(System.in);

        System.out.println("nhập số a");
        int a = myscanner.nextInt();
        System.out.println("nhập số b");
        int b = myscanner.nextInt();
        System.out.println("nhập số c");
        int c = myscanner.nextInt();

        double denta = b ^ 2 - 4 * a * c;
        if (denta < 0) {
            System.out.println("vô nghiệm");
        } else {
            System.out.println("x1 = " + (-b + Math.sqrt(denta)) / 2 * a);
            System.out.println("x2 = " + (-b - Math.sqrt(denta)) / 2 * a);
        }
    }
}
