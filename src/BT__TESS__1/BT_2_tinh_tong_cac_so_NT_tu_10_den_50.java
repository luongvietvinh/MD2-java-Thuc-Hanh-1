package BT__TESS__1;

public class BT_2_tinh_tong_cac_so_NT_tu_10_den_50 {

    public static void main(String[] args) {

        int count = 0;
            for (int i = 10; i < 50; i++) {

                boolean check = true;
                for (int j = 2; j <= Math.sqrt(i); j++) {
                    if (i % j == 0) {
                        check = false;
                        break;
                    }
                }
                if (check) {
                   count += i;
                }
            }
        System.out.println(count);
    }
}