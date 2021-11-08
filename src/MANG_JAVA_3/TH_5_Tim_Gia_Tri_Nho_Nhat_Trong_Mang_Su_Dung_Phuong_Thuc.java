package MANG_JAVA_3;

public class TH_5_Tim_Gia_Tri_Nho_Nhat_Trong_Mang_Su_Dung_Phuong_Thuc {

    public static void main(String[] args) {
        int[] arr = { 1,4, 5, 6, 8, 9, 12, 22};
        int index = minValue(arr);
        System.out.println("phần tử nhỏ nhất trong mảng là : " + arr[index]);
    }

    public static int minValue(int[] array) {
        int index = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[index]) {
                index = i;
            }
        }
        return index;
    }
}