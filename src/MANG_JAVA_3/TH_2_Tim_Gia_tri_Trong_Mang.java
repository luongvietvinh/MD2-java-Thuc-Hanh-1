package MANG_JAVA_3;

import java.util.Scanner;

public class TH_2_Tim_Gia_tri_Trong_Mang {
    public static void main(String[] args) {
        String[] hocSinhGuongMau = {"khuong" , "son" , "vinh" , "dai" , "tung" , "dat" , "NGA" , "vu" , "thuong"};
        Scanner scanner = new Scanner(System.in);

        System.out.println("nhap ten hoc sinh uu tu");
        String ten = scanner.nextLine();
       boolean hienco = false;
        for (int i = 0; i < hocSinhGuongMau.length; i++) {
            if (hocSinhGuongMau[i].equals(ten)){
                System.out.println("ten cua hoc sing guong mau: " + ten + " " + "co thu tu la: " + i);
                hienco = true;
                break;
            }
        }
        if (!hienco) {
            System.out.println("ten hoc sinh :" + ten + "khong co trong danh sach");
        }
    }
}
