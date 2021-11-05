package Vong_Lap.Thuc_Hanh;

import java.util.Scanner;

public class TH2_Tinh_Tien_Lai_Cho_Vay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double monney = 1.0;
        int thang = 1;
        double tienlai = 2.0;
        System.out.println("nhập số tiền");
        monney = scanner.nextDouble();
        System.out.println("nhập số tháng");
        thang = scanner.nextInt();

        double sum = 0;
        for (int i = 1; i <= thang; i++) {
            sum += monney * (tienlai / 100) / 12 * thang;

            System.out.println("tiền lãi tháng " + i +  " = " + sum + "VND");
        }

    }
}
