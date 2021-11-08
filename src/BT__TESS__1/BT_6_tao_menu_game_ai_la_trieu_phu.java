package BT__TESS__1;

import java.util.Scanner;

public class BT_6_tao_menu_game_ai_la_trieu_phu {
    public static void main(String[] args) {
        System.out.println("lớp 0921K1 có bao nhiêu bạn nữ");

        System.out.println("1 : 1 bạn");
        System.out.println("2 : 2 bạn");
        System.out.println("3 : 3 bạn");
        System.out.println("4 : 4 bạn");

        Scanner myscanner = new Scanner(System.in);
        boolean check = true;
        while (check) {
            System.out.println("nhập đáp án vào đây");
            int so = myscanner.nextInt();
            switch (so) {
                case 2:
                    System.out.println("đúng rồi");
                    check = false;
                    break;
                default:
                    System.out.println("sai rôi bạn eiiii");
            }
        }
    }
}
