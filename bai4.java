import java.util.Scanner;

abstract class Hinh {
    public abstract double tinhChuVi();
    public abstract double tinhDienTich();
}

class TamGiac extends Hinh {
    private double a, b, c;

    public TamGiac(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double tinhChuVi() {
        return a + b + c;
    }

    @Override
    public double tinhDienTich() {
        double p = tinhChuVi() / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}

class HinhTron extends Hinh {
    private double r;

    public HinhTron(double r) {
        this.r = r;
    }

    @Override
    public double tinhChuVi() {
        return 2 * Math.PI * r;
    }

    @Override
    public double tinhDienTich() {
        return Math.PI * r * r;
    }
}

class ChunHat extends Hinh {
    private double dai, rong;

    public ChunHat(double dai, double rong) {
        this.dai = dai;
        this.rong = rong;
    }

    @Override
    public double tinhChuVi() {
        return (dai + rong) * 2;
    }

    @Override
    public double tinhDienTich() {
        return dai * rong;
    }
}

public class bai4 {
    public static void main(String[] args) {
        Hinh[] danhSachHinh = new Hinh[3];
        
        danhSachHinh[0] = new TamGiac(3, 4, 5);
        danhSachHinh[1] = new HinhTron(5);
        danhSachHinh[2] = new ChunHat(4, 6);

        for (int i = 0; i < danhSachHinh.length; i++) {
            System.out.println("Hinh thu " + (i + 1) + ":");
            System.out.printf("  Chu vi: %.2f\n", danhSachHinh[i].tinhChuVi());
            System.out.printf("  Dien tich: %.2f\n", danhSachHinh[i].tinhDienTich());
        }
    }
}
