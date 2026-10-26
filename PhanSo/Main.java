
package Bai1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<bai1> ds = new ArrayList<>();

        ds.add(new bai1(1, 2));
        ds.add(new bai1(3, 4));
        ds.add(new bai1(5, 2));
        ds.add(new bai1(2, 3));
        ds.add(new bai1(4, 2));

        System.out.println("Danh sach phan so:");
        for (bai1 p : ds) {
            System.out.println(p);
        }

        bai1 max = ds.get(0);
        for (bai1 p : ds) {
            if (p.soSanh(max) > 0) {
                max = p;
            }
        }
        System.out.println("Phan so lon nhat: " + max);

        bai1 tong = new bai1(0, 1);
        for (bai1 p : ds) {
            tong = tong.cong(p);
        }
        System.out.println("Tong cac phan so: " + tong);

        int dem = 0;
        for (bai1 p : ds) {
            if (!p.laSoNguyen()) {
                dem++;
            }
        }
        System.out.println("So phan so khong phai so nguyen: " + dem);

        bai1 a = new bai1(1, 2);
        bai1 b = new bai1(2, 3);

        System.out.println("Tong: " + a.cong(b));
        System.out.println("Hieu: " + a.tru(b));
        System.out.println("Tich: " + a.nhan(b));
        System.out.println("Thuong: " + a.chia(b));

        if (a.soSanh(b) > 0) {
            System.out.println(a + " lon hon " + b);
        } else if (a.soSanh(b) < 0) {
            System.out.println(a + " nho hon " + b);
        } else {
            System.out.println(a + " bang " + b);
        }
    }
}
