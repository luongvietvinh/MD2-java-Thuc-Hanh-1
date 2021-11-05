package Bien_Toantu_CaulenhDK.THUC_HANH;

import java.util.Scanner;

public class TH4_Giai_Phuong_Tinh_Bac_Nhat {
    public static void main(String[] args) {
       Scanner ahihi = new Scanner(System.in);

       System.out.println("nhập số a");
       double a = ahihi.nextDouble();

        System.out.println("nhập số b");
        double b = ahihi.nextDouble();

        System.out.println("nhập số c");
        double c = ahihi.nextDouble();

        if (a != 0) {
            double nghiem = -b / a;
            System.out.println("nghiệm của phương trình là" + nghiem);
        }
        if (a != 0) {
            double nghiem22 = (c - b) / a;
            System.out.println("nghiêm là : " + nghiem22);

        } else {
            if (b == 0) {
                System.out.println("phương trình vô nghiệm");

            } else {
                System.out.println("không tìm thấy nghiệm nào");
            }
        }

    }
}
