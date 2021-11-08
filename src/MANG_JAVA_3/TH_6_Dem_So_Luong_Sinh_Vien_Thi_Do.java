package MANG_JAVA_3;

import java.util.Scanner;

public class TH_6_Dem_So_Luong_Sinh_Vien_Thi_Do {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("nhập ");
            size = scanner.nextInt();
            if (size>30) {
                System.out.println("kích thước ko vượt quá 30");
            }
        }while (size > 30);
        array = new int[size];
        int i = 0;
        while (i < array.length){
            System.out.println("nhập điểm học sinh" + (i + 1) + " :");
            array[i] = scanner.nextInt();
            i++;
        }
        int count = 0;
        System.out.println("danh sách: ");
        for (int j = 0; j < array.length; j++) {
            System.out.println(array[j]);
            if (array[j] >= 5 && array[j] <= 10)
                count++;
        }
        System.out.println("số học sinh thi đậu là : " + count);
    }
}
