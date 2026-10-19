import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Nhap so luong phan tu n
        System.out.print("Nhap so luong phan tu n: ");
        int n = scanner.nextInt();

        // Khoi tao mang co n phan tu
        int[] arr = new int[n];

        // 2. Nhap cac phan tu cua mang
        System.out.println("Nhap cac phan tu cua mang:");
        for (int i = 0; i < n; i++) {
            System.out.print("arr[" + i + "] = ");
            arr[i] = scanner.nextInt();
        }

        // 3. In mang va tinh tong
        int tong = 0;
        System.out.print("Mang vua nhap la: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
            tong += arr[i]; // Cong don vao tong
        }
        
        System.out.println(); // Xuong dong
        System.out.println("Tong cac phan tu trong mang la: " + tong);
        
        scanner.close();
    }
}
