package com.alby.dp.decorator.example4;

import java.io.IOException;
import java.io.OutputStream;

/**
 * Created by xianwei on 2015/12/24.
 * 实现简单的加密
 */
public class EncryptOutputStream extends OutputStream {
    //持有被装饰的对象
    private OutputStream os = null;

    public EncryptOutputStream(OutputStream os) {
        this.os = os;
    }

    @Override
    public void write(int b) throws IOException {
        //先同意向后移动两位
        b = b+2;

        //97是小写a的码值
        if (b >= (97+26)){
            //如果大于，表示已经是y或者z了，减去26就回到a或者b了
            b = b-26;
        }

        this.os.write(b);
    }
}
