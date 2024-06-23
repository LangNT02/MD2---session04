package Excersise;

import java.util.Scanner;

public class Excersice05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập kích thước của mảng: ");
        int size = scanner.nextInt();

        int[] Arr = new int[size];

        System.out.println("Nhập các phần tử của mảng: ");
        for (int i = 0; i < size; i++) {
            System.out.println("Pần tử thứ " + (i+1) + ": ");
            Arr[i] = scanner.nextInt();
        }
        System.out.println("Mảng đã nhập: ");
        for (int i = 0; i < size; i++) {
            System.out.println(Arr[i] + " ");
        }
        System.out.println();

        int min = Arr[0];
        for (int i = 1; i < size; i++) {
            if (Arr[i] < min) {
                min = Arr[i];
            }
        }
        System.out.println("Giá trị nhỏ nhất trong mảng: " + min);
    }
}
