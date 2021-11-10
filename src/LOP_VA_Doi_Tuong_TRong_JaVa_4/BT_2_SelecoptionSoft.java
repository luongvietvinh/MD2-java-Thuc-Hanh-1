package LOP_VA_Doi_Tuong_TRong_JaVa_4;

import java.util.Scanner;

public class BT_2_SelecoptionSoft {
    public static void main(String[] args) {
        BT_2_Xay_dung_Lop_StopWath stopWath = new BT_2_Xay_dung_Lop_StopWath();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("star");
            System.out.println("end");
            System.out.println("show");
            System.out.println("nhập vào số:");
            int so = scanner.nextInt();


            switch (so) {
                case 1:
                    stopWath.star();
                    break;
                case 2:
                    stopWath.stop();
                    break;
                case 3:
                    System.out.println(stopWath.elemen());
            }
        }

    }
}