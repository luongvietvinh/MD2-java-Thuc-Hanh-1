package Vong_Lap;

public class BT3_Hien_Thi_Cac_So_Nguyen_To_Nho_Hon_100 {
    public static void main(String[] args) {

        for (int i = 2; i < 100; i++) {
            int count = 0;
            boolean check = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    check = false;
                    break;
                }
            }
            if (check) {
                System.out.println("so nt nho hon 100 la  " + i);
                count++;

            }
        }

    }
}
