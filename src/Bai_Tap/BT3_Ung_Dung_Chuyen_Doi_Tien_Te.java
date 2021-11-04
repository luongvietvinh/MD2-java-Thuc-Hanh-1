package Bai_Tap;


import java.util.Scanner;

public class BT3_Ung_Dung_Chuyen_Doi_Tien_Te {

    public static void main(String[] args) {
        double VND = 23000;
        double USD;
        Scanner scanner = new Scanner(System.in);

        System.out.println("mời nhập số tiền USD");
        USD = scanner.nextDouble();

        double quydoi = USD * VND;

        System.out.println("số tiền việt nam là : " + quydoi + "VND");

       }
}
