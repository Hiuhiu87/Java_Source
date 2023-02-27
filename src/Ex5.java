//Cho một mảng các số nguyên n phần tử arr và số nguyên k được nhập từ bàn phím.
// Bạn hãy viết chương trình hiển thị ra màn hình số phần tử có giá trị bằng k trong mảng arr.
//
//Ví dụ nếu bạn nhập n = 6, arr = [3, 8, 7, 8, 3, 3], k = 3 như bên dưới:
//
//6
//3 8 7 8 3 3
//3
//Thì màn hình hiển thị lên:
//
//3


import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Nhap vao so phan tu trong day: ");
        int Number = input.nextInt(); // tao so phan tu trong mang
        int [] arr = new int[Number]; // tao mang


        System.out.println("Nhap cac phan tu vao mang: ");// nhap mang
        for (int i = 0; i < Number; i++) {
            arr[i] = input.nextInt();
        }

        System.out.println("Nhap vao so can tim xem lap bao nhieu lan: ");
        int Number_Same = input.nextInt();

        System.out.println("Cac phan tu trong mang la: "); // xuat mang
        for (int i = 0; i < Number; i++) {
            System.out.print(arr[i] + " ");
        }

        int count = 0; //tao bien dem lan lap
        for (int i = 0; i < Number; i++) {
            if (arr[i] == Number_Same){
                count++;
            }
        }

        System.out.format("\nSo lan lap cua %d la: %d ", Number_Same, count);

    }
}
