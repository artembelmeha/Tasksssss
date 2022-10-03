package my.r;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        myMethod(1,2, 3,5,6,7,8,10);
        myMethod(1,2);
        myMethod(1,2,4);
    }

//    public static int myMethod(int a, int b, int c) {
    public static int myMethod(int a, int b, int... c) {
//    public static int myMethod(int[] c) {
        return a + b;
    }

}
