package THUC_HANH;

import java.util.Scanner;

public class TH3_Toan_Tu {

    public static void main(String[] args) {
        float wight;
        float height;
        Scanner baby = new Scanner(System.in);

        System.out.println("ấn enter để nhập số");
        wight = baby.nextFloat();

        System.out.println("ấn enter để nhập liệu");
        height = baby.nextFloat();

        float duongkinh = wight * height;

        System.out.println("đường kính là : " + duongkinh);
    }

}
