package BT__TESS__1;

import java.util.Scanner;

public class BT_10_them_sua_xoa_chen_PT_trong_mang {
    public static void main(String[] args) {
       int[] arr = new int[100];
       int count = 0;
       int potipon;
       int choii;

           System.out.println("Menu chọn");
           System.out.println("1- thêm pt vào mảnh ");
           System.out.println("2- sửa PT trong mảng");
           System.out.println("3- xóa PT trong mảng");
           System.out.println("4- chèn PT trong mảng");
           System.out.println("5- hiển thị PT trong mảng");
           System.out.println("6- thoát");
           System.out.println();
           System.out.println("chọn chức năng");
           Scanner scanner = new Scanner(System.in);
           choii = scanner.nextInt();

           switch (choii) {
               case 1:
                   System.out.println("thêm phần tử vào mảng ");
                   arr[count] = scanner.nextInt();
                   count++;
                   break;
               case 2:
                   System.out.println("sửa phần tử trong mảng");
                   potipon = scanner.nextInt();
                   if (potipon < 0 || potipon >= count){
                       System.out.println("vị trí không có ở trong mảng");
                   }else {
                       System.out.println("");
                       arr[potipon] = scanner.nextInt();
                   }
                   break;
               case 3:
                   System.out.println("phập vị trí cần xóa trong mảng");
                   potipon = scanner.nextInt();
                   if (potipon < 0 || potipon >= count){
                       System.out.println("vị trí không có ở trong mảng");
                   }else {
                       //xóa PT tại vị trí potion
                       for (int i  = potipon; i <= count - 1;i++){
                           arr[i] = arr[i +1];
                       }
                       count--;
                       System.out.println("đã xóa phần tử tại vị trí trong mảng");
                   }
                   break;
               case 4:
                   System.out.println("chèn PT trong mảng");
                   potipon = scanner.nextInt();

                   if (potipon < 0 || potipon >= count) {
                       System.out.println("vị trí không có ở trong mảng");
                   }else {
                       System.out.println("nhập số cần chèn");
                       int num = scanner.nextInt();
                       for (int i = count; i > potipon ; i--) {
                            arr[i] = arr[i - 1];
                       }
                       arr[potipon] = num;
                       count++;
                   }
                   break;


           }

    }
}
