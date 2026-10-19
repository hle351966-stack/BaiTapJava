import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Nhap so luong phan tu n: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        
        System.out.println("Nhap cac phan tu cua mang:");
        for (int i = 0; i < n; i++) {
            System.out.print("arr[" + i + "] = ");
            arr[i] = scanner.nextInt();
        }

        
        int max = arr[0]; 
        for (int i = 1; i < n; i++) {
            max = Math.max(max, arr[i]);
        }

        
        System.out.println("Phan tu lon nhat trong mang la: " + max);

        scanner.close();
    }
}
