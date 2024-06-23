package Excersise;

import java.util.Scanner;

public class Excersice06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chuỗi thứ nhất: ");
        String chain1 = scanner.nextLine();

        System.out.println("Nhập chuỗi thứ 2: ");
        String chain2 = scanner.nextLine();

        String concatString = chain1.concat(chain2);

        System.out.println("Chuỗi sau khi nối: " + concatString);
    }
}
