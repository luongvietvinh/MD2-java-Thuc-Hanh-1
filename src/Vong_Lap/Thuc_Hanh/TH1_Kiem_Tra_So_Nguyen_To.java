package Vong_Lap.Thuc_Hanh;

import java.util.Scanner;

public class TH1_Kiem_Tra_So_Nguyen_To {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("nhập số cần kiểm tra");
        int number = scanner.nextInt();

        if (number < 2 ) {
            System.out.println(number + " là số nguyên tố");

        }else {
            int count = 0;
            int i = 2;
            boolean check = true;
            while (i <= Math.sqrt(number)){
                if( number % i == 0 ) {
                    count++;
                    check = false;
                    break;
                }
                i++;
            }if (check) {
                count++;
                System.out.println(number + "là số nguyên tố");
            }else {
                System.out.println(number + "không phải số nguyên tố");
            }
        }
    }
}
