package MANG_JAVA_3.BAI_TAP;

import java.util.Scanner;

public class BT_2_Them_PT_Vao_Mang {
    public static void main(String[] args) {
        int size = 0;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("nhập so phần tử trong mảng");
            size = scanner.nextInt();
            if (size > 20)
                System.out.println("Size does not exceed 20");
        } while (size > 20);
        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.print("phần tử thứ: " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
            i++;
        }
        int x;
        int index;
        int[] arr = new int[size +1];
        System.out.println("nhập vào phần tử cần thêm");
        x = scanner.nextInt();
        System.out.println("nhập vị trí index cần thêm");
        index = scanner.nextInt();

        if (index <= -1 && index > arr.length -1) {
            System.out.println("không chèn được");
        }else {
            for (int j = 0; j < arr.length; j++) {
                if (j < index) {
                    arr[j] = array[i];
                }else {
                    if (j == index){
                        arr[j] = x;
                    }else {
                        arr[j] = array[j -1];
                    }
                }
            }
        }
        System.out.println("mảng sau khi thêm phần tử " + x + " là: ");
        for (i = 0; i < arr.length;i ++) {
            System.out.println(arr[i]);
        }
        }
    }

