//Cho một mảng các số nguyên n phần tử arr.
// Bạn hãy viết chương trình hiển thị những số lớn hơn hoặc bằng 0 và nhỏ hơn hoặc bằng 10 trong mảng arr.
//
//Ví dụ nếu bạn nhập:
//
//8
//3 -7 2 5 9 -6 10 12
//Thì màn hình hiển thị lên:
//
//3 2 5 9 10

import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //khai bao ham nhap so tu ban phim
        System.out.println("Nhap vao so phan tu o trong day: ");
        int NumberOfArr = input.nextInt(); //khai bao bien n: so phan tu trong mang
        int [] arr = new int[NumberOfArr]; //khai bao mang co Number phan tu

        System.out.println("Nhap vao cac phan tu: ");
        for (int i = 0; i < NumberOfArr; i++) { //dung vong lap de nhap cac phan tu vao mang tu ban phim
            arr[i] = input.nextInt();
        }

        System.out.println("Cac so thoa ma dieu kien la: ");
        for (int i = 0; i < NumberOfArr; i++) {
            if (arr[i] >= 0 && arr[i] <= 10) {
                System.out.print(arr[i] + " ");
            }
        }

    }
}
