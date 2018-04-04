package com.company.lesson5;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int a, b;
        //Блок контроля исключительной ситуации:
        try {
            b=0;
         //Деление на ноль:
            a=100/b;
            System.out.println(a);
        } catch (ArithmeticException e) {
            //Обработка исключительной ситуации:
            System.out.println("Деление на ноль!");
        }
            System.out.println("Выполнение программы продолжено!");

        }


}