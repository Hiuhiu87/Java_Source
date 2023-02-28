//Cho một mảng các số nguyên n phần tử arr.
// Bạn hãy viết chương trình sắp xếp các phần tử của mảng theo thứ tự tăng dần và hiển thị ra màn hình mảng sau khi đã sắp xếp.
//
//Ví dụ nếu bạn nhập n = 6, arr = [5,3,2,6,7,7] như bên dưới:
//
//6
//5 3 2 6 7 7
//Thì màn hình hiển thị lên:
//
//2 3 5 6 7 7

import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap vao n: ");
        int n = input.nextInt();
        int [] a = new int[n];
        System.out.println("Nhap vao mang: ");
        for (int i = 0; i < n; i++) {
            a[i] = input.nextInt();
        }

        for (int i = 0; i < n; i++) { //thuat toan hoan doi vi tri
            for (int j = i + 1; j < n ; j++) {
                if (a[i] > a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
