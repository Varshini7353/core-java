package com.xworkz.fortis;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileRunner{

    public static void main(String[] args) throws IOException {


        File file=new File("C:/Users/acer/Documents/my_file.txt");

        FileWriter file1=new FileWriter(file);

        file1.write("Hello welcome to Fortis Website\n");
        file1.write("Hey WhatsUp\n");
        file1.write("Had u done with your Lunch");

        FileReader read=new FileReader(file);
        read.read();

        file1.close();

        read.close();

        System.out.println("File created and saved succesfully");



    }
}