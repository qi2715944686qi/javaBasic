package com.neuedu.lei;

import java.util.Scanner;

public class GuiGu2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("输入一个数");
        int num = input.nextInt();
        GuiGu ghostValleyConjecture = new GuiGu();
        ghostValleyConjecture.setNnum(num);
        ghostValleyConjecture.guigu();
    }
}
