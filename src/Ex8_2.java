//Cho một mảng các số nguyên n phần tử arr.
//Bạn hãy viết chương trình sắp xếp các phần tử của mảng theo thứ tự tăng dần và hiển thị ra màn hình mảng sau khi đã sắp xếp.

import java.util.Scanner;

public class Ex8_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Nhap vao so n: ");
        int n = input.nextInt();;

        int [] a = new int[n];
        System.out.println("Nhap phan tu vao mang: ");
        for (int i = 0; i < n; i++) {
            a[i] = input.nextInt();
        }

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] < a[j]){
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }

        System.out.println("Cac phan tu trong day do la: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
