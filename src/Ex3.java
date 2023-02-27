//Cho một mảng các số nguyên n phần tử arr được nhập từ bàn phím. Bạn hãy viết chương trình
// hiển thị ra tổng của phần tử đầu tiên và cuối cùng trong mảng arr. Ví dụ nếu bạn nhập n = 5, arr = [2, 7, 6, 8, 9] như bên dưới:
//
//5
//2 7 6 8 9
//Thì màn hình sẽ hiển thị:
//
//11

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap so phan tu o trong mang: ");
        int n = input.nextInt();
        int [] arr = new int[n];


        System.out.println("Nhap vao cac phan tu trong mang: ");
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        int First_Ele = arr[0];
        int Last_Ele = arr[n-1];

        System.out.println("Tong cua 2 phan tu dau va cua la: " + (First_Ele + Last_Ele));

    }
}
