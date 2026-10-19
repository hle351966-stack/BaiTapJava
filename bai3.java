import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap vao chuoi cac so (cach nhau boi dau cach): ");
        String chuoiNhap = scanner.nextLine();

        String[] phanTuChuoi = chuoiNhap.trim().split("\\s+");
        int soPhanTu = phanTuChuoi.length;
        int tong = 0;

        for (int i = 0; i < soPhanTu; i++) {
            int so = Integer.parseInt(phanTuChuoi[i]);
            tong += so;
        }

        System.out.println("So phan tu: " + soPhanTu + "; Tong: " + tong);
        scanner.close();
    }
}
