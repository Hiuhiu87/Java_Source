//Cho một mảng các số nguyên n phần tử arr được nhập từ bàn phím.
// Bạn hãy viết chương trình hiển thị ra màn hình những số chẵn trong mảng.
// Ví dụ nếu bạn nhập:
//
//5
//2 7 6 8 9
//Thì màn hình sẽ hiển thị:
//
//2 6 8


import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap vao so phan tu co trong mang: ");
        int Number = input.nextInt();
        int [] arr = new int[Number];

        System.out.println("Nhap cac phan tu vao trong day: ");
        for (int i = 0; i < Number; i++) {
            arr[i] = input.nextInt();
        }

        System.out.println("Nhung so chan trong day la: ");
        for (int i = 0; i < Number; i++) {
            if (arr[i] % 2 == 0){
                System.out.print(arr[i] + " ");
            }
        }
    }
}
