package com.example.laba1;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Memory {
    private static final File file = new File("../files/memory.txt");
    public static void toMemory(String num) throws IOException {
        FileWriter to_mem = new FileWriter(file);
        to_mem.write(num+"\\r\\n");
        to_mem.close();
    }
    public static ArrayList<String> readMemory() throws IOException {
        ArrayList<String> output = new ArrayList<String>();
        try {
            Scanner s = new Scanner(file);
            while (s.hasNext()){
                output.add(s.nextLine());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return output;
    }
    public static void toMemplus(String num){
        ArrayList<String> list = new ArrayList<String>();
        try {
            list = readMemory();
        } catch (IOException e){
            e.printStackTrace();
        }
        list.set(0,String.valueOf(Integer.parseInt(num)+Integer.parseInt(list.get(0))));
        try {
            ArrayToFile(list);
        } catch (IOException e){
            e.printStackTrace();
        }
    }
    public static boolean isEmpty() throws FileNotFoundException {
        return file.length() == 0;
    }
    public static void ArrayToFile(ArrayList<String> list) throws IOException{
        FileWriter fw = new FileWriter(file);
        FileReader fr = new FileReader(file);
        delete();

        fr.close();
        fw.close();
    }
    public static void delete() throws IOException {
        file.delete();
        file.createNewFile();
    }
}
