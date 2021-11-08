package BT__TESS__1;

public class BT_7_tim_tong_va_gia_tri_trung_binh_cua_cac_PT_trong_mang {
    public static void main(String[] args) {
        int[] myArray = { 3, 5, 7, 30, 10, 5, 8, 23, 0, -5 };
        int sum = 0;
        double avg;
        int count = myArray.length;
        for (int i = 0; i < count; i++) {
            sum += myArray[i];
        }
        avg = (double) sum / count;
        System.out.println("tổng là:  " + sum);
        System.out.println("giá trị trung bình là: " + avg);
    }
}
