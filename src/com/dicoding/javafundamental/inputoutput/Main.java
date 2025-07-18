package com.dicoding.javafundamental.inputoutput;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        String dirname = "D:/java";
        File file = null;
        String[] paths;

        try {
            file = new File(dirname);
            paths = file.list();

            for(String path: paths){
                System.out.println(path);
            }
        } catch (Exception e){
            e.printStackTrace();
        }

    }
}
