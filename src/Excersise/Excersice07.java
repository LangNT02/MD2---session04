package Excersise;

import java.util.Scanner;

public class Excersice07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chuỗi chính: ");
        String mainChain = scanner.nextLine();

        System.out.println("Nập chuỗi con: ");
        String subString = scanner.nextLine();

        boolean contains = mainChain.contains(subString);

        if (contains) {
            System.out.println("Chuỗi chính có chứa chuỗi con: ");
        } else  {
            System.out.println("Chuô chính không chứa chuỗi con: ");
        }
    }
}
