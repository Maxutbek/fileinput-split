package com.company.lesson5;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        try {
                int a=0;

            while (a!=5) {

                FileInputStream fstream = new FileInputStream ("C://test//test.txt");
                DataInputStream in = new DataInputStream(fstream);
                BufferedReader br = new BufferedReader(new InputStreamReader(in));
                String strLine;
                Scanner sc = new Scanner(System.in);

                System.out.println("Vvedite ot cifry 1-4:");
                System.out.println("1-po sumvolam:");
                System.out.println("2-po slovam:");
                System.out.println("3-po predlozheniyam:");
                System.out.println("4-po obzacam:");
                System.out.println("5-exit:");
                a = sc.nextInt();

                switch (a) {
                    case 1:
                        while ((strLine = br.readLine()) != null) {
                            String[] splitOut = strLine.split("");
                            for (String token : splitOut)
                                System.out.println(token);
                        }

                        break;
                    case 2:

                        while ((strLine = br.readLine()) != null) {
                            String[] splitOut = strLine.split(" ");
                            for (String token : splitOut)
                                System.out.println(token);
                        }

                        break;
                    case 3:
                        while ((strLine = br.readLine()) != null) {
                            String[] splitOut = strLine.split("\\.");
                            for (String token : splitOut)
                                System.out.println(token);
                        }

                        break;
                    case 4:
                        while ((strLine = br.readLine()) != null) {
                            String[] splitOut = strLine.split("\n");
                            for (String token : splitOut)
                                System.out.println(token);
                        }

                        break;
                    case 5:
                        a = 5;

                        break;
                    default:
                        System.out.println("Takogo elementa net!");
                        break;
                }
                in.close();
            }

        } catch (Exception e){
            System.err.println("Error: " + e.getMessage());
        }


    }
}