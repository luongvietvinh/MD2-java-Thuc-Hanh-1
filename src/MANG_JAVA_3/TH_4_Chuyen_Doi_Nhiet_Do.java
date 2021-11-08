package MANG_JAVA_3;

import java.util.Scanner;

public class TH_4_Chuyen_Doi_Nhiet_Do {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double celsius;
        double fahrenheit;
        int choice;

        do {
            System.out.println("Menu.");
            System.out.println("1. đọ F sang đọ C");
            System.out.println("2. đọ C sang độ F");
            System.out.println("0. thoát");
            System.out.println("lựa chọn ");
            choice = input.nextInt();

            switch (choice) {
                case 1: {
                    System.out.println("nhập đọ f: ");
                    fahrenheit = input.nextDouble();
                    System.out.println("chuyển sang độ c là : " + fahrenheitToCelsius(fahrenheit));
                    break;
                }
                case 2: {
                    System.out.println("nhập độ C : ");
                    celsius = input.nextDouble();
                    System.out.println("chuyển sang dộ F : " + celsiusToFahrenheit(celsius));
                    break;
                }
                case 0:
                    System.exit(0);
            }
        } while (choice != 0);
    }

    public static double celsiusToFahrenheit(double celsius) {
        double fahrenheit = (9.0 / 5) * celsius + 32;
        return fahrenheit;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        double celsius = (5.0 / 9) * (fahrenheit - 32);
        return celsius;
    }
}