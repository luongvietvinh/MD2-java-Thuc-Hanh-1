package Vong_Lap_2.Thuc_Hanh;

import java.util.Scanner;

public class TH3_Tim_Uoc_Chung_Lon_Nhat {
    public static void main(String[] args) {
        int a, b;
        Scanner scanner = new Scanner(System.in);

        System.out.println("nhâpk số thứ a");
        a = scanner.nextInt();
        System.out.println("nhập số thứ b");
        b = scanner.nextInt();

        a = Math.abs(a);
        b = Math.abs(b);

        if (a == 0 || b == 0) {
            System.out.println("Không có ước chung lớn nhất");

            while (a != b) {
                if (a > b)
                    a = a - b;
                else
                    b = b - a;

            }
                System.out.println("số chung lớn nhất của a và b là " + a );

            }}}