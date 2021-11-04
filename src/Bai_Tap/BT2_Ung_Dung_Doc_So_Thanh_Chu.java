package Bai_Tap;

import java.util.Scanner;

public class BT2_Ung_Dung_Doc_So_Thanh_Chu {
    public static void main(String[] args) {
        Scanner number1 = new Scanner(System.in);

        System.out.println("mời nhập số");
        String str = number1.nextLine();
        String[] newstring = str.split("");
        for (int i = 0; i < newstring.length; i++) {
            int number = Integer.parseInt(newstring[i]);
            show(number);
        }
    }


        public static void show(int so) {
        switch (so) {
            case 0:
                System.out.println("không");
                break;

            case 1:
                System.out.println("một");
                break;
            case 2:
                System.out.println("hai");
                break;
            case 3:
                System.out.println("ba");
                break;
            case 4:
                System.out.println("bốn");
                break;
            case 5:
                System.out.println("năm");
                break;
            case 6:
                System.out.println("sáu");
                break;
            case 7:
                System.out.println("bảy");
                break;
            case 8:
                System.out.println("tám");
                break;
            case 9:
                System.out.println("chín");
                break;

        }}}

