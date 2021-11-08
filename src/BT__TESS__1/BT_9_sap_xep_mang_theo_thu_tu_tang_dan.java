package BT__TESS__1;

public class BT_9_sap_xep_mang_theo_thu_tu_tang_dan {
    public static void main(String[] args) {
        int[] myArray = {3, 5, 7, 30, 10, 5, 8, 23, 0, -5};
        for (int i = 0; i < myArray.length - 1; i++) {
            for (int j = i; j <= myArray.length - 1; j++) {
                if (myArray[i] > myArray[j]) {
                    // Thao tác này đổi chỗ 2 giá trị ở 2 vị trí i, j của mảng
                    int temp;
                    temp = myArray[i];
                    myArray[i] = myArray[j];
                    myArray[j] = temp;
                }
            }
        }
        for (int i = 0; i < myArray.length; i++) {
            System.out.print(myArray[i] + " ");
        }
    }
}
