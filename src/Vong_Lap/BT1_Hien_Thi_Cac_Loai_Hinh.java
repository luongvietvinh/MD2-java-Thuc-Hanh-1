package Vong_Lap;

import java.util.Scanner;

public class BT1_Hien_Thi_Cac_Loai_Hinh {
    public static void main(String[] args) {
        int nhapso = 0;
        Scanner scanner = new Scanner(System.in);

        while (nhapso > -1) {

            System.out.println("MeNu lua chon");
            System.out.println("1 :hinh chu nhat");
            System.out.println("2  hinh tam giac ");
            System.out.println("3  hinh tam giac nguoc ");
            System.out.println("");
            System.out.println("moi nhap so can hien thi");
            nhapso = scanner.nextInt();

            switch (nhapso) {
                case 1:
                    for (int i = 1; i <= 4; i++) {
                        for (int j = 0; j < 20; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                case 2:
                    for (int i = 0; i <= 7; i++) {
                        for (int j = 1; j < i; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                case 3:
                    for (int i = 7; i >= 1; i--) {
                        for (int j = 1; j < i; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                case 4:
                    for (int i = 0; i <= 7; i++) {
                        for (int j = 1; j < i; j++) {
                            System.out.print("***");
                        }
                        System.out.println("%");
                    }
                case 5:
                    for (int i = 7; i >= 1; i--) {
                        for (int j = 1; j < i; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                case 6:
                    for (int i = 0; i <= 7; i++) {
                        for (int j = 1; j < i; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                case 7:
                    for (int i = 7; i >= 1; i--) {
                        for (int j = 1; j < i; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                case 8:
                    for (int i = 0; i <= 7; i++) {
                        for (int j = 1; j < i; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                case 9:
                    for (int i = 7; i >= 1; i--) {
                        for (int j = 1; j < i; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                case 10:
                    for (int i = 0; i <= 7; i++) {
                        for (int j = 1; j < i; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                case 11:
                    for (int i = 7; i >= 1; i--) {
                        for (int j = 1; j < i; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
            }
        }
    }
}
