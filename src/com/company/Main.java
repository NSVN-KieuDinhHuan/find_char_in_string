package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Nhập chuỗi:");
        String str=input.next();
        System.out.println("Nhập ký tự cần tìm kiếm:");
        String character=input.next();
        int count =0;
        for(int i=0;i<str.length();i++){
         if(str.charAt(i)==character.charAt(0)) {
             count++;
         }
        }
        System.out.println("số lần xuất hiện ký tự "+character+" là :"+count);
    }
}
