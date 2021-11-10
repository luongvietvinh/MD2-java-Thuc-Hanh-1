package BT__TESS__1;

public class BT_8_in_vi_tri_cua_cac_PT_nho_hon_hay_bang_0 {
    public static void main(String[] args) {
        int[] myArray = {3, 5, 7, 30, 10, 5, 8, 23, 0, -5};
        int count = myArray.length;
        boolean isFound = true;
        for (int i = 0; i < count; i++) {
            if (myArray[i] <= 0) {
                System.out.println("vị trí nhỏ hơn hoặc bằng không là: " + i);
                isFound = false;
            }
        }

        if (!isFound) {
            System.out.println("kgoong tìm thấy vị trí bạn cần");
        }
    }
}
