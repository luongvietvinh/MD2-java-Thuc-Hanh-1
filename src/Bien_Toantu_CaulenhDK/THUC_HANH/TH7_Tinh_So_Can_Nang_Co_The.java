package Bien_Toantu_CaulenhDK.THUC_HANH;


import java.util.Scanner;

public class TH7_Tinh_So_Can_Nang_Co_The {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double weight, height, bmi;

        System.out.println("mời nhập số cân");
        weight = scanner.nextDouble();

        System.out.println("mời nhập chiều cao");
        height = scanner.nextDouble();

        bmi = weight / Math.pow(height,2) * 10000;
        if(bmi < 18 ){
            System.out.println("nghien vl" + bmi);
        } else if (bmi < 25.0 ) {
            System.out.println("cung van nghien" + bmi);
        } else if (bmi < 30.0 ) {
            System.out.println("cung duoc " + bmi);
        } else {
            System.out.println("beo võa òng ");
        }

    }
}

