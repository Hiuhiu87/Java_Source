//Cho một mảng các số nguyên n phần tử arr được nhập từ bàn phím. Bạn hãy viết chương trình hiển thị ra phần tử lớn nhất trong mảng.
// Ví dụ nếu bạn nhập n = 5, arr = [2, 7, 6, 8, 9] như bên dưới:
//5
//2 7 6 8 9
//Thì màn hình sẽ hiển thị:
//
//9

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap so phan tu: ");
        int n = input.nextInt();
        int [] a = new int[n];

        System.out.println("Nhap cac phan tu o trong day:");
        for (int i = 0; i < n ; i++) {
            a[i] = input.nextInt();
        }

        System.out.println("Cac phan tu o trong day la:");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }

        int MaxValue = a[0];
        for (int i = 1; i < n ; i++) {
            if (a[i] > MaxValue){
                MaxValue = a[i];
            }
        }
        System.out.println("\nGia Tri Lon Nhat La: " + MaxValue);

    }
}
