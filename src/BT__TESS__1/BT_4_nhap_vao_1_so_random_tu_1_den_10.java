package BT__TESS__1;

import java.util.Scanner;

public class BT_4_nhap_vao_1_so_random_tu_1_den_10 {
    public static void main(String[] args) {
        int random = (int) (Math.random() * 9 + 1);
        Scanner myscanner = new Scanner(System.in);

        while (true) {
            System.out.println("nhập vào số dự đoán từ 1 -10");
            int so = myscanner.nextInt();
            if (so == random) {
                System.out.println("chúc mừng . may mắn vl");
                break;
            } else {
                if (so > random) {
                    System.out.println("đen thôi đỏ quên đi");
                } else {
                    System.out.println("bị nhỏ hơn rồi .. quay lại đe");
                }
            }
        }
    }
}
