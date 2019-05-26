package com.neuedu;

import java.util.Scanner;

public class Test0526 {
    public static void main(String[] args) {
        //  for (int i=100;i<=999;i++){
        //     int a = i/100;
        //     int b =i%100/10;
        //     int c = i%10;
        //    if (i==a*a*a+b*b*b+c*c*c){
        //       System.out.println(i);
        //  }
        // }

//
//           int a =89;
//           if (a>=90&&a<=100){
//               System.out.println("成绩为A");
//        }else if (a<90&&a>=60){
//               System.out.println("成绩为B");
//           }else if (a<60){
//               System.out.println("成绩为C");
//           }
//           System.out.println(a);


//        int[] i = {1, 2, 3, 4};
//        int j = 0;
//        for (int a = 0; a < i.length; a++) {
//            for (int b = 0; b < i.length; b++) {
//                for (int c = 0; c < i.length; c++) {
//                    if (i[a]!=i[b]&&i[a]!=i[c]&&i[b]!=i[c]);
//                    j++;
//                }
//            }
//              System.out.println("一共有"+j+"种");
//        }


//        int sum =1;
//        for (int i=1;i<10;i++){
//            sum = sum * i;
//            if (i == 9){
//                System.out.println(sum);
//            }
//        }


//        int sum = 0;
//        for (int i=1;i<=100;i++){
//            if (i%2==0){
//                sum=sum+i;
//            }
//        }
//        System.out.println("1到100的偶数和为"+sum);
//        int sun=0;
//        for (int b=1;b<=100;b++){
//            if (b%2==1){
//                sun=sun+b;
//            }
//        }
//        System.out.println("1到100的奇数和为"+sun);


//        System.out.println("请输入一个数字：");
//        Scanner input=new Scanner(System.in);
//        int a=input.nextInt();
//        int b=a/10000;
//        int c=a/10000%10;
//        int d=a/100%10;
//        int e=a%100/10;
//        int f=a%10;
//        if (b==f&&c==e){
//            System.out.println(a+"是一个回文数");
//        }else System.out.println(a+"不是一个回文数");


//        System.out.println("请输入一个年份：");
//        Scanner input=new Scanner(System.in);
//        int a=input.nextInt();
//        if (a%4==0&&a%100!=0||a%400==0){
//            System.out.println(a+"是闰年");
//        }else
//            System.out.println(a+"是平年");


//        System.out.println("请输入");
//        Scanner input =new Scanner(System.in);
//        String b=input.next();
//        char a=b.charAt(0);
//        if (a>='a'&&a<='z'){
//            a-=32;
//            System.out.println("输出："+a);
//        }else
//            System.out.println("输出："+b);


//        int i=1;
//        int sum=0;
//        while (i<=200){
//            if (i%3==0){
//                sum=sum+i;
//            }
//            i++;
//        }
//        System.out.println(sum);


        System.out.println("请输入：");
        Scanner input =new Scanner(System.in);
        int a=input.nextInt();
        int b=a/100;
        int c=a%100/10;
        int d=a&10;
        if ((b+c+d)%9==0){
            System.out.println(a+"是9的倍数");
        }else
            System.out.println(a+"不是9的倍数");
    }
}