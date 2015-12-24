package com.alby.dp.decorator.example4;

import java.io.*;

public class Client {
    public static void main(String[] args) throws IOException {
        DataOutputStream dout = new DataOutputStream(
                                    new BufferedOutputStream(
                                        new EncryptOutputStream(
                                                new FileOutputStream("out.txt"))));

        dout.write("abcdxyz".getBytes());
//        dout.flush();
        dout.close();
    }
}
