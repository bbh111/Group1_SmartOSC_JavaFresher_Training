package com.smartosc.utl;

import static java.lang.System.*;

public class ErrorUtil {
    public void alertErrorNumberFormat(String choice){
        out.printf("Nhập sai định dạng số, vui lòng nhập lại %s.%n", choice);
    }
    public void alertErrorChoice(String choice){
        out.printf("Lựa chọn sai, vui lòng chọn lại %s.%n", choice);
    }
}
