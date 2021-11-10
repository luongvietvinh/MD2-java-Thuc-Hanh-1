package LOP_VA_Doi_Tuong_TRong_JaVa_4;

import java.util.Scanner;

public class BT_1_Xay_Dung_Lop_PT_Bac_2 {
    double a, b, c;

    public BT_1_Xay_Dung_Lop_PT_Bac_2(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getDiscriminant() {
        return b * b - 4 * a * c;
    }

    public double getRoot1() {
        return (-b + Math.pow(getDiscriminant(), 0.5)) / 2 * a;
    }

    public double getRoot2() {
        return (-b - Math.pow(getDiscriminant(), 0.5)) / 2 * a;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập vào giá trị a");
        double a = scanner.nextDouble();
        System.out.println("nhập vào giá trị b");
        double b = scanner.nextDouble();
        System.out.println("nhập vào giá trị c");
        double c = scanner.nextDouble();
        BT_1_Xay_Dung_Lop_PT_Bac_2 giaipt = new BT_1_Xay_Dung_Lop_PT_Bac_2(a, b, c);
        if (giaipt.getDiscriminant() >= 0) {
            System.out.println("PT có 2 nghiệm " + " x1 là: " + giaipt.getRoot1() + " và " + " x2 là: " + giaipt.getRoot2());
        }
        if (giaipt.getDiscriminant() == 0) {
            System.out.println("nghiệm của PT là : " + giaipt.getRoot1());
        } else {
            System.out.println("The equation has no root");
        }
    }
}