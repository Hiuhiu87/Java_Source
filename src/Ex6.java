//Cho một mảng các số nguyên n phần tử arr. Bạn hãy viết chương trình tính tổng các số lẻ lớn hơn 0 trong mảng.
//
//Ví dụ nếu bạn nhập:
//
//8
//3 -7 2 5 9 -6 10 12
//Thì màn hình hiển thị lên:
//
//17
//Giải thích: 3 + 5 + 9 = 17.


import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap vao so phan tu trong mang: ");
        int numberOfArr = input.nextInt();

        int []arr = new int[numberOfArr];
        System.out.println("Nhap cac phan tu vao trong mang: ");
        for (int i = 0; i < numberOfArr; i++) {
            arr[i] = input.nextInt();
        }

        int sumOfArr_le = 0;
        for (int i = 0; i < numberOfArr; i++) {
            if (arr[i] > 0 && arr[i] % 2 != 0){
                sumOfArr_le += arr[i];
            }
        }
        System.out.println("Tong cua cac so le trong day la: " + sumOfArr_le);
    }
}
