import java.util.Scanner;

public class bai2 {
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

        
        System.out.print("Nhap so nguyen can tim vi tri: ");
        int x = scanner.nextInt();

        
        boolean timThay = false;
        System.out.print("Chi so (vi tri) cua phan tu " + x + " la: ");
        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
                System.out.print(i + " ");
                timThay = true;
            }
        }

        if (!timThay) {
            System.out.print("Khong tim thay so " + x + " trong mang.");
        }
        
        System.out.println();
        scanner.close();
    }
}
