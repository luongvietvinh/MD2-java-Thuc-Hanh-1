package LOP_VA_Doi_Tuong_TRong_JaVa_4;

import java.util.Scanner;

public class BT_3_Xay_Dung_lop_Fan {
     int SLOW = 1;
     int MEDIUM = 2;
     int FAST = 3;
    private int speed = SLOW;
    private boolean check = false;
    private double darius = 5;
    private String color = "blue";

    public BT_3_Xay_Dung_lop_Fan(int SLOW, int MEDIUM, int FAST, int speed, boolean on, double darius, String color) {
        this.SLOW = SLOW;
        this.MEDIUM = MEDIUM;
        this.FAST = FAST;
        this.speed = speed;
        this.check = on;
        this.darius = darius;
        this.color = color;
    }

    public int getSLOW() {
        return SLOW;
    }

    public void setSLOW(int SLOW) {
        this.SLOW = SLOW;
    }

    public int getMEDIUM() {
        return MEDIUM;
    }

    public void setMEDIUM(int MEDIUM) {
        this.MEDIUM = MEDIUM;
    }

    public int getFAST() {
        return FAST;
    }

    public void setFAST(int FAST) {
        this.FAST = FAST;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isCheck() {
        return check;
    }

    public void setCheck(boolean check) {
        this.check = check;
    }

    public double getDarius() {
        return darius;
    }

    public void setDarius(double darius) {
        this.darius = darius;
    }

    @Override
    public String toString() {

        if (check) {
            return "fan í on{" +
                    ", speed=" + speed +
                    ", darius=" + darius +
                    ", color='" + color + '\'' +
                    '}';
        } else {
            return "fan is of" +
                    ", darius=" + darius +
                    ", color='" + color + '\'';
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("MeNU chọn");
            System.out.println("1- bật");
            System.out.println("2- tắt");
            System.out.println("nhập  1 or 2 ");
            int chois = scanner.nextInt();

            switch (chois) {
                case 1:

            }
        }
    }
}

