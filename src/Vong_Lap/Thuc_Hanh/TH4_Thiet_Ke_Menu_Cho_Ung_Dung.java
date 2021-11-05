package Vong_Lap.Thuc_Hanh;


import java.util.Scanner;

public class TH4_Thiet_Ke_Menu_Cho_Ung_Dung {
    public static void main(String[] args) {
        int choi = -1;
        Scanner scanner = new Scanner(System.in);

        while (choi != 0) {
            System.out.println("menu");
            System.out.println("1. Draw the triangle");
            System.out.println("2. Draw the square");
            System.out.println("3. Draw the rectangle");
            System.out.println("0. Exit");
            System.out.println("Enter your choice:");
            choi = scanner.nextInt();

            switch (choi) {
                case 1 :
                    for (int i = 5; i >=1; i--) {
                        for (int j = 1; j < i; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                case  2:
                    for (int i = 0; i <= 5; i++) {
                        for (int j = 1; j < i; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                case 3:
                    for (int i = 0; i <= 5; i++) {
                        for (int j = 0; j < i; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                case 0:
                    System.exit(0);
                default:
                    System.out.println("no choi");
            }
        }

    }
}