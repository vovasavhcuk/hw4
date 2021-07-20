package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
//        ex1();
//        ex2();
//        ex3();
//        ex4();
//        ex5();
//        ex6();
//        ex7();
//        ex8();
//        ex9();
    }
    public static void ex1() {
        final int SIZE = 35;
        int countOfBooks = 0;
        int[] libr = new int[SIZE];
        for (int i = 0; i < SIZE; i++) {
            libr[i] = (int) (Math.random() * 10000) + 1;
            countOfBooks += libr[i];
        }
        if ((Math.floor(countOfBooks / 100000)) >= 1) {
            System.out.println("В библиотеке шестизначное(или больше) кол-во книг");
        } else {
            System.out.println("В библиотеке не шестизначное(или больше) кол-во книг");
        }
    }
        public static void ex2(){
            final int LENTH = 10;
            int points = 0;
            int[] challengePoints = new int[LENTH];
            for(int i = 0; i<LENTH; i++){
                challengePoints[i] = (int) (Math.random()*100) + 1;
                points += challengePoints[i];
            }
            if(points >= 800){
                System.out.println("Спортсмен проходит в следующий этап");
            }else{
                System.out.println("Спортсмен не проходит в следующий этап");
            }

    }
    public static void ex3() {
        final int LENTH1 = 18;
        int points1 = 0;
        int points2 = 0;
        int points3 = 0;
        int[] challengePoints = new int[LENTH1];
        for (int i = 0; i < 6; i++) {//обязательная
            challengePoints[i] = (int) (Math.random() * 100) + 1;
            points1 += challengePoints[i];
        }
        for (int i = 6; i < 13; i++) {//короткая
            challengePoints[i] = (int) (Math.random() * 100) + 1;
            points2 += challengePoints[i];
        }
        for (int i = 13; i < 18; i++) {//произвольная
            challengePoints[i] = (int) (Math.random() * 100) + 1;
            points3 += challengePoints[i];
        }
        if (points1 > points2 && points1 > points3) {
            System.out.println("Лучше всего участник выступил в обязательной программе");
        }
        if (points2 > points1 && points2 > points3) {
            System.out.println("Лучше всего участник выступил в короткой программе");
        }
        if (points3 > points1 && points3 > points2) {
            System.out.println("Лучше всего участник выступил в произвольной программе");
        }
    }
    public static void ex4(){
        final int LENTH3 = 15;
        int count = 0, numOfPositive = 0;
        double[] arr = new double[LENTH3];
        for(int i = 0; i<LENTH3; i++){
            arr[i] = -100 +(Math.random()*200);
            if(arr[i]>0){
                count ++;
            }else {
                if (numOfPositive < count) {
                    numOfPositive = count;
                    count = 0;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Максимальное колво последовательностоящих положительных чисел = " + count);
    }
    public static void ex5() {
        final int N = 20;
        int count = 0;
        int[] arr = new int[N];
        for (int i = 1; i < N; i++) {
            arr[i] = (int) (Math.random() * 100) + 1;
            if (arr[i] % i == 0 && arr[i] != i) {
                System.out.println("Индекс простого числа = " + i);
                count++;//для проверки
            }
        }
        if (count == 0) {
            System.out.println("В массиве нет простых чисел");
        }
    }
    public static void ex6(){
        final int N = 20;
        int tmp = 0, max = 0, min = 100;
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            tmp = arr[i];
            arr[i] = (int) (Math.random() * 100) + 1;
             while (arr[i] == tmp) {
                arr[i] = (int) (Math.random() * 100) + 1;
            }
        }
        System.out.println(Arrays.toString(arr));
        for(int i = 0; i < 20; i++){
        if(arr[i] > max){
            max = arr[i];
        }
        if(arr[i] < min){
            min = arr[i];
        }
        }
        for(int i = 0; i < 20; i++){
            if(arr[i] == max){
                arr[i] = 0;
            }
            if(arr[i] == min) {
                arr[i] = 0;
            }
        }
        System.out.println("Массив после замены: " + Arrays.toString(arr));
    }
    public static void ex7(){
        final int N = 20;
        int tmp = 0;
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = (int) (Math.random() * 100) + 1;
        }
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < N - 1; i++) {
            tmp = arr[i];
            if(arr[i + 1] == tmp) {
                arr[i] = 0;
            }
        }
        System.out.println("Массив после замены: " + Arrays.toString(arr));
    }
    public static void ex8(){
        final int M = 10;
        int[] arr = new int[M];
        for (int i = 0; i < M; i++) {
            arr[i] = -50 + (int)(Math.random() * 100);
        }
        System.out.println(Arrays.toString(arr));
        //a

//        for (int i = 0; i < M; i++) {
//            if(arr[i] < 0){
//                arr[i] = 0;
//            }
//        }
//        System.out.println(Arrays.toString(arr));
        //b

//       int n = -50 + (int)(Math.random() * 100);
//        for (int i = 0; i < M; i++) {
//            if(arr[i] > n){
//                arr[i] = 0;
//            }
//        }
//        System.out.println(Arrays.toString(arr));
        //c

//        int n1 = -50 + (int)(Math.random() * 100);
//        int n2 = n1 + (int)(Math.random() * 100);
//        for (int i = 0; i < M; i++) {
//            if(arr[i] >= n1 && arr[i] <= n2){
//                arr[i] = 0;
//            }
//        }
    }
    public static void ex9(){
        final int SIZE = 4;
        int[] arr = new int[SIZE];
        for (int i = 0; i < SIZE; i++) {
            arr[i] = -50 + (int)(Math.random() * 100);
        }
        System.out.println(Arrays.toString(arr));
        //a

        for(int i = 0; i < SIZE; i++) {
            if ((arr[i] / 2 == 1) && (i % 2 != 0)) {
                arr[i] = 0;
            }
        }
        System.out.println(Arrays.toString(arr));
        //b

        for(int i = 0; i < SIZE; i++){
            if(arr[i]%3 == 0 || arr[i]%5 == 0){
                arr[i] = 0;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    }



