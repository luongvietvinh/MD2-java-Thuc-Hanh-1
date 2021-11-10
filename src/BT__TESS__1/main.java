package BT__TESS__1;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        NhanVien[] member = new NhanVien[3];
        member[0] = new NhanVien("vinh", "nam", 30);
        member[1] = new NhanVien("thảo", "nữ", 27);
        member[2] = new NhanVien("hằng", "nữ", 20);

        while (true) {
            System.out.println("menu lựa chon");
            System.out.println(" 1 - hiển thị nhân viên");
            System.out.println(" 2 - thêm nhân viên");
            System.out.println(" 3 - xóa nhân viên");
            System.out.println();
            System.out.println("mời nhập số");
            int so = scanner.nextInt();
            switch (so) {
                case 1:
                    show(member);
                    break;
                case 2:
                    member = themnhanvien(member);
                    break;
                case 3:
                    member = delete(member);
                    break;
            }
        }
    }

    public static void show(NhanVien[] member) {
        for (NhanVien nv : member) {
            System.out.println(nv.toString());
        }
    }

    public static NhanVien[] themnhanvien(NhanVien[] member) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("nhập tên");
        String name = scanner.nextLine();
        System.out.println("nhập giới tính");
        String gioitinh = scanner.nextLine();
        System.out.println("nhập tuổi ");
        int age = scanner.nextInt();

        NhanVien member1 = new NhanVien(name, gioitinh, age);

        NhanVien[] newNV = new NhanVien[member.length + 1];

        for (int i = 0; i < member.length; i++) {
            newNV[i] = member[i];
        }
        newNV[newNV.length - 1] = member1;
        return newNV;
    }

    public static NhanVien[] delete(NhanVien[] member) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("xóa nhân viên ở vị trí id số:");
        int xoa = scanner.nextInt();

        NhanVien[] newNV = new NhanVien[member.length - 1];



        for (int i = 0; i < member.length -1; i++) {
           if (i == xoa) {
               newNV[i] = member[i];
           }else  {
             newNV[i] = member[i +1];

           }
        }
       return newNV;
    }
}