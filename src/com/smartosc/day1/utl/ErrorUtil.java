package com.smartosc.day1.utl;

public class ErrorUtil {
    public void alertErrorNumberFormat(String choice){
        System.out.printf("Nhập sai định dạng số, vui lòng nhập lại %s.\n", choice);
    }
    public void alertErrorChoice(String choice){
        System.out.printf("Lựa chọn sai, vui lòng chọn lại %s.\n", choice);
    }
}
