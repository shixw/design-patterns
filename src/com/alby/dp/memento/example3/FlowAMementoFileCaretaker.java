package com.alby.dp.memento.example3;

import java.io.*;

/**
 * Created by xianwei on 2015/12/15.
 * 负责保存模拟运行流程A的对象的备忘录对象
 */
public class FlowAMementoFileCaretaker {

    //保存
    public void saveMemento(FlowAMockMemento memento){
        ObjectOutputStream out = null;
        try {
            out = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream("FlowMemento")));
            out.writeObject(memento);
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if (out != null) {
                    out.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    //获取
    public FlowAMockMemento retriveMemento(){
        ObjectInputStream in = null;
        try {
            in = new ObjectInputStream(new BufferedInputStream(new FileInputStream("FlowMemento")));
            return (FlowAMockMemento) in.readObject();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }finally {
            try {
                if (in != null) {
                    in.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return null;
    }
}
