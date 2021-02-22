package com.askerov;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ваше имя");
        String имя = scanner.next();
        System.out.println("Доброе утро"+" "+ имя);
    }
}
