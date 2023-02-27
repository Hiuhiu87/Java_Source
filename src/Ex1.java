//Bạn hãy viết chương trình nhập vào từ bàn phím 10 số nguyên và hiển thị ra 10 số vừa nhập.

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] a = new int[10];

        System.out.println("Nhap vao mang a: ");
        for (int i = 0; i < 10; i++) {
            a[i] = input.nextInt();
        }

        System.out.println("Mang a: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
