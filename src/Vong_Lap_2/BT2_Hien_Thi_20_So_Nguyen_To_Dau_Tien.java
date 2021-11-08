package Vong_Lap_2;

public class BT2_Hien_Thi_20_So_Nguyen_To_Dau_Tien {
    public static void main(String[] args) {
        int count = 20;
        int number = 2;
        for (int i = 1; i <= count; ) {
            boolean check = true;
            for (int j = 2; j <= Math.sqrt(number); j++) {
                if (number % j == 0) {
                    check = false;
                    break;
                }
            }
            if (check) {
                System.out.println("20 so nt dau tien la " + number);
                i++;

            }
            number++;
        }

    }
}
