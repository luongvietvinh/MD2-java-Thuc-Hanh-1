package MANG_JAVA_3.BAI_TAP;

import java.util.Scanner;

public class BT_8_Dem_So_Lan_Suat_Hien_Cua_ky_tu_Trong_Chuoi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String kytu;
        char thutu = 'b';
        int count = 0;
        System.out.println("nhập chuỗi cần kiêm tra");
        kytu = scanner.nextLine();

        for (int i = 0; i < kytu.length(); i++) {
            if (kytu.charAt(i) == thutu){
                count++;
            }
        }
        System.out.println("số lần xuất hiện của ký tự " + thutu + " " + " trong chuỗi " + " là " + count);
    }
}