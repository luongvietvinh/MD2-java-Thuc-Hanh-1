package LOP_VA_Doi_Tuong_TRong_JaVa_4;

import java.util.Scanner;

public class TH_1_Lop_Hinh_Chu_Nhat_rectangge {

    double wight, height;

    public TH_1_Lop_Hinh_Chu_Nhat_rectangge(double wight, double height) {
        this.wight = wight;
        this.height = height;
    }

    public double getArea() {
        return wight * height;
    }

    public double getChuVi() {
        return (wight + height) * 2;
    }

    public String display() {
        return "hình chữ nhật {" + "wight: " + wight + " , height =  " + height + "}";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập chiều rộng width : ");
        double wight = scanner.nextDouble();
        System.out.println("nhập chiều dài height : ");
        double height = scanner.nextDouble();
        TH_1_Lop_Hinh_Chu_Nhat_rectangge rectangle = new TH_1_Lop_Hinh_Chu_Nhat_rectangge(wight, height);
        System.out.println("thông số " + rectangle.display());
        System.out.println("chu vi của hình chữ nhật " + rectangle.getChuVi());
        System.out.println("đường kính của hình chữ nhật " + rectangle.getArea());

    }
}
