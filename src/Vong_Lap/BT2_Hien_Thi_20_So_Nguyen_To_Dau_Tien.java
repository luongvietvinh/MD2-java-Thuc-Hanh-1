package Vong_Lap;

public class BT2_Hien_Thi_20_So_Nguyen_To_Dau_Tien {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 2;i < 100; i++) {
            boolean check = true;
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    check = false;
                    break;
                }
            }
            if (check){
                System.out.println("20 so nt dau tien la " + i);
              count++;

            }if (count==20){
                break;
            }
            }

        }
    }
