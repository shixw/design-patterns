package com.alby.dp.command.example7;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by xianwei on 2015/12/6.
 * 读写文件的辅助工具类
 */
public class FileOpeUtil {
    private FileOpeUtil() {
    }

    public static List readFile(String pathName) {
        List list = new ArrayList();
        ObjectInputStream oin = null;
        File f = new File(pathName);
        if (f.exists()) {
            try {
                oin = new ObjectInputStream(new BufferedInputStream(new FileInputStream(f)));
                list = (List) oin.readObject();
            } catch (IOException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } finally {
                try {
                    if (oin != null) {
                        oin.close();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return list;
    }

    public static void writeFile(String pathName, List list) {
        File f = new File(pathName);
        ObjectOutputStream oout = null;
        try {
            oout = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(f)));
            oout.writeObject(list);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (oout != null) {
                    oout.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
