package LOP_VA_Doi_Tuong_TRong_JaVa_4;


import java.util.Date;

public class BT_2_Xay_dung_Lop_StopWath {
    long starTime;
    long endTime;

    public long star() {
        starTime = new Date().getTime();
        return starTime;
    }
    public long stop () {
        endTime = new Date().getTime();
        return endTime;
    }
    public long elemen() {
        return endTime - starTime;
    }

}